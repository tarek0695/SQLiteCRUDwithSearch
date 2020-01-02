package com.pixelhubllc.sqlitecrud;

public class Constants {

    //columns
    static final String ROW_ID = "id";
    static final String NAME = "name";

    //database
    static final String DB_NAME = "db";
    static final String DB_TB = "dbtable";
    static final int DB_VERSION = 1;


    //create tb
    static final String CREATE_TB="CREATE TABLE dbtable(id INTEGER PRIMARY KEY AUTOINCREMENT," + "" +
            "name TEXT NOT NULL);";

    //drop tb



}
