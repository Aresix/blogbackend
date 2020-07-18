package com.aresix.blogbackend.controller;

import com.aresix.blogbackend.service.UserService;
import com.aresix.blogbackend.pojo.User;
import com.aresix.blogbackend.result.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.HtmlUtils;

import java.util.Objects;

@Controller
//@RestController
public class LoginController {
    @Autowired
    UserService userService;

    @CrossOrigin
    @PostMapping(value = "api/login")
    @ResponseBody
    public Result login(@RequestBody User requestUser) {
        // 对HTML标签进行转义，防止XSS攻击
        String username = requestUser.getUsername();
        username = HtmlUtils.htmlEscape(username);

        User user = userService.get(username, requestUser.getPassword());
        if (null == user) {
            String message = "账号密码错误";
            // TODO: 判断具体是用户名不存在还是密码错误
            System.out.println("test");
            return new Result(400);
        } else {
            return new Result(200);
        }
    }
}
