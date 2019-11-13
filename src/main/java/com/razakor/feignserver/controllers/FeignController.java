package com.razakor.feignserver.controllers;

import com.razakor.feignserver.clients.QuestionClient;
import com.razakor.feignserver.dto.Question;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class FeignController {

    private final QuestionClient questionClient;

    public FeignController(QuestionClient questionClient) {
        this.questionClient = questionClient;
    }

    @GetMapping(value = "/findAllQuestions")
    public List<Question> getAllQuestions() {
        List<Question> questions = questionClient.getQuestions();
        System.out.println(questions);
        return questions;
    }
}