package com.blackout.springbootpractice.dao;

import com.blackout.springbootpractice.domain.Answer;
import org.springframework.stereotype.Component;

import java.io.*;
import java.util.Scanner;

@Component
public class AnswerDAO {
    private Answer answer;

    public AnswerDAO() {
    }

    /**
     * Записывает в файл ответ на вопрос.
     * @return Возвращает записанный в файл ответ на вопрос.
     * @throws IOException
     */
    public Answer setAnswer() throws IOException {
        String s;
        OutputStream file = new FileOutputStream("C:\\Users\\Blackout\\IdeaProjects\\spring-boot-practice\\src\\main\\resources\\questions.csv", true);
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(file));
        Scanner scanner = new Scanner(System.in);

        s = scanner.nextLine();
        writer.newLine();
        writer.write(s);

        writer.close();

        return this.answer = new Answer(s);
    }
}
