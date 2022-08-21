package com.project.chefklub.ui.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.project.chefklub.MainActivity;
import com.project.chefklub.R;
import com.project.chefklub.ui.registratuion.RegistrationActivity;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    public void sigup(View view) {
        startActivity(new Intent(LoginActivity.this, RegistrationActivity.class));
        finish();
    }

    public void login(View view) {
        startActivity(new Intent(LoginActivity.this, MainActivity.class));
        finish();
    }
}