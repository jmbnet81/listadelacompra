package com.example.jmbnet.listadelacompra;

import android.app.Application;
import android.database.sqlite.SQLiteDatabase;
import android.support.v4.app.ActivityCompat;

/**
 * Created by root on 2/14/17.
 */
public class MyBaseClass extends Application {
    public DatabaseHandler mDB;
    private static MyBaseClass singleton;

    @Override
    public void onCreate() {
        super.onCreate();
        if (mDB == null)
            mDB = new DatabaseHandler(this);

    }
}
