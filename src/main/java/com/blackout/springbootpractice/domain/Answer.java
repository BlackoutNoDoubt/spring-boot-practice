package com.blackout.springbootpractice.domain;

public class Answer {
    private static int counter;
    private int id;
    private String answer;

    public Answer(String answer) {
        this.id = ++counter;
        this.answer = answer;
    }

    public int getId() { return id; }

    public String getAnswer() { return answer; }

    @Override
    public String toString() {
        return "Answer{" +
                "id=" + id +
                ", answer='" + answer + '\'' +
                '}';
    }
}
