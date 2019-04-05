package com.example.barishaluniversitycalender;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class September extends AppCompatActivity {

    private Button prebutton, nextbutton,home;
    private TextView sep2;
    AlertDialog.Builder builder;
    private Button show,ok;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_september);
        closeContextMenu();
        builder = new AlertDialog.Builder(this);
        prebutton = (Button) findViewById(R.id.seppre);
        nextbutton = (Button) findViewById(R.id.sepnext);
       // home = (Button) findViewById(R.id.sephome);
        prebutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(September.this,August.class);
                startActivity(intent);
                closeContextMenu();
                finish();

            }
        });

        nextbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(September.this,October.class);
                startActivity(intent);
                closeContextMenu();
                finish();

            }
        });
/*
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(September.this, MainActivity.class);
                startActivity(intent);
                closeContextMenu();
                finish();

            }
        });
        */



    }

    public void janmoastomi(View view) {



        final AlertDialog.Builder alert = new AlertDialog.Builder(September.this);

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

        dialog.setText("২ রা সেপ্টেম্বর রোজ রবিবার শুভ জন্মাষ্টমী উপলক্ষে ছুটি...");

        alertDialog.show();

    }

    public void asura(View view) {



        final AlertDialog.Builder alert = new AlertDialog.Builder(September.this);

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

        dialog.setText("২১ শে সেপ্টেম্বর রোজ শুক্রবার আশুরা উপলক্ষে ছুটি...");

        alertDialog.show();



    }
}


