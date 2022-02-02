package com.blackout.springbootpractice.service;

import com.blackout.springbootpractice.dao.AnswerDAO;
import com.blackout.springbootpractice.domain.Answer;
import org.springframework.stereotype.Component;
import java.io.IOException;

@Component
public class AnswerService {
    private final AnswerDAO answerDAO;

    public AnswerService (AnswerDAO answerDAO) {
        this.answerDAO = answerDAO;
    }

    /**
     * Вызывает внутри себя метод класса AnswerDAO,
     * записывающий ответ на вопрос в файл и возвращающий этот ответ.
     * @return Возвращает ответ на вопрос.
     * @throws IOException
     */
    public Answer writeAnswer() throws IOException {
        return answerDAO.setAnswer();
    }
}
