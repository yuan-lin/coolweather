package com.coolweather.app.db;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import android.database.sqlite.SQLiteOpenHelper;

public class CoolWeatherOpenHelper extends SQLiteOpenHelper {
	public CoolWeatherOpenHelper(Context context, String name,
			CursorFactory factory, int version) {
		super(context, name, factory, version);
		// TODO Auto-generated constructor stub
	}

	/* 省会表格 */
	public static final String CREATE_PROVINCE = "create table Province("
			+ "id integer primary key autoincreament," + "province_name text,"
			+ "province_code text)";

	/* 城市表格 */
	public static final String CREATE_CITY = "create table City("
			+ "id integer primary key autoincreament," + "city_name text,"
			+ "city_code text)";
	/* 县区表格 */
	public static final String CREATE_COUNTRY = "create table Country("
			+ "id integer primary key autoincreament," + "country_name text,"
			+ "countrye_code text)";

	@Override
	public void onCreate(SQLiteDatabase arg0) {
		// TODO Auto-generated method stub
		arg0.execSQL(CREATE_PROVINCE);
		arg0.execSQL(CREATE_CITY);
		arg0.execSQL(CREATE_COUNTRY);

	}

	@Override
	public void onUpgrade(SQLiteDatabase arg0, int arg1, int arg2) {
		// TODO Auto-generated method stub

	}

}
