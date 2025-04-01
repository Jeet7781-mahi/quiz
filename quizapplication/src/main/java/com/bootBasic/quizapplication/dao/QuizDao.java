package com.bootBasic.quizapplication.dao;

import com.bootBasic.quizapplication.model.Quiz;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface QuizDao extends JpaRepository<Quiz, Integer> {

}
