package com.QuestionService.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.QuestionService.entties.Questions;

public interface QuestiosRepository extends JpaRepository<Questions, Long> {

	
	List<Questions> findByQuizId(Long quizId);

}
