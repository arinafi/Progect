package Db;

import android.annotation.SuppressLint;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import java.util.ArrayList;
import java.util.List;

import Db.DbConstant;
import Db.DbHelper;

public class DbManger {
    private Context context;
    private DbHelper dbHelper;
    private SQLiteDatabase db;

    public DbManger(Context context) {
        this.context= context;
        dbHelper= new DbHelper(context);
    }

    public void openDb(){
        db= dbHelper.getWritableDatabase();
    }
    public void insertToDb(String fName,String sName){
        ContentValues cv = new ContentValues();
        cv.put(DbConstant.COLUMN_SECOND_NAME,sName);
        cv.put(DbConstant.COLUMN_FIRST_NAME,fName);
        cv.put(DbConstant.COLUMN_MIDDLE_NAME,fName);
        cv.put(DbConstant.DATE_OF_BIRTH,fName);
        db.insert(DbConstant.TABLE_NAME,null,cv);
    }

    public List<String>getFromDb(){
        List<String>writerList = new ArrayList<>();
        Cursor cursor = db.query(DbConstant.TABLE_NAME,null,null,null,null,null,null);
        while (cursor.moveToNext()){
            @SuppressLint("Range") String fname = cursor.getString(cursor.getColumnIndex(DbConstant.COLUMN_FIRST_NAME));
            writerList.add(fname);
        }
        cursor.close();
        return writerList;
    }

    public void closeDb(){
        dbHelper.close();
    }
}
