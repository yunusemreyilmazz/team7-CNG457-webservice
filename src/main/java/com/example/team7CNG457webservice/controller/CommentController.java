package com.example.team7CNG457webservice.controller;


import com.example.team7CNG457webservice.entity.Comments;
import com.example.team7CNG457webservice.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CommentController {
    @Autowired
    CommentService commentService;

    @PostMapping("/addComment")
    public Comments saveComment(@RequestBody Comments c){
        return commentService.saveComments(c);
    }




    @GetMapping("/getComment")
    public Comments getComments(@PathVariable int id ){
        return commentService.getComments(id);
    }



}
