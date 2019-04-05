package com.example.barishaluniversitycalender;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class July extends AppCompatActivity {

    private Button nextbutton,home;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_july);
        closeContextMenu();

        nextbutton = (Button) findViewById(R.id.julynext);

       // home = (Button) findViewById(R.id.home);

        nextbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(July.this,August.class);
                startActivity(intent);
                closeContextMenu();
                finish();



            }
        });
/*
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(July.this,MainActivity.class);
                startActivity(intent);
                closeContextMenu();
                finish();

            }
        });
        */

    }
}
