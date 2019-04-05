package com.example.barishaluniversitycalender;

import android.app.AlertDialog;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class March extends AppCompatActivity {

    private Button prebutton,nextButton,home;
    private Button show,ok;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_march);
        closeContextMenu();
        prebutton = (Button) findViewById(R.id.marchpre);
        nextButton = (Button) findViewById(R.id.marchnext);
        //home = (Button) findViewById(R.id.marhome);
        prebutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(March.this, February.class);
                startActivity(intent);
                closeContextMenu();
                finish();

            }
        });
        nextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(March.this, April.class);
                startActivity(intent);
                closeContextMenu();
                finish();

            }
        });
/*
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(March.this, MainActivity.class);
                startActivity(intent);
                closeContextMenu();
                finish();

            }
        });
        */

    }

    public void jatirjanokerjanmodin(View view) {




        final AlertDialog.Builder alert = new AlertDialog.Builder(March.this);

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

        dialog.setText(" জাতির জনক বঙ্গবন্ধু শেখ মুজিবুর রহমানের শুভ জন্মদিন উপলক্ষে ছুটি...");

        alertDialog.show();

    }

    public void march26(View view) {


        final AlertDialog.Builder alert = new AlertDialog.Builder(March.this);

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

        dialog.setText("মহান স্বাধীনতা দিবস উপলক্ষে ছুটি... ");

        alertDialog.show();


    }
}
