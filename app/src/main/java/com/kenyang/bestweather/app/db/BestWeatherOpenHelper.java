package com.kenyang.bestweather.app.db;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

/**
 * Created by Kenyang on 2016/3/11.
 */

public class BestWeatherOpenHelper {
    /*
     * province table create
     */
    public static final String CREATE_PROVINCE = "create table Province ("
            + "id integer primary key autoincrement,"
            + "province_name text,"
            + "province_code text)";

    /*
     * city table create
     */


    public  static final String CREATE_CITY = "create table City("
            + "id integer primary key autoincrement,"
            + "city_name text,"
            + "city_code text,"
            + "province_id integer)";

    /*
     * county table create
     */
    public static final String CREATE_COUNTY = "create table county("
            + " id integer primary key autoincrement,"
            + " county_name text,"
            + " county_code text,"
            + " city_id integer)";

    public BestWeatherOpenHelper(Context context, String name, SQLiteDatabase.CursorFactory factory, int version){
            super(context,name,factory,version);
    }

    @Override
    public void onCreate(SQLiteDatabase db){
        db.execSQL(CREAT_PROVINCE);
        db.execSQL(CREATE_CITY);
        db.execSQL(CREATE_COUNTY);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion){

    }
}
