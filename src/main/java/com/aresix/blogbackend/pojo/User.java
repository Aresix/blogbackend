package com.aresix.blogbackend.pojo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.List;

// 建立对数据库的映射
@Entity
@Table(name = "user")
@JsonIgnoreProperties({"handler", "hibernateLazyInitializer"})

public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    private String username;
    private String password;
    private String nickname;
    private String content;
    private String avatar;

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

//    @ManyToMany(cascade = CascadeType.ALL)
//    @JoinTable(name = "likebook",
//            inverseJoinColumns = @JoinColumn(name = "uid"),
//            joinColumns = @JoinColumn(name = "bid"))
//    private List<Book> booklist;
//
//    public List<Book> getBooklist() {
//        return booklist;
//    }
//
//    public void setBooklist(List<Book> booklist) {
//        this.booklist = booklist;
//    }
}
