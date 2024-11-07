package com.example.barishaluniversitycalender;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class October extends AppCompatActivity {

    private Button prebutton, nextButton,home;
    private TextView oct14, oct16;
    AlertDialog.Builder builder;

    private Button show,ok;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_october);
        closeContextMenu();
        prebutton = (Button) findViewById(R.id.octpre);
        nextButton = (Button) findViewById(R.id.octnext);
        builder = new AlertDialog.Builder(this);
       // home = (Button) findViewById(R.id.octhome) ;


        prebutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(October.this,September.class);
                startActivity(intent);
                closeContextMenu();
                finish();
            }
        });

        nextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(October.this,November.class);
                startActivity(intent);
                closeContextMenu();
                finish();

            }
        });

/*
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(October.this, MainActivity.class);
                startActivity(intent);
                closeContextMenu();
                finish();

            }
        });
        */











    }

    public void durgapujarsuti(View view) {




        final AlertDialog.Builder alert = new AlertDialog.Builder(October.this);

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

        dialog.setText("শ্রী শ্রী দুর্গা পূজা উপলক্ষে অক্টোবর ১৪ রবিবার হতে অক্টোবর ১৮ বৃহস্পতিবার পর্যন্ত ছুটি...");

        alertDialog.show();


    }

    public void fri(View view) {



        final AlertDialog.Builder alert = new AlertDialog.Builder(October.this);

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

        dialog.setText("শুক্রবার, বিশ্ববিদ্যালয় ছুটি ।");

        alertDialog.show();

    }

    public void sat(View view) {


        final AlertDialog.Builder alert = new AlertDialog.Builder(October.this);

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
