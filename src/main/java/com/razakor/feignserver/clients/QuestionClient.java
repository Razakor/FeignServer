package com.razakor.feignserver.clients;

import com.razakor.feignserver.config.FeignConfig;
import com.razakor.feignserver.dto.Question;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient(url = "localhost:8081", name = "QUESTION-CLIENT", configuration = FeignConfig.class)
public interface QuestionClient {

    @GetMapping(value = "/questions")
    List<Question> getQuestions();
}