package com.QuizService.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.QuizService.entities.Quiz;
import com.QuizService.repository.repositories;
import com.QuizService.service.QuestionClient;
import com.QuizService.service.QuizService;

@Service
public class QuizServiceImp implements QuizService{

	@Autowired
	private QuestionClient questionClient;
	
	private repositories repo;
	
	
	public QuizServiceImp(repositories repo) {
		this.repo=repo;
	}

	@Override
	public Quiz add(Quiz quiz) {
		return repo.save(quiz);
	}

	@Override
	public List<Quiz> get() {
		List<Quiz> quizzes=repo.findAll();
		
		List<Quiz> newQuizList=quizzes.stream().map(quiz->{
			quiz.setQuestions(questionClient.getQuestionsOfQuiz(quiz.getId()));
			return quiz;
		}).toList();
		return newQuizList;
		// TODO Auto-generated method stub
		
	}

	@Override
	public Quiz get(Long id) {
		Quiz quiz =repo.findById(id).orElseThrow(()->new RuntimeException("Quiz not found"));
		quiz.setQuestions(questionClient.getQuestionsOfQuiz(quiz.getId()));
		return quiz;
	}

}
