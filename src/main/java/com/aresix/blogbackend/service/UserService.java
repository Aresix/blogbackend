package com.aresix.blogbackend.service;

import com.aresix.blogbackend.pojo.User;
import com.aresix.blogbackend.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    UserDao userDao;

    public boolean isExist(String username) {
        User user = getByName(username);
        return null != user;
    }

    public User getByName(String username) {
        return userDao.findByUsername(username);
    }

    public User getById(int id) {
        return userDao.findById(id);
    }

    // 通过用户名及密码查询并获得对象
    public User get(String username, String password) {
        return userDao.getByUsernameAndPassword(username, password);
    }

    public void add(User user) {
        userDao.save(user);
    }

    public void update(User user) {
        String avatar = user.getAvatar();
        String nickname = user.getNickname();
        String content = user.getContent();
        String username = user.getUsername();
        userDao.updateInfo(avatar, nickname, content, username);
    }
}
