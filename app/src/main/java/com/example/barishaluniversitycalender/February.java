package com.example.barishaluniversitycalender;

import android.app.AlertDialog;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class February extends AppCompatActivity {

    private Button prebutton, nextbutton,home;
    private Button show,ok;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_february);
        closeContextMenu();
        prebutton = (Button) findViewById(R.id.febpre);
        nextbutton = (Button) findViewById(R.id.febnext);
       // home = (Button) findViewById(R.id.febhome);
        prebutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(February.this,January.class);
                startActivity(intent);
                closeContextMenu();
                finish();

            }
        });
        nextbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(February.this,March.class);
                startActivity(intent);
                closeContextMenu();
                finish();

            }
        });
        /*
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(February.this, MainActivity.class);
                startActivity(intent);
                closeContextMenu();
                finish();

            }
        });
        */

    }

    public void varsityday(View view) {

        final AlertDialog.Builder alert = new AlertDialog.Builder(February.this);

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

        dialog.setText("        বরিশাল বিশ্ববিদ্যালয় দিবস");

        alertDialog.show();


    }
}
