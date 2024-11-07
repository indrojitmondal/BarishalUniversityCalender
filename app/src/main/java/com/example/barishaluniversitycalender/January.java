package com.example.barishaluniversitycalender;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import android.content.Context;
import android.app.Dialog;

public class January extends AppCompatActivity {

    final Context context = this;
    private TextView textView,text;
    private Button button,bu,next,pre,home;
    AlertDialog.Builder builder;
    private Button show,ok;
    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_january);
        closeContextMenu();
       // textView = (TextView) findViewById(R.id.jan4);

        builder = new AlertDialog.Builder(this);

        //Setting the title manually


/*
         bu= (Button) findViewById(R.id.bu);

         bu.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 goToUrl ("http://www.bu.ac.bd/");
             }
         });


*/

     next = (Button) findViewById(R.id.jannext) ;

     next.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View v) {
             Intent intent =new Intent(January.this, February.class);
             startActivity(intent);
             closeContextMenu();
             finish();

         }
     });
        pre = (Button) findViewById(R.id.janpre) ;

        pre.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(January.this, Decemeber.class);
                startActivity(intent);
                closeContextMenu();
                finish();

            }
        });



      /*  home = (Button) findViewById(R.id.janhome);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(January.this, MainActivity.class);
                startActivity(intent);
                closeContextMenu();
                finish();

            }
        });
        */



    }


    private void goToUrl (String url) {
        Uri uriUrl = Uri.parse(url);
        Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uriUrl);
        startActivity(launchBrowser);
    }


    public void fri(View view) {



        final AlertDialog.Builder alert = new AlertDialog.Builder(January.this);

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



        final AlertDialog.Builder alert = new AlertDialog.Builder(January.this);

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
