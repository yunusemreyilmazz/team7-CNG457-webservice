package com.example.team7CNG457webservice.repository;


import com.example.team7CNG457webservice.entity.Comments;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommentRepository extends JpaRepository <Comments,Integer> {

}
