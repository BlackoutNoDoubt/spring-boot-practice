package com.blackout.springbootpractice.dao;

import com.blackout.springbootpractice.domain.Question;
import org.springframework.stereotype.Component;
import java.io.*;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

@Component
public class QuestionDAO {
    private final static LinkedList<Question> list = new LinkedList<>(); //список, в который попадут считанные из файла вопросы.
    private final static Queue<Question> queue = list;  //очередь, из которой удобно доставать по одному вопросу в правильном порядке.

    public QuestionDAO() {
    }

    /**
     *
     * @return Возвращает список всех вопросов, считанных из файла.
     * @throws FileNotFoundException
     * @throws IOException
     */
    public List<Question> readAllQuestions() throws IOException {

        InputStream file = QuestionDAO.class.getResourceAsStream("/questions.csv");
        BufferedReader reader = new BufferedReader(new InputStreamReader(file));
        String line;

        while ((line = reader.readLine()) != null) {
            list.add(new Question(line));
        }
        reader.close();
        return list;
    }

    /**
     *
     * @return Возвращает один считанный из файла вопрос в порядке очереди.
     */
    public Question readOneQuestion() {
        return queue.poll();
    }
}
