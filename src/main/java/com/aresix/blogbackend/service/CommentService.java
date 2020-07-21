package com.aresix.blogbackend.service;

import com.aresix.blogbackend.dao.CommentDao;
import com.aresix.blogbackend.pojo.Comment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommentService {
    @Autowired
    CommentDao commentDao;

    public List<Comment> list() {
        Sort sort = Sort.by(Sort.Direction.ASC, "tid");
        return commentDao.findAll(sort);
    }

    public List<Comment> Search(String keywords) {
        return commentDao.findAllByBookLikeOrBodyLike('%' + keywords + '%', '%' + keywords + '%');
    }
}
