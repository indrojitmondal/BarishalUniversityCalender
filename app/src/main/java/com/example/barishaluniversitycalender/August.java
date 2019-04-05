package com.example.barishaluniversitycalender;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class August extends AppCompatActivity {

    private Button prebutton, nextbutton,home;
    private TextView aug15,aug19,aug29;
    private Button show,ok;
    AlertDialog.Builder builder;









    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_august);
        closeContextMenu();
        builder = new AlertDialog.Builder(this);
        prebutton  = (Button) findViewById(R.id.augpre);
        nextbutton = (Button) findViewById(R.id.augnext);




       // home = (Button) findViewById(R.id.aughome);
        prebutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(August.this,July.class);
                startActivity(intent);
                closeContextMenu();
                finish();


            }
        });

        nextbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(August.this,September.class);
                startActivity(intent);
                closeContextMenu();
                finish();

            }
        });
/*
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(August.this,MainActivity.class);
                startActivity(intent);
                closeContextMenu();
                finish();

            }
        });
        */










    }







    public void shokdibosh(View view) {


        final AlertDialog.Builder alert = new AlertDialog.Builder(August.this);

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

        dialog.setText("         জাতীয় শোক দিবস");

        alertDialog.show();


    }

    public void eidulajha(View view) {


        //Start

        final AlertDialog.Builder alert = new AlertDialog.Builder(August.this);

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

        dialog.setText("পবিত্র ঈদ-উল আযহা উপলক্ষে আগস্ট ১৯ রবিবার হতে আগস্ট ৩০ বৃস্পতিবার পর্যন্ত ছুটি...");

        alertDialog.show();



        //End



    }
}
