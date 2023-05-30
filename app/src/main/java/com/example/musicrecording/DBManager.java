package com.example.musicrecording;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DBManager extends SQLiteOpenHelper {
    public DBManager(Context context){
        super(context, "MusicDiary", null, 1);
    }
    public void onCreate(SQLiteDatabase db){
        db.execSQL("create table music(month int,day int,title text,singer text,mood text,url text,diary text,cover img);");
    }
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion){

    }
}