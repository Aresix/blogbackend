package com.aresix.blogbackend.dao;

import com.aresix.blogbackend.pojo.Book;
import com.aresix.blogbackend.pojo.Category;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BookDao extends JpaRepository<Book, Integer> {
    // 把category对象的id属性作为cid进行查询
    List<Book> findAllByCategory(Category category);

    List<Book> findAllByTitleLikeOrAuthorLike(String keyword1, String keyword2);
    // TODO: 可以考虑加入类别筛选 比如悬疑、推理、恋爱
    // TODO: 目前不考虑上述提到的种类 仅按日期分类
}
