package com.mulungula.trivia;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.mulungula.trivia.QuizContract.*;

public class QuizDbHelper extends SQLiteOpenHelper {
    private static final String DATABASE_NAME = "Quiz.db";
    private static final int DATABASE_VERSION = 1;

    private SQLiteDatabase db;

    public QuizDbHelper(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        this.db = db;

        final String SQL_CREATE_QUESTIONS_TABLE = "CREATE TABLE "+
                questionsTable.TABLE_NAME+" (" +

                questionsTable._ID+" INTEGER PRIMARY KEY AUTOINCREMENT," +
                questionsTable.COLUMN_QUESTION+" TEXT NOT NULL, " +
                questionsTable.COLUMN_CORRECT_ANSWER3+" INTEGER NOT NULL, "+
                questionsTable.COLUMN_WRONG_ANSWER1+" TEXT NOT NULL, "+
                questionsTable.COLUMN_WRONG_ANSWER2+" TEXT NOT NULL, "+
                questionsTable.COLUMN_WRONG_ANSWER3+" TEXT NOT NULL) ";
        db.execSQL(SQL_CREATE_QUESTIONS_TABLE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS "+ questionsTable.TABLE_NAME);
        onCreate(db);
    }
}
