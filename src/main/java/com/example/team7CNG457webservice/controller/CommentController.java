package com.example.team7CNG457webservice.controller;

import com.example.team7CNG457webservice.entity.Comment;
import com.example.team7CNG457webservice.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class CommentController {
    @Autowired
    CommentService commentService;

    @PostMapping("/addcomment")
    public Comment saveComment(@RequestBody Comment comment){
        return commentService.saveComment(comment);
    }

    @GetMapping("/getcomment/{id}")
    public Comment getComment(@PathVariable int id){ //Here we are wanting PathVariable {id}
        return commentService.getComment(id);
    }
}
