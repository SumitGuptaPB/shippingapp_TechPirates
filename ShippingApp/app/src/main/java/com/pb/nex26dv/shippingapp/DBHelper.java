package com.pb.nex26dv.shippingapp;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by NEX9ZKA on 12/7/2016.
 */

public class DBHelper extends SQLiteOpenHelper{
    private static final int DATABASE_VERSION = 1;
    private static final String DATABASE_NAME = "contacts.db";
    private static final String TABLE_NAME = "contacts";
    private static final String COLUMN_ID = "id";
    private static final String COLUMN_NAME = "name";
    private static final String COLUMN_EMAIL = "email";
    private static final String COLUMN_Mobile = "mobile";
    private static final String COLUMN_PASS = "pass";

    SQLiteDatabase db;

    public DBHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    private static final String TABLE_CREATE = "create table " + TABLE_NAME + " (id integer primary key not null , " +
            "name text not null, email text not null, mobile text not null, pass text not null);";


    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(TABLE_CREATE);
        this.db = db;
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        String query = "DROP table if exists " + TABLE_NAME + " ;";
        db.execSQL(query);

        this.onCreate(db);
    }

    public void insertContact(Contact c) {
        db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();

        String query = "SELECT * FROM contacts";

        Cursor cursor = db.rawQuery(query, null);
        int count = cursor.getCount();

        contentValues.put(COLUMN_ID, count);
        contentValues.put(COLUMN_NAME, c.getName());
        contentValues.put(COLUMN_EMAIL, c.getEmail());
        contentValues.put(COLUMN_Mobile, c.getMobile());
        contentValues.put(COLUMN_PASS, c.getPass());

        db.insert(TABLE_NAME, null, contentValues);
        db.close();
    }

    public String searchPass(String email) {
        db = this.getReadableDatabase();

        String query = "select email, pass from " + TABLE_NAME;
        Cursor cursor = db.rawQuery(query, null);

        String mail, password;
        password = "not found";
        if (cursor.moveToFirst()) {
            do {
                mail = cursor.getString(0);


                if (mail.equals(email)) {
                    password = cursor.getString(1);
                    break;
                }
            } while (cursor.moveToNext());
        }
        return password;
    }
}
