package com.QuestionService.service;

import java.util.List;

import com.QuestionService.entties.Questions;

public interface QuestionService {

	Questions create(Questions question);
	
	List<Questions> get();
	
	Questions getOne(Long id);
	
	List<Questions> getQuestionsOfQuiz(Long quizId);
}
