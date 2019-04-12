package com.example.barishaluniversitycalender;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

import static android.content.Intent.FLAG_ACTIVITY_CLEAR_TOP;

public class MainActivity extends AppCompatActivity {

    private ImageButton imageButtonjan;
    private ImageButton imageButtonfeb;
    private ImageButton imageButtonmar;
    private ImageButton imageButtonapr;
    private ImageButton imageButtonmay;
    private ImageButton imageButtonjun;
    private ImageButton imageButtonjuly;
    private ImageButton imageButtonaug;
    private ImageButton imageButtonsep;
    private ImageButton imageButtonoct;
    private ImageButton imageButtonnov;
    private ImageButton imageButtondec;

    private Button currentdate,sutirlist,exit,bu;

    AlertDialog.Builder builder;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        closeContextMenu();
        bu= (Button) findViewById(R.id.buwebside);

        bu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goToUrl ("http://www.bu.ac.bd/");
            }
        });





        builder = new AlertDialog.Builder(this);

        imageButtonjan =(ImageButton) findViewById(R.id.jan);
        imageButtonjan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this, January.class);
                startActivity(intent);
                closeContextMenu();

            }
        });
        imageButtonfeb =(ImageButton) findViewById(R.id.february);
        imageButtonfeb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this,February.class);
                startActivity(intent);
                closeContextMenu();




            }
        });
        imageButtonmar =(ImageButton) findViewById(R.id.mar);
        imageButtonmar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this, March.class);
                startActivity(intent);
                closeContextMenu();





            }
        });

        imageButtonapr =(ImageButton) findViewById(R.id.apr);
        imageButtonapr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this,April.class);
                startActivity(intent);
                closeContextMenu();





            }
        });

        imageButtonmay =(ImageButton) findViewById(R.id.may);
        imageButtonmay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this,May.class);
                startActivity(intent);
                closeContextMenu();




            }
        });

        imageButtonjun =(ImageButton) findViewById(R.id.jun);
        imageButtonjun.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this,Jun.class);
                startActivity(intent);
                closeContextMenu();




            }
        });
        imageButtonjuly =(ImageButton) findViewById(R.id.july);
        imageButtonjuly.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this,July.class);
                startActivity(intent);
                closeContextMenu();



            }
        });
        imageButtonaug =(ImageButton) findViewById(R.id.aug);
        imageButtonaug.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this,August.class);
                startActivity(intent);
                closeContextMenu();




            }
        });
        imageButtonsep =(ImageButton) findViewById(R.id.sep);
        imageButtonsep.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this,September.class);
                startActivity(intent);
                closeContextMenu();



            }
        });

        imageButtonoct =(ImageButton) findViewById(R.id.oct);
        imageButtonoct.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this,October.class);
                startActivity(intent);
                closeContextMenu();




            }
        });
        imageButtonnov =(ImageButton) findViewById(R.id.nov);
        imageButtonnov.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this,November.class);
                startActivity(intent);
                closeContextMenu();




            }
        });

        imageButtondec =(ImageButton) findViewById(R.id.dec);
        imageButtondec.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this,Decemeber.class);
                startActivity(intent);
                closeContextMenu();




            }
        });


        currentdate = (Button) findViewById(R.id.ajkertarikh);
        currentdate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,CalendarActivity.class);
                startActivity(intent);
                closeContextMenu();



            }
        });

       /* ViewPager viewPager = findViewById(R.id.viewPager);
        ImageAdapter imageAdapter = new ImageAdapter(this);
        viewPager.setAdapter(imageAdapter);*/


       sutirlist = (Button) findViewById(R.id.sutirtalika);
       sutirlist.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {

               Intent intent = new Intent(MainActivity.this,vacation.class);
               startActivity(intent);
               closeContextMenu();



           }
       });
/*
       exit = (Button) findViewById(R.id.exit);
       exit.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {


               builder.setMessage(R.string.dialog_message) .setTitle(R.string.dialog_title);

               //Setting message manually and performing action on button click
               builder.setMessage("Are you sure want to close BU Calendar ?");
               builder.setCancelable(false);
               builder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                   public void onClick(DialogInterface dialog, int id) {


                       finish();

                   }
               });
               builder.setNegativeButton("No", new DialogInterface.OnClickListener() {
                   public void onClick(DialogInterface dialog, int id) {
                       //  Action for 'NO' Button
                       dialog.cancel();

                   }
               });
               //Creating dialog box
               AlertDialog alert = builder.create();
               //Setting the title manually
               //alert.setTitle("AlertDialogExample");
               alert.show();

           }
       });

       */







    }


    @Override
    public void onBackPressed() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setMessage("Are you sure you want to exit BU Calender?")
                .setCancelable(false)
                .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        //finish();
                        MainActivity.this.onSuperBackPressed();
                        //super.onBackPressed();
                    }
                })
                .setNegativeButton("No", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        dialog.cancel();
                    }
                });
        AlertDialog alert = builder.create();
        alert.show();
    /*
    if (handleCancel()){
        super.onBackPressed();
    }
    */
    }

    public void onSuperBackPressed(){
        super.onBackPressed();
    }

    public void sinidacte(View view) {

        Intent intent = new Intent(MainActivity.this,VarsitySendicate.class);
        startActivity(intent);

    }


    private void goToUrl (String url) {
        Uri uriUrl = Uri.parse(url);
        Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uriUrl);
        startActivity(launchBrowser);
    }










}
