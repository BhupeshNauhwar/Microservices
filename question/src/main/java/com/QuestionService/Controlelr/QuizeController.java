package com.QuestionService.Controlelr;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.QuestionService.Repository.QuestiosRepository;
import com.QuestionService.entties.Questions;
import com.QuestionService.service.QuestionService;

@RestController
@RequestMapping("/question")
public class QuizeController {

	@Autowired
	private QuestionService questionService;
	
	@PostMapping("/add")
	public Questions create (@RequestBody Questions questions) {
		
		return questionService.create(questions);
	}
	@GetMapping("/get")
	public List<Questions> getAll(){
		return questionService.get();
	}
	@GetMapping("/get/{id}")
	public Questions getOne(@PathVariable Long id){
		return questionService.getOne(id);
	}
	@GetMapping("/quiz/{quizId}")
	public List<Questions> getQuestionsOfQuiz(@PathVariable Long quizId){
		return questionService.getQuestionsOfQuiz(quizId);
	}
	
}
