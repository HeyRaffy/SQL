package com.example.acer.sql;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.view.View;

public class DBHelper extends SQLiteOpenHelper {

    final static String DBNAME = "Students.db";
    final static int VER = 1;
    final static String TABLE = "Grade";
    public DBHelper(Context context) {
        super(context, DBNAME, null, VER);
        SQLiteDatabase db = this.getWritableDatabase();
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String createTable = "CREATE TABLE Grade (ID INTEGER PRIMARY KEY AUTO INCREMENT, FirstName TEXT, LastName TEXT, LabGrade INTEGER)";
        db.execSQL(createTable);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        String deleteTable = "DROP TABLE IF EXISTS Grade";
        db.execSQL(deleteTable);
    }

    public boolean insert(String fname, String lname, int lgrade){
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues cv = new ContentValues();
        cv.put("fn", fname);
        cv.put("ln", lname);
        cv.put("lg", lgrade);
        db.insert(TABLE, null, cv);
        return true;
    }

    public void addRecord(View v){

    }
}
