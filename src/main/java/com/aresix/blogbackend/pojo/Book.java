package com.aresix.blogbackend.pojo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "book")
@JsonIgnoreProperties({"handler", "hibernateLazyInitializer"})
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @ManyToOne
    @JoinColumn(name = "cid")
    // 目的：把category对象的id属性作为cid进行查询
    private Category category;

    private String cover;
    private String title;
    private String author;
    private String year;
    private String press;
    private String price;
    private float grade;

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getPress() {
        return press;
    }

    public void setPress(String press) {
        this.press = press;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public float getGrade() {
        return grade;
    }

    public void setGrade(float grade) {
        this.grade = grade;
    }

    public int getCnt_num() {
        return cnt_num;
    }

    public void setCnt_num(int cnt_num) {
        this.cnt_num = cnt_num;
    }

    int cnt_num;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public String getCover() {
        return cover;
    }

    public void setCover(String cover) {
        this.cover = cover;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

//    @ManyToMany(cascade = CascadeType.ALL)
//    @JoinTable(name = "likebook",
//            inverseJoinColumns = @JoinColumn(name = "bid"),
//            joinColumns = @JoinColumn(name = "uid"))
//    private List<User> likerlist;
//
//    public List<User> getLikerlist() {
//        return likerlist;
//    }
//
//    public void setLikerlist(List<User> likerlist) {
//        this.likerlist = likerlist;
//    }
}
