package com.truongcongphi.music;

import android.animation.ObjectAnimator;
import android.content.Intent;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.truongcongphi.music.ButtonAnimator.ButtonAnimator;

public class LoginActivity extends AppCompatActivity {
    Button btnLoginFB, btnLoginPNumber , btnSignUp, btnLoginGoogle, btnLogin,hihi;
    Animation scaleDown, scaleUp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        addViews();
        addButtonSignUp();
        addButtonAnimator();

    }



    private void addViews() {
        btnLoginFB = (Button) findViewById(R.id.btn_loginFacebook);
        btnLoginPNumber = (Button) findViewById(R.id.btn_login_phonenumber);
        btnSignUp = (Button) findViewById(R.id.btn_signup);
        btnLoginGoogle = (Button) findViewById(R.id.btn_login_accountgoogle);
        btnLogin = (Button) findViewById(R.id.btn_login);
    }

    //set các hiệu cho button
    public void addButtonAnimator(){
        btnSignUp.setOnTouchListener(new ButtonAnimator(btnSignUp));
        btnLoginPNumber.setOnTouchListener(new ButtonAnimator(btnLoginPNumber));
        btnLoginGoogle.setOnTouchListener(new ButtonAnimator(btnLoginGoogle));
        btnLoginFB.setOnTouchListener(new ButtonAnimator(btnLoginFB));
        btnLogin.setOnTouchListener(new ButtonAnimator(btnLogin));


    }
// chuyển trang đăng kí
    public void addButtonSignUp() {
        btnSignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentSignUp = new Intent(LoginActivity.this, SignUpActivity.class);
                startActivity(intentSignUp);
            }
        });
    }
}
