package com.example.barishaluniversitycalender;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class November extends AppCompatActivity {

    private Button prebutton, nextbutton,home;
    private TextView nov21;
    AlertDialog.Builder builder;
    private Button show,ok;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_november);
        closeContextMenu();
        builder = new AlertDialog.Builder(this);
        prebutton = (Button) findViewById(R.id.novpre);
        nextbutton=(Button) findViewById(R.id.novnext);
        //home = (Button) findViewById(R.id.novhome);
        prebutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(November.this,October.class);
                startActivity(intent);
                closeContextMenu();
                finish();

            }
        });
        nextbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(November.this,Decemeber.class);
                startActivity(intent);
                closeContextMenu();
                finish();

            }
        });



/*
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(November.this, MainActivity.class);
                startActivity(intent);
                closeContextMenu();
                finish();

            }
        });
        */

    }

    public void miladunabi(View view) {




        final AlertDialog.Builder alert = new AlertDialog.Builder(November.this);

        View mview = getLayoutInflater().inflate(R.layout.custom_dialog,null);

        final TextView dialog = (TextView) mview.findViewById(R.id.dialog_text);

        alert.setView(mview);

        final AlertDialog alertDialog = alert.create();

        alertDialog.setCanceledOnTouchOutside(false);

        ok = (Button) mview.findViewById(R.id.okbutton);

        ok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                alertDialog.dismiss();
            }
        });

        dialog.setText("পবিত্র ঈদ-উল-মিলাদুন্নাবী(সাঃ) উপলক্ষে ২১ ই নভেম্বর বুধবার ছুটি...");

        alertDialog.show();
    }
}
