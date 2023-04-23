package Db;

public class DbConstant {
    //-Создание переменных
    public static final String TABLE_NAME = "students_table";
    public static final String _ID = "_id";
    public static final String COLUMN_FIRST_NAME = "firstName";
    public static final String COLUMN_SECOND_NAME = "secondName";
    public static final String COLUMN_MIDDLE_NAME = "middleName";
    public static final String DATE_OF_BIRTH = "dateOfBirth";
    public static final String ID_GROUP = "idGroup";
    public static final String DATABASE_NAME = "students.db";
    public static final int DATABASE_VERSION = 1;
    //-Таблица
    public static final String CREATE_TABLE = "CREATE TABLE IF NOT EXISTS " +
            TABLE_NAME + " (" + _ID + " INTEGER PRIMARY KEY," +
            COLUMN_FIRST_NAME + " TEXT, " +
            COLUMN_SECOND_NAME + " TEXT, " +
            COLUMN_MIDDLE_NAME + " TEXT, " +
            DATE_OF_BIRTH + " TEXT, " +
            ID_GROUP + " TEXT) ";
    public static final String DELETE_TABLE =
            "DROP TABLE IF EXISTS " + TABLE_NAME;
}
