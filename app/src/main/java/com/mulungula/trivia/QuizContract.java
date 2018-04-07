package com.mulungula.trivia;

import android.provider.BaseColumns;

public final class QuizContract {

    private QuizContract() {
    }

    public static class questionsTable implements BaseColumns{
        public static final String TABLE_NAME = "quiz_questions";
        public static final String COLUMN_QUESTION = "question";
        public static final String COLUMN_CORRECT_ANSWER3 = "correct_answer_number";
        public static final String COLUMN_WRONG_ANSWER1 = "wrongAnswer1";
        public static final String COLUMN_WRONG_ANSWER2 = "wrongAnswer2";
        public static final String COLUMN_WRONG_ANSWER3 = "wrongAnswer3";


    }
}
