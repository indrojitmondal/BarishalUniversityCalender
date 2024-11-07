package com.example.barishaluniversitycalender;

import android.app.AlertDialog;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Jun extends AppCompatActivity {


    private Button prebutton, nextbutton,home;
    private Button show,ok;
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

    public void grismokalinsuti(View view) {


        final AlertDialog.Builder alert = new AlertDialog.Builder(Jun.this);

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

        dialog.setText("গ্রীস্মকালীন অবকাশ , পবিত্র শব-ই-কাদর ও পবিত্র ঈদ-উল ফিতর উপলক্ষে মে ২৬ রবিবার হতে জুন ৩০ রবিবার পর্যন্ত ছুটি... ");

        alertDialog.show();
    }

    public void sat(View view) {

        final AlertDialog.Builder alert = new AlertDialog.Builder(Jun.this);

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

    public void fri(View view) {
        final AlertDialog.Builder alert = new AlertDialog.Builder(Jun.this);

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
}
