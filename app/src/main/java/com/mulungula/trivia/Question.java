package com.mulungula.trivia;

public class Question {
    private String question;
    private int correctAnswerNumber;
    private String wrongAnswer1;
    private String wrongAnswer2;
    private String wrongAnswer3;


    public Question() {
    }

    public Question(String question, int correctAnswerNumber, String wrongAnswer1, String wrongAnswer2, String wrongAnswer3) {
        this.question = question;
        this.correctAnswerNumber = correctAnswerNumber;
        this.wrongAnswer1 = wrongAnswer1;
        this.wrongAnswer2 = wrongAnswer2;
        this.wrongAnswer3 = wrongAnswer3;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public void setWrongAnswer1(String wrongAnswer1) {
        this.wrongAnswer1 = wrongAnswer1;
    }

    public void setWrongAnswer2(String wrongAnswer2) {
        this.wrongAnswer2 = wrongAnswer2;
    }

    public void setWrongAnswer3(String wrongAnswer3) {
        this.wrongAnswer3 = wrongAnswer3;
    }

    public void setCorrectAnswerNumber(int correctAnswerNumber) {
        this.correctAnswerNumber = correctAnswerNumber;
    }

    public String getQuestion() {
        return question;
    }

    public int getCorrectAnswerNumber() {
        return correctAnswerNumber;
    }

    public String getWrongAnswer1() {
        return wrongAnswer1;
    }

    public String getWrongAnswer2() {
        return wrongAnswer2;
    }

    public String getWrongAnswer3() {
        return wrongAnswer3;
    }
}
