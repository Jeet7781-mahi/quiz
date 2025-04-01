package com.bootBasic.quizapplication.dao;

import com.bootBasic.quizapplication.model.Question;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface QuestionDao extends JpaRepository<Question,Integer> {
    List<Question> findByCategory(String category);

   
@Query(value = "Select * From question q Where q.category=:category LIMIT :numQ ",nativeQuery = true)
    List<Question> findRandomQuestionsByCategory(String category, int numQ);

    List<String> findByDifficultyLevel(String difficultyLevel);
}
