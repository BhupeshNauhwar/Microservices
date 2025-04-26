package com.QuizService.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.QuizService.entities.Quiz;

public interface repositories extends JpaRepository<Quiz, Long>{

}
