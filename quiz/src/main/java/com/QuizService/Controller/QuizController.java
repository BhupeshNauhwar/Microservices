package com.QuizService.Controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.QuizService.service.QuizService;
import com.QuizService.entities.Quiz;
@RestController
@RequestMapping("/quiz")
public class QuizController {

	private QuizService quizService;
	
	public QuizController(QuizService quizService) {
		this.quizService=quizService;
	}
	@PostMapping("/add")
	public Quiz create(@RequestBody Quiz quiz) {
		return quizService.add(quiz);
	}
	
	@GetMapping("/get")
	public List<Quiz> get(){
		return quizService.get();
	}
	
	@GetMapping("/get/{id}")
	public Quiz getOne(@PathVariable Long id){
		return quizService.get(id);
	}
}
