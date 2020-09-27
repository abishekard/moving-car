package com.abishek534.movingcar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.motion.widget.MotionLayout;

import android.os.Bundle;
import android.os.Handler;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private MotionLayout motionLayout;
    Handler h1,h2,h3,h4;
    private ImageView imageView11,imageView12,imageView13,imageView14,imageView15,imageView16,imageView17,imageView10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        motionLayout = findViewById(R.id.motion_layout);
        imageView11 = findViewById(R.id.imageView11);
        imageView12 = findViewById(R.id.imageView12);
        imageView13 = findViewById(R.id.imageView13);
        imageView14 = findViewById(R.id.imageView14);
        imageView15 = findViewById(R.id.imageView15);
        imageView16 = findViewById(R.id.imageView16);
        imageView17 = findViewById(R.id.imageView17);
        imageView10 = findViewById(R.id.imageView10);
        motionLayout.transitionToState(R.id.end);
        h1=new Handler();
        h2 = new Handler();
        h3 = new Handler();
        h4 = new Handler();
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                motionLayout.transitionToState(R.id.b);
                imageView11.setImageResource(R.drawable.ic_c);
                imageView10.setImageResource(R.drawable.ic_c);

            }
        },1000);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                motionLayout.transitionToState(R.id.c);
            }
        },1700);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                motionLayout.transitionToState(R.id.d);
            }
        },2100);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                motionLayout.transitionToState(R.id.e);
            }
        },2600);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                motionLayout.transitionToState(R.id.f);
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        imageView12.setImageResource(R.drawable.ic_c);

                    }
                },700);
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {

                        imageView14.setImageResource(R.drawable.ic_c);
                    }
                },1000);

            }
        },3800);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                motionLayout.transitionToState(R.id.g);
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {

                        imageView13.setImageResource(R.drawable.ic_c);
                    }
                },600);

            }
        },5300);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                motionLayout.transitionToState(R.id.h);
            }
        },7000);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                motionLayout.transitionToState(R.id.i);
            }
        },8000);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                motionLayout.transitionToState(R.id.j);
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {

                        imageView15.setImageResource(R.drawable.ic_c);
                    }
                },200);
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {

                        imageView16.setImageResource(R.drawable.ic_c);
                    }
                },400);
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {

                        imageView17.setImageResource(R.drawable.ic_c);
                    }
                },600);


            }
        },9000);
    }
}