package com.example.barishaluniversitycalender;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class April extends AppCompatActivity {

    private Button prebutton, nextbutton,home;
    private TextView apil14;
    AlertDialog.Builder builder;
    private Button show,ok;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_april);
        closeContextMenu();
        prebutton = (Button) findViewById(R.id.aprilpre);
        nextbutton =(Button) findViewById(R.id.aprilnext);


        builder = new AlertDialog.Builder(this);

       // home = (Button) findViewById(R.id.aprhome);


        prebutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(April.this, March.class);
                startActivity(intent);
             closeContextMenu();
                finish();

            }
        });
        nextbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(April.this, May.class);
                startActivity(intent);
                closeContextMenu();
                finish();

            }
        });
/*
       home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(April.this, MainActivity.class);
                startActivity(intent);
              closeContextMenu();
              finish();

            }
        });
        */




    }

    public void banglanewyear(View view) {

        final AlertDialog.Builder alert = new AlertDialog.Builder(April.this);

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

        dialog.setText("১৪ ই এপ্রিল রবিবার বাংলা নববর্ষ উপলক্ষে ছুটি.... ");

        alertDialog.show();
    }

    public void fri(View view) {

        final AlertDialog.Builder alert = new AlertDialog.Builder(April.this);

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

        dialog.setText("শুক্রবার, বিশ্ববিদ্যালয় ছুটি । ");

        alertDialog.show();
    }

    public void sat(View view) {
        final AlertDialog.Builder alert = new AlertDialog.Builder(April.this);

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

        dialog.setText("শনিবার, বিশ্ববিদ্যালয় ছুটি ।");

        alertDialog.show();

    }
}
