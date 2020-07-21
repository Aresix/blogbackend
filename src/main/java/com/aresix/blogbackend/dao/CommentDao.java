package com.aresix.blogbackend.dao;

import com.aresix.blogbackend.pojo.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CommentDao extends JpaRepository<Comment, Integer> {

//    List<Comment> findAllByCom_id(int tid);

    List<Comment> findAllByBookLikeOrBodyLike(String keyword1, String keyword2);
}
