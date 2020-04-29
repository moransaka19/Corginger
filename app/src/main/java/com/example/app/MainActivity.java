package com.example.app;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    public final static String TAG = "DEBUG";
    Button btnLogIn;
    Button btnSignUp;
    ImageView imgLogo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imgLogo = findViewById(R.id.img_logo);
        Animation rotate = AnimationUtils.loadAnimation(this, R.anim.main_menu_animation);
        imgLogo.startAnimation(rotate);

        btnLogIn = findViewById(R.id.btn_login);
        btnLogIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(v.getContext(), LoginActivity.class);
                startActivity(i);
            }
        });

        btnSignUp = findViewById(R.id.btn_sign_up);
        btnSignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(v.getContext(), RegistrationActivity.class);
                startActivity(i);
            }
        });

    }
}
