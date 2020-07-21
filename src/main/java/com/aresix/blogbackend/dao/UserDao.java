package com.aresix.blogbackend.dao;

import com.aresix.blogbackend.pojo.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

public interface UserDao extends JpaRepository<User, Integer> {
    User findByUsername(String username);

    User findById(int id);

    User getByUsernameAndPassword(String username, String password);

    @Transactional
    @Modifying
    @Query(nativeQuery = true, value = "update user set avatar = :avatar, nickname = :nickname, content = :content where username = :username")
    void updateInfo(@Param("avatar") String avatar,
                    @Param("nickname") String nickname,
                    @Param("content") String content,
                    @Param("username") String username);
}
