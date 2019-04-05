package com.example.barishaluniversitycalender;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Decemeber extends AppCompatActivity {

    private Button prebutton,nextbutton,home;
    private TextView dec16,dec19;
    AlertDialog.Builder builder;
    private Button show,ok;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_decemeber);
        closeContextMenu();
        builder = new AlertDialog.Builder(this);
        prebutton = (Button) findViewById(R.id.decpre);
        nextbutton = (Button) findViewById(R.id.decnext);
       // home = (Button) findViewById(R.id.dechome);
        prebutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Decemeber.this, November.class);
                startActivity(intent);
                closeContextMenu();
                finish();

            }
        });

        nextbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Decemeber.this,January.class);
                startActivity(intent);
                closeContextMenu();
                finish();

            }
        });
        /*
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Decemeber.this, MainActivity.class);
                startActivity(intent);
                closeContextMenu();
                finish();

            }
        });
        */




    }

    public void bijodibosh(View view) {




        final AlertDialog.Builder alert = new AlertDialog.Builder(Decemeber.this);

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

        dialog.setText("১৬ ই ডিসেম্বর রোজ রবিবার মহান বিজয় দিবস উপলক্ষে ছুটি...");

        alertDialog.show();


    }

    public void sitkalinsuti(View view) {


        final AlertDialog.Builder alert = new AlertDialog.Builder(Decemeber.this);

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

        dialog.setText("শীতকালীন অবকাশ ও যীশু খ্রিস্টের জন্মদিন উপলক্ষে  ১৯ ডিসেম্বর হতে ৩১ ডিসেম্বর পর্যন্ত ছুটি...");

        alertDialog.show();


    }
}
