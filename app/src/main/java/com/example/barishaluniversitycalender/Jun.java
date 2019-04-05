package com.example.barishaluniversitycalender;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Jun extends AppCompatActivity {

    private Button prebutton,home;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jun);
        closeContextMenu();
        prebutton = (Button) findViewById(R.id.junpre);
        ///home = (Button) findViewById(R.id.junhome);
        prebutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Jun.this,May.class);
                startActivity(intent);
                closeContextMenu();
                finish();

            }
        });
/*
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Jun.this,MainActivity.class);
                startActivity(intent);
                closeContextMenu();
                finish();

            }
        });
        */

    }
}
