package com.example.team7CNG457webservice.service;

import com.example.team7CNG457webservice.entity.Comments;
import com.example.team7CNG457webservice.repository.CommentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CommentService {

    @Autowired
    CommentRepository commentRepository;


    public Comments saveComments(Comments c){
        return commentRepository.save(c);
    }

    public Comments getComments(int id){
        return commentRepository.findById(id).orElse(null);
    }
}
