package com.aresix.blogbackend.controller;

import com.aresix.blogbackend.pojo.User;
import com.aresix.blogbackend.service.UserService;
import com.aresix.blogbackend.util.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.Objects;
import java.util.logging.Logger;

@RestController
@CrossOrigin
public class AdminController {
    @Autowired
    // 用户信息部分
            UserService userService;

    @CrossOrigin
    @GetMapping("/api/users/{username}")
    public User getUserInfo(@PathVariable("username") String username) throws Exception {
        if (userService.isExist(username)) {
            User user = userService.getByName(username);
            if (user.getNickname() == null) {
                user.setNickname(StringUtils.getRandomString(6));
                userService.add(user);
            }
            return userService.getByName(username);
        } else {
            return null;
        }
    }

    @CrossOrigin
    @PostMapping("/api/users/{username}")
    public User Update(@PathVariable("username") String username, @RequestBody User user) throws Exception {
        userService.update(user);
        return user;
    }

    // 上传头像
    @CrossOrigin
    @PostMapping("api/users/avatar")
    public String coversUpload(MultipartFile file) throws Exception {
        String folder = "F:/ECNU/DBMS/project/blogbackend/src/main/resources/img/avatars";
        File imageFolder = new File(folder);
        File f = new File(imageFolder, StringUtils.getRandomString(4) + Objects.requireNonNull(file.getOriginalFilename())
                .substring(file.getOriginalFilename().length() - 4));
        if (!f.getParentFile().exists())
            f.getParentFile().mkdirs();
        try {
            file.transferTo(f);
            System.out.println("Ares？！" + file.getName());
            return "http://localhost:8443/api/file/avatars/" + f.getName();
        } catch (IOException e) {
            e.printStackTrace();
            return "";
        }
    }
}
