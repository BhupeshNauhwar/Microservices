package com.QuizService.service;

import java.util.List;

import com.QuizService.entities.Quiz;

public interface QuizService {

	Quiz add(Quiz quiz);
	List<Quiz> get();
	Quiz get(Long id);
}
