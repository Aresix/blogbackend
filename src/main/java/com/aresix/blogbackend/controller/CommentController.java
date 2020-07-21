package com.aresix.blogbackend.controller;

import com.aresix.blogbackend.pojo.Comment;
import com.aresix.blogbackend.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin
public class CommentController {
    @Autowired
    CommentService commentService;

    @CrossOrigin
    @GetMapping("/api/comments")
    public List<Comment> list() throws Exception {
        return commentService.list();
    }
}
