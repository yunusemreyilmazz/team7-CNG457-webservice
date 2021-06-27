package com.example.team7CNG457webservice.controller;


import com.example.team7CNG457webservice.entity.Comments;
import com.example.team7CNG457webservice.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * This is a controller for CommentController
 */
@RestController
public class CommentController {
    @Autowired
    CommentService commentService;


    /**
     * Postmapping for creating new Comment in the Database.
     * And initializing our URL as "/addComment".
     * Then specifying our method saveComment.
     * In the method, @RequestBody declares the body of the request that means and consider as  Comment object.
     * @param c is Comment type object that we want to add to our database.
     * @return calling "saveComments" method from commentService class to save new comment object in the database.
     */
    @PostMapping("/addComment")
    public Comments saveComment(@RequestBody Comments c){
        return commentService.saveComments(c);
    }



    /**
     * Getmapping for reading elements from Database.
     * And initializing our URL as "/getComment" which want {id} to search for.
     * @param id - the seaching value for Comment object in the database
     * @return calling "getComments" method from commentService class to return a object from database.
     */
    @GetMapping("/getComment")
    public Comments getComments(@PathVariable int id ){
        return commentService.getComments(id);
    }



}
