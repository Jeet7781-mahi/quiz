package com.bootBasic.quizapplication.controller;

import com.bootBasic.quizapplication.model.Question;
import com.bootBasic.quizapplication.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("question")
public class QuestionController {

    @Autowired
    QuestionService questionService;

    @GetMapping("allquestions")
    public ResponseEntity<List<Question>> getallquestions(){
        return questionService.getAllQuestions();
    }

    @GetMapping("category/{category}")
    public ResponseEntity<List<Question>> getQuestionByCategory(@PathVariable String category){
        return questionService.getQuestionByCategory(category);
    }

    @GetMapping("difficulty/{difficulty_level}")
    public List<String> getQuestionsByLevel(@PathVariable String difficulty_level){
        return questionService.getQuestionsByLevel(difficulty_level);
    }
    @PostMapping("add")
    public ResponseEntity<String> addQuestion(@RequestBody Question question){
    return questionService.addQuestion(question);
    }
}
