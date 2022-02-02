package com.blackout.springbootpractice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.io.IOException;

@Service
public class GeneralService {
    private final QuestionService questionService;
    private final AnswerService answerService;

    @Autowired
    public GeneralService(QuestionService questionService, AnswerService answerService) {
        this.questionService = questionService;
        this.answerService = answerService;
    }

    /**
     * Основной сервис, объединяющий QuestionService и AnswerService.
     * @throws IOException
     */
    @Autowired
    public void start() throws IOException {
        System.out.println(questionService.getAllQuestions());

        System.out.println(questionService.getQuestion());
        System.out.println(answerService.writeAnswer());

        System.out.println(questionService.getQuestion());
        System.out.println(answerService.writeAnswer());

        System.out.println(questionService.getQuestion());
        System.out.println(answerService.writeAnswer());
    }

}
