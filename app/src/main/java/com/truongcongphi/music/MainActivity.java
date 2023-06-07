package com.truongcongphi.music;

import android.graphics.drawable.Animatable;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {
    Button btnLoginFB, btnLoginPNumber , btnSignUp, btnLoginGoogle, btnLogin;
    Animation  scaleDown;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        btnLoginFB = (Button) findViewById(R.id.btn_loginFacebook);
        btnLoginPNumber = (Button) findViewById(R.id.btn_login_phonenumber);
        btnSignUp = (Button) findViewById(R.id.btn_signup);
        btnLoginGoogle = (Button) findViewById(R.id.btn_login_accountgoogle);
        btnLogin = (Button) findViewById(R.id.btn_login);
        scaleDown = AnimationUtils.loadAnimation(this, R.anim.scale_down);

        btnLoginFB.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                 if (event.getAction() == MotionEvent.ACTION_DOWN) {
                    btnLoginFB.startAnimation(scaleDown);
                }
                return true;
            }
        });
        btnSignUp.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if (event.getAction() == MotionEvent.ACTION_DOWN) {
                    btnSignUp.startAnimation(scaleDown);
                }
                return true;
            }
        });
        btnLoginGoogle.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if (event.getAction() == MotionEvent.ACTION_DOWN) {
                    btnLoginGoogle.startAnimation(scaleDown);
                }
                return true;
            }
        });
        btnLogin.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if (event.getAction() == MotionEvent.ACTION_DOWN) {
                    btnLogin.startAnimation(scaleDown);
                }
                return true;
            }
        });
        btnLoginPNumber.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if (event.getAction() == MotionEvent.ACTION_DOWN) {
                    btnLoginPNumber.startAnimation(scaleDown);
                }
                return true;
            }
        });





    }

}