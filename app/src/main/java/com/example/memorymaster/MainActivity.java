package com.example.memorymaster;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.TextView;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class MainActivity extends AppCompatActivity {

    TextView tv_p1, tv_p2;
    ImageView iv_11,iv_12,iv_13,iv_14,iv_21,iv_22,iv_23,iv_24,iv_31,iv_32,iv_33,iv_34;
    //array for the images
    Integer[] cardarray={101,102,103,104,105,106,201,202,203,204,205,206};
    //Actual images
    int image101,image102,image103,image104,image105,image106,image201,image202,image203,image204,image205,image206;
    int firstcard,secondcard;
    int clickedfirst,clickedsecond;
    int cardnumber=1;
    int turn=1;
    int playerpoints=0,cpupoints=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv_p1=(TextView) findViewById(R.id.tv_p1);
        tv_p2=(TextView) findViewById(R.id.tv_p2);

        iv_11=(ImageView) findViewById(R.id.iv_11);
        iv_12=(ImageView) findViewById(R.id.iv_12);
        iv_13=(ImageView) findViewById(R.id.iv_13);
        iv_14=(ImageView) findViewById(R.id.iv_14);
        iv_21=(ImageView) findViewById(R.id.iv_21);
        iv_22=(ImageView) findViewById(R.id.iv_22);
        iv_23=(ImageView) findViewById(R.id.iv_23);
        iv_24=(ImageView) findViewById(R.id.iv_24);
        iv_31=(ImageView) findViewById(R.id.iv_31);
        iv_32=(ImageView) findViewById(R.id.iv_32);
        iv_33=(ImageView) findViewById(R.id.iv_33);
        iv_34=(ImageView) findViewById(R.id.iv_34);

        iv_11.setTag("0");
        iv_12.setTag("1");
        iv_13.setTag("2");
        iv_14.setTag("3");
        iv_21.setTag("4");
        iv_22.setTag("5");
        iv_23.setTag("6");
        iv_24.setTag("7");
        iv_31.setTag("8");
        iv_32.setTag("9");
        iv_33.setTag("10");
        iv_34.setTag("11");

        //load the card images
        frontofcardresources();

        //Shuffle the images
        Collections.shuffle(Arrays.asList(cardarray));

        tv_p2.setBackgroundColor(Color.RED);
        tv_p1.setBackgroundColor(Color.GREEN);
        tv_p1.setTextColor(Color.WHITE);
        tv_p2.setTextColor(Color.WHITE);

        iv_11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int thecard = Integer.parseInt((String) v.getTag());
                doStuff(iv_11, thecard);
            }
        });
        iv_12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int thecard = Integer.parseInt((String) v.getTag());
                doStuff(iv_12, thecard);
            }
        });
        iv_13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int thecard = Integer.parseInt((String) v.getTag());
                doStuff(iv_13, thecard);
            }
        });
        iv_14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int thecard = Integer.parseInt((String) v.getTag());
                doStuff(iv_14, thecard);
            }
        });
        iv_21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int thecard = Integer.parseInt((String) v.getTag());
                doStuff(iv_21, thecard);
            }
        });
        iv_22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int thecard = Integer.parseInt((String) v.getTag());
                doStuff(iv_22, thecard);
            }
        });
        iv_23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int thecard = Integer.parseInt((String) v.getTag());
                doStuff(iv_23, thecard);
            }
        });
        iv_24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int thecard = Integer.parseInt((String) v.getTag());
                doStuff(iv_24, thecard);
            }
        });
        iv_31.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int thecard = Integer.parseInt((String) v.getTag());
                doStuff(iv_31, thecard);
            }
        });
        iv_32.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int thecard=Integer.parseInt((String) v.getTag());
                doStuff(iv_32,thecard);
            }
        });
        iv_33.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int thecard = Integer.parseInt((String) v.getTag());
                doStuff(iv_33, thecard);
            }
        });
        iv_34.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int thecard = Integer.parseInt((String) v.getTag());
                doStuff(iv_34, thecard);
            }
        });
    }
    private  void doStuff(ImageView iv , int card){
        //set the correct image to the view
        if(cardarray[card]==101){
            iv.setImageResource(image101);
        }else if(cardarray[card]==102){
            iv.setImageResource(image102);
        }else if(cardarray[card]==103){
            iv.setImageResource(image103);
        }else if(cardarray[card]==104){
            iv.setImageResource(image104);
        }else if(cardarray[card]==105){
            iv.setImageResource(image105);
        }else if(cardarray[card]==106){
            iv.setImageResource(image106);
        }else if(cardarray[card]==201){
            iv.setImageResource(image201);
        }else if(cardarray[card]==202){
            iv.setImageResource(image202);
        }else if(cardarray[card]==203){
            iv.setImageResource(image203);
        }else if(cardarray[card]==204){
            iv.setImageResource(image204);
        }else if(cardarray[card]==205){
            iv.setImageResource(image205);
        }else if(cardarray[card]==206){
            iv.setImageResource(image206);
        }
    //check which image is selected save it in temporary variable
        if(cardnumber==1){
            firstcard= cardarray[card];
            if(firstcard>200){
                firstcard = firstcard - 100;
            }
            cardnumber=2;
            clickedfirst= card;
            iv.setEnabled(false);
        }else if(cardnumber==2){
            secondcard=cardarray[card];
            if(secondcard>200){
                secondcard=secondcard-100;
            }
            cardnumber=1;
            clickedsecond=card;

            iv_11.setEnabled(false);
            iv_12.setEnabled(false);
            iv_13.setEnabled(false);
            iv_14.setEnabled(false);
            iv_21.setEnabled(false);
            iv_22.setEnabled(false);
            iv_23.setEnabled(false);
            iv_24.setEnabled(false);
            iv_31.setEnabled(false);
            iv_32.setEnabled(false);
            iv_33.setEnabled(false);
            iv_34.setEnabled(false);

            Handler handler= new Handler();
            handler.postDelayed(new Runnable() {
                @Override
                public void run() {
                    //check if the images are equal
                    calculate();
                }
            },1000);
        }
    }
    private void calculate(){
        //if images are equal remove the images
        if (firstcard == secondcard){
            if(clickedfirst==0){
                iv_11.setVisibility(View.INVISIBLE);
            }else if(clickedfirst==1){
                iv_12.setVisibility(View.INVISIBLE);
            }else if(clickedfirst==2){
                iv_13.setVisibility(View.INVISIBLE);
            }else if(clickedfirst==3){
                iv_14.setVisibility(View.INVISIBLE);
            }else if(clickedfirst==4){
                iv_21.setVisibility(View.INVISIBLE);
            }else if(clickedfirst==5){
                iv_22.setVisibility(View.INVISIBLE);
            }else if(clickedfirst==6){
                iv_23.setVisibility(View.INVISIBLE);
            }else if(clickedfirst==7){
                iv_24.setVisibility(View.INVISIBLE);
            }else if(clickedfirst==8){
                iv_31.setVisibility(View.INVISIBLE);
            }else if(clickedfirst==9){
                iv_32.setVisibility(View.INVISIBLE);
            }else if(clickedfirst==10){
                iv_33.setVisibility(View.INVISIBLE);
            }else if(clickedfirst==11){
                iv_34.setVisibility(View.INVISIBLE);
            }

            if(clickedsecond==0){
                iv_11.setVisibility(View.INVISIBLE);
            }else if(clickedsecond==1){
                iv_12.setVisibility(View.INVISIBLE);
            }else if(clickedsecond==2){
                iv_13.setVisibility(View.INVISIBLE);
            }else if(clickedsecond==3){
                iv_14.setVisibility(View.INVISIBLE);
            }else if(clickedsecond==4){
                iv_21.setVisibility(View.INVISIBLE);
            }else if(clickedsecond==5){
                iv_22.setVisibility(View.INVISIBLE);
            }else if(clickedsecond==6){
                iv_23.setVisibility(View.INVISIBLE);
            }else if(clickedsecond==7){
                iv_24.setVisibility(View.INVISIBLE);
            }else if(clickedsecond==8){
                iv_31.setVisibility(View.INVISIBLE);
            }else if(clickedsecond==9){
                iv_32.setVisibility(View.INVISIBLE);
            }else if(clickedsecond==10){
                iv_33.setVisibility(View.INVISIBLE);
            }else if(clickedsecond==11){
                iv_34.setVisibility(View.INVISIBLE);
            }
            if(turn==1){
                playerpoints++;
                tv_p1.setText("P1: "+playerpoints);
            }else if (turn==2){
                cpupoints++;
                tv_p2.setText("P2: "+cpupoints);
            }
        }else{
            iv_11.setImageResource(R.drawable.front);
            iv_12.setImageResource(R.drawable.front);
            iv_13.setImageResource(R.drawable.front);
            iv_14.setImageResource(R.drawable.front);
            iv_21.setImageResource(R.drawable.front);
            iv_22.setImageResource(R.drawable.front);
            iv_23.setImageResource(R.drawable.front);
            iv_24.setImageResource(R.drawable.front);
            iv_31.setImageResource(R.drawable.front);
            iv_32.setImageResource(R.drawable.front);
            iv_33.setImageResource(R.drawable.front);
            iv_34.setImageResource(R.drawable.front);

            //Change the player turn
            if(turn==1){
                turn=2;
                tv_p1.setBackgroundColor(Color.RED);
                tv_p2.setBackgroundColor(Color.GREEN);
            }else if(turn==2){
                turn=1;
                tv_p2.setBackgroundColor(Color.RED);
                tv_p1.setBackgroundColor(Color.GREEN);
            }
        }
        iv_11.setEnabled(true);
        iv_12.setEnabled(true);
        iv_13.setEnabled(true);
        iv_14.setEnabled(true);
        iv_21.setEnabled(true);
        iv_22.setEnabled(true);
        iv_23.setEnabled(true);
        iv_24.setEnabled(true);
        iv_31.setEnabled(true);
        iv_32.setEnabled(true);
        iv_33.setEnabled(true);
        iv_34.setEnabled(true);

        CheckEnd();
    }
    private void CheckEnd(){
             if(iv_11.getVisibility()== View.INVISIBLE &&
                iv_12.getVisibility()== View.INVISIBLE &&
                iv_13.getVisibility()== View.INVISIBLE &&
                iv_14.getVisibility()== View.INVISIBLE &&
                iv_21.getVisibility()== View.INVISIBLE &&
                iv_22.getVisibility()== View.INVISIBLE &&
                iv_23.getVisibility()== View.INVISIBLE &&
                iv_24.getVisibility()== View.INVISIBLE &&
                iv_31.getVisibility()== View.INVISIBLE &&
                iv_32.getVisibility()== View.INVISIBLE &&
                iv_33.getVisibility()== View.INVISIBLE &&
                iv_34.getVisibility()== View.INVISIBLE){

                 AlertDialog.Builder AlertDialogbuilder=new AlertDialog.Builder(MainActivity.this);
                 AlertDialog.Builder builder = AlertDialogbuilder
                         .setMessage("GAME OVER \nP1:" + playerpoints + "\nP2:" + cpupoints)
                         .setCancelable(false)
                         .setPositiveButton("PLAY AGAIN", new DialogInterface.OnClickListener() {
                             @Override
                             public void onClick(DialogInterface dialog, int which) {
                                 Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                                 startActivity(intent);
                                 finish();
                             }
                         })
                         .setNegativeButton("MAIN", new DialogInterface.OnClickListener() {
                             @Override
                             public void onClick(DialogInterface dialog, int which) {
                                 finish();
                             }
                         });
                 AlertDialog alertDialog = AlertDialogbuilder.create();
                 alertDialog.show();

             }
    }
    private void frontofcardresources (){
        image101=R.drawable.image101;
        image102=R.drawable.image102;
        image103=R.drawable.image103;
        image104=R.drawable.image104;
        image105=R.drawable.image105;
        image106=R.drawable.image106;
        image201=R.drawable.image201;
        image202=R.drawable.image202;
        image203=R.drawable.image203;
        image204=R.drawable.image204;
        image205=R.drawable.image205;
        image206=R.drawable.image206;

    }
}
