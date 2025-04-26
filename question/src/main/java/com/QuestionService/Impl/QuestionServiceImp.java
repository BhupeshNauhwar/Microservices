package com.QuestionService.Impl;

import java.util.List;

import com.QuestionService.entties.Questions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.QuestionService.service.QuestionService;
import com.QuestionService.Repository.QuestiosRepository;
@Service
public class QuestionServiceImp implements QuestionService {

	@Autowired
	private QuestiosRepository questiosRepository;
	@Override
	public Questions create(Questions question) {
		// TODO Auto-generated method stub
		return questiosRepository.save(question);
	}

	@Override
	public List<Questions> get() {
		// TODO Auto-generated method stub
		return questiosRepository.findAll();
	}

	@Override
	public Questions getOne(Long id) {
		// TODO Auto-generated method stub
		return questiosRepository.findById(id).orElseThrow(()->new RuntimeException("Question not found"));
	}

	@Override
	public List<Questions> getQuestionsOfQuiz(Long quizId) {
		
		return questiosRepository.findByQuizId(quizId);
	}

}
