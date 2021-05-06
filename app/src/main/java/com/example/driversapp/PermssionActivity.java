package com.example.driversapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class PermssionActivity extends AppCompatActivity {

    EditText editText;
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_permssion);


        editText= (EditText)findViewById(R.id.editTextNumberPassword);
        button=(Button)findViewById(R.id.button);


        int password=Integer.parseInt(String.valueOf(editText.getText())) ;
        int p=Integer.parseInt(String.valueOf(password));
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(p==123){

                    Intent intent = new Intent(PermssionActivity.this, MainActivity.class);
                    startActivity(intent);
                }
                else
                {
                    Toast.makeText(PermssionActivity.this, "else", Toast.LENGTH_SHORT).show();
                }
            }
        });







    }
}