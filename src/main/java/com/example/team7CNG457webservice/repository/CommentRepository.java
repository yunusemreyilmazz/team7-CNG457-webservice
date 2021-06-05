package com.example.team7CNG457webservice.repository;

import com.example.team7CNG457webservice.entity.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommentRepository extends JpaRepository<Comment,Integer> {
}
