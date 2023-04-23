package com.example.progect;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ContentValues;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

//использование функционала Db
public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    Button btnAdd, btnDelete, btnAddGr,btnAddSt;
    EditText etFirstName, etSecondName, etMiddleName, etDateBirth;
    Button btnAddGroup, btnDeleteGroup;
    EditText etNumber, etDirection;
    private Bundle savedInstanceState;

    DbHelper dbHelper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnAddGr = findViewById(R.id.button2);
        btnAddGr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent nte = new Intent(MainActivity.this, add_group.layout);
                startActivity(nte);


            }
        });

        btnAddSt = findViewById(R.id.button);
        btnAddSt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent nte = new Intent(MainActivity.this, add_students.layout);
                startActivity(nte);


            }
        });




        setContentView(R.layout.add_students);

        btnAdd = (Button) findViewById(R.id.buttonAddStydent);
        btnAdd.setOnClickListener(this);

        btnDelete = (Button) findViewById(R.id.buttonDelete);
        btnDelete.setOnClickListener(this);

        etFirstName = (EditText) findViewById(R.id.EditTextFirstName);
        etSecondName = (EditText) findViewById(R.id.EditTextSecondName);
        etMiddleName = (EditText) findViewById(R.id.EditTextMiddleName);
        etDateBirth = (EditText) findViewById(R.id.EditTextDateBirth);

        dbHelper = new DbHelper(this);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        this.savedInstanceState = savedInstanceState;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.add_group);

        btnAddGroup = (Button) findViewById(R.id.buttonAddGroup);
        btnAddGroup.setOnClickListener(this);

        btnDeleteGroup = (Button) findViewById(R.id.buttonDeleteGroup);
        btnDeleteGroup.setOnClickListener(this);


        etNumber = (EditText) findViewById(R.id.EditTextNumber);
        etDirection = (EditText) findViewById(R.id.EditTextDirection);

    }


    @Override
    public void onClick(View view) {
        String firstName = etFirstName.getText().toString();
        String secondName = etSecondName.getText().toString();
        String MiddleName = etMiddleName.getText().toString();
        String DateBirth = etDateBirth.getText().toString();
        String Number = etNumber.getText().toString();
        String Direction = etDirection.getText().toString();

        SQLiteDatabase database = dbHelper.getWritableDatabase;

        ContentValues contentValues = new ContentValues();


        switch (view.getId()) {
            case R.id.buttonAddStydent:
                contentValues.put(dbHelper.KEY_FIRST_NAME,etFirstName);
                contentValues.put(dbHelper.KEY_SECOND_NAME,etSecondName);
                contentValues.put(dbHelper.KEY_MIDDLE_NAME,etMiddleName);
                contentValues.put(dbHelper.KEY_DATE_BIRTH,etDateBirth);

                database.insert(DbHelper.TABLE_CONTACTS, null,null,null,null,null,null);

                //-Действие по нажатию btnAddStudent
                break;
            case R.id.buttonDelete:
                //-Действие по нажатию btnDelete
            case R.id.buttonAddGroup:
                //-Действие по нажатию на btnAddGroup
                break;
            case R.id.buttonDeleteGroup:
                //-Действие по нажатию на btnDeleteGroup
                break;
        }


    }

    }
