package Db;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class DbHelper extends SQLiteOpenHelper {

    //-Создание переменных

    public static final int DATABASES_VERSION = 1;
    public static final String DATABASES_NAME = "contactDb";
    public static final String TABLE_CONTACTS = "contacts";

    public static final String KEY_FIRST_NAME = "firstName";
    public static final String KEY_SECOND_NAME = "secondName";
    public static final String KEY_MIDDLE_NAME = "middleName";
    public static final String KEY_DATE_BIRTH = "dateBirth";




    public DbHelper(@Nullable Context context) {
        super(context, DATABASES_NAME, null, DATABASES_VERSION);
    }

    @Override
    //-Таблица
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.execSQL("create table " + TABLE_CONTACTS + "("
                + KEY_FIRST_NAME+ " integer primary key," + KEY_SECOND_NAME + " text," + KEY_MIDDLE_NAME + " text," +
                KEY_DATE_BIRTH + " text" + ")");


    }

    @Override
    //-Удаление таблицы
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
        sqLiteDatabase.execSQL("drop table if exists " + TABLE_CONTACTS);

        onCreate(sqLiteDatabase);


    }
}