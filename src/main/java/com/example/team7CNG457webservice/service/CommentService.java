package com.example.team7CNG457webservice.service;

import com.example.team7CNG457webservice.entity.Comment;
import com.example.team7CNG457webservice.repository.CommentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CommentService {
    @Autowired
    CommentRepository commentRepository;

    public Comment saveComment(Comment comment){ //Writes the data to Comment table
        return commentRepository.save(comment);
    }

    public Comment getComment(int id){ //Gets the data with given id from Comment table
        return commentRepository.findById(id).orElse(null);
    }
}
