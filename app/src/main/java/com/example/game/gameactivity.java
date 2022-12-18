package com.example.game;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Arrays;
import java.util.Collections;

public class gameactivity extends AppCompatActivity {

    ConstraintLayout l;
    TextView tv_p1,tv_p2;
    ImageView iv_11,iv_12,iv_13,iv_14,iv_21,iv_22,iv_23,iv_24,iv_31,iv_32,iv_33,iv_34;
    Integer[] cardarray={101,102,103,104,105,106,201,202,203,204,205,206};
    int image101,image102,image103,image104,image105,image106,image201,image202,image203,image204,image205,image206;
    int firstcard,secondcard;
    int clickedfirst,clickedsecond;
    int cardNumber=1;
    int turn=1;
    int pl1pts=0,pl2pts=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gameactivity);
        l=findViewById(R.id.c);
        tv_p1=findViewById(R.id.tv_p1);
        tv_p2=findViewById(R.id.tv_p2);
        iv_11=findViewById(R.id.iv_11);
        iv_12=findViewById(R.id.iv_12);
        iv_13=findViewById(R.id.iv_13);
        iv_14=findViewById(R.id.iv_14);
        iv_21=findViewById(R.id.iv_21);
        iv_22=findViewById(R.id.iv_22);
        iv_23=findViewById(R.id.iv_23);
        iv_24=findViewById(R.id.iv_24);
        iv_31=findViewById(R.id.iv_31);
        iv_32=findViewById(R.id.iv_32);
        iv_33=findViewById(R.id.iv_33);
        iv_34=findViewById(R.id.iv_34);
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
        frontOfCardsResources();
        Collections.shuffle(Arrays.asList(cardarray));
        tv_p2.setTextColor(Color.GRAY);
        iv_11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int thecard=Integer.parseInt((String) v.getTag());
                doStuff(iv_11,thecard);
            }
        });
        iv_12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int thecard=Integer.parseInt((String) v.getTag());
                doStuff(iv_12,thecard);
            }
        });
        iv_13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int thecard=Integer.parseInt((String) v.getTag());
                doStuff(iv_13,thecard);
            }
        });
        iv_14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int thecard=Integer.parseInt((String) v.getTag());
                doStuff(iv_14,thecard);
            }
        });
        iv_21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int thecard=Integer.parseInt((String) v.getTag());
                doStuff(iv_21,thecard);
            }
        });
        iv_22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int thecard=Integer.parseInt((String) v.getTag());
                doStuff(iv_22,thecard);
            }
        });
        iv_23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int thecard=Integer.parseInt((String) v.getTag());
                doStuff(iv_23,thecard);
            }
        });
        iv_24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int thecard=Integer.parseInt((String) v.getTag());
                doStuff(iv_24,thecard);
            }
        });
        iv_31.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int thecard=Integer.parseInt((String) v.getTag());
                doStuff(iv_31,thecard);
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
                int thecard=Integer.parseInt((String) v.getTag());
                doStuff(iv_33,thecard);
            }
        });
        iv_34.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int thecard=Integer.parseInt((String) v.getTag());
                doStuff(iv_34,thecard);
            }
        });
    }
    private void doStuff(ImageView iv,int card){
        if(cardarray[card]==101)
            iv.setImageResource(image101);
        else if(cardarray[card]==102)
            iv.setImageResource(image102);
        else if(cardarray[card]==103)
            iv.setImageResource(image103);
        else if(cardarray[card]==104)
            iv.setImageResource(image104);
        else if(cardarray[card]==105)
            iv.setImageResource(image105);
        else if(cardarray[card]==106)
            iv.setImageResource(image106);
        else if(cardarray[card]==201)
            iv.setImageResource(image201);
        else if(cardarray[card]==202)
            iv.setImageResource(image202);
        else if(cardarray[card]==203)
            iv.setImageResource(image203);
        else if(cardarray[card]==204)
            iv.setImageResource(image204);
        else if(cardarray[card]==205)
            iv.setImageResource(image205);
        else if(cardarray[card]==206)
            iv.setImageResource(image206);
        if(cardNumber==1){
            firstcard=cardarray[card];
            if(firstcard>200){
                firstcard=firstcard-100;
            }
            cardNumber=2;
            clickedfirst=card;
            iv.setEnabled(false);
        }else if (cardNumber==2){
            secondcard=cardarray[card];
            if(secondcard>200){
                secondcard=secondcard-100;
            }
            cardNumber=1;
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
            Handler handler=new Handler();
            handler.postDelayed(new Runnable() {
                @Override
                public void run() {
                    calculate();
                }
            },1000);
        }
    }
    private void calculate(){

        if (firstcard==secondcard){
            if (clickedfirst==0){
                iv_11.setVisibility(View.INVISIBLE);
            }
            else if (clickedfirst==1)
                iv_12.setVisibility(View.INVISIBLE);
            else if (clickedfirst==2)
                iv_13.setVisibility(View.INVISIBLE);
            else if (clickedfirst==3)
                iv_14.setVisibility(View.INVISIBLE);
            else if (clickedfirst==4)
                iv_21.setVisibility(View.INVISIBLE);
            else if (clickedfirst==5)
                iv_22.setVisibility(View.INVISIBLE);
            else if (clickedfirst==6)
                iv_23.setVisibility(View.INVISIBLE);
            else if (clickedfirst==7)
                iv_24.setVisibility(View.INVISIBLE);
            else if (clickedfirst==8)
                iv_31.setVisibility(View.INVISIBLE);
            else if (clickedfirst==9)
                iv_32.setVisibility(View.INVISIBLE);
            else if (clickedfirst==10)
                iv_33.setVisibility(View.INVISIBLE);
            else if (clickedfirst==11)
                iv_34.setVisibility(View.INVISIBLE);
            if (clickedsecond==0){
                iv_11.setVisibility(View.INVISIBLE);
            }
            else if (clickedsecond==1)
                iv_12.setVisibility(View.INVISIBLE);
            else if (clickedsecond==2)
                iv_13.setVisibility(View.INVISIBLE);
            else if (clickedsecond==3)
                iv_14.setVisibility(View.INVISIBLE);
            else if (clickedsecond==4)
                iv_21.setVisibility(View.INVISIBLE);
            else if (clickedsecond==5)
                iv_22.setVisibility(View.INVISIBLE);
            else if (clickedsecond==6)
                iv_23.setVisibility(View.INVISIBLE);
            else if (clickedsecond==7)
                iv_24.setVisibility(View.INVISIBLE);
            else if (clickedsecond==8)
                iv_31.setVisibility(View.INVISIBLE);
            else if (clickedsecond==9)
                iv_32.setVisibility(View.INVISIBLE);
            else if (clickedsecond==10)
                iv_33.setVisibility(View.INVISIBLE);
            else if (clickedsecond==11)
                iv_34.setVisibility(View.INVISIBLE);
            if (turn==1){
                pl1pts++;
                tv_p1.setText("PLAYER 1: "+pl1pts);
            }else if (turn==2){
                pl2pts++;
                tv_p2.setText("PLAYER 2: "+pl2pts);
            }
        }else
        {
            iv_11.setImageResource(R.drawable.question);
            iv_12.setImageResource(R.drawable.question);
            iv_13.setImageResource(R.drawable.question);
            iv_14.setImageResource(R.drawable.question);
            iv_21.setImageResource(R.drawable.question);
            iv_22.setImageResource(R.drawable.question);
            iv_23.setImageResource(R.drawable.question);
            iv_24.setImageResource(R.drawable.question);
            iv_31.setImageResource(R.drawable.question);
            iv_32.setImageResource(R.drawable.question);
            iv_33.setImageResource(R.drawable.question);
            iv_34.setImageResource(R.drawable.question);
            if (turn==1){
                turn=2;
                tv_p1.setTextColor(Color.GRAY);
                tv_p2.setTextColor(Color.BLACK);
            }else if (turn==2){
                turn=1;
                tv_p2.setTextColor(Color.GRAY);
                tv_p1.setTextColor(Color.BLACK);
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
        checkend();
    }
    private void checkend(){
        if (iv_11.getVisibility()==View.INVISIBLE &&
                iv_12.getVisibility()==View.INVISIBLE &&
                iv_13.getVisibility()==View.INVISIBLE &&
                iv_14.getVisibility()==View.INVISIBLE &&
                iv_21.getVisibility()==View.INVISIBLE &&
                iv_22.getVisibility()==View.INVISIBLE &&
                iv_23.getVisibility()==View.INVISIBLE &&
                iv_24.getVisibility()==View.INVISIBLE &&
                iv_31.getVisibility()==View.INVISIBLE &&
                iv_32.getVisibility()==View.INVISIBLE &&
                iv_33.getVisibility()==View.INVISIBLE &&
                iv_34.getVisibility()==View.INVISIBLE ){
            AlertDialog.Builder ab=new AlertDialog.Builder(gameactivity.this);
            ab.setMessage("GAME OVER\nPLAYER 1: "+pl1pts+"\nPLAYER 2: "+pl2pts).setCancelable(false)
                    .setPositiveButton("NEW", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            Intent intent=new Intent(getApplicationContext(),gameactivity.class);
                            startActivity(intent);
                            finish();
                        }
                    }).setNegativeButton("EXIT", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            Intent intent=new Intent(getApplicationContext(),HomeActivity.class);
                            intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                            intent.putExtra("EXIT", true);


                            startActivity(intent);
                            finish();
                        }
                    });
            AlertDialog ad=ab.create();
            ad.show();
        }
    }
    private void frontOfCardsResources(){
        image101=R.drawable.card;
        image102=R.drawable.cardone;
        image103=R.drawable.cardtwo;
        image104=R.drawable.cardthree;
        image105=R.drawable.cardfour;
        image106=R.drawable.cardfive;
        image201=R.drawable.cardc;
        image202=R.drawable.cardonec;
        image203=R.drawable.cardtwoc;
        image204=R.drawable.cardthreec;
        image205=R.drawable.cardfourc;
        image206=R.drawable.cardfivec;
    }
}