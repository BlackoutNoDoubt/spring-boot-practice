package com.blackout.springbootpractice.service;

import com.blackout.springbootpractice.dao.QuestionDAO;
import com.blackout.springbootpractice.domain.Question;
import org.springframework.stereotype.Component;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

@Component
public class QuestionService {
    private final QuestionDAO questionDAO;

    public QuestionService(QuestionDAO questionDAO) {
        this.questionDAO = questionDAO;
    }

    /**
     *
     * @return Возвращает все вопросы в том порядке, в котором они записаны в файл.
     * @throws FileNotFoundException
     * @throws IOException
     */
    public List<Question> getAllQuestions() throws IOException {
        return questionDAO.readAllQuestions();
    }

    /**
     *
     * @return Возвращает один вопрос в порядке очереди.
     */
    public Question getQuestion() {
        return questionDAO.readOneQuestion();
    }
}
