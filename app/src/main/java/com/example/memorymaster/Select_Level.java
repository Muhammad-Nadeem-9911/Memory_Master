package com.example.memorymaster;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Select_Level extends AppCompatActivity {

    private Button level1,level2,level3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select__level);
        level1=(Button) findViewById(R.id.Level_1);
        level1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent open= new Intent(Select_Level.this,MainActivity.class);
                startActivity(open);
            }
        });

        level2=(Button) findViewById(R.id.Level_2);
        level2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent open= new Intent(Select_Level.this,Main2Activity.class);
                startActivity(open);
            }
        });

        level3=(Button) findViewById(R.id.Level_3);
        level3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent open= new Intent(Select_Level.this,Main3Activity.class);
                startActivity(open);
            }
        });
    }

}
