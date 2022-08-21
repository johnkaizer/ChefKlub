package com.project.chefklub.ui.registratuion;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.project.chefklub.ui.login.LoginActivity;
import com.project.chefklub.MainActivity;
import com.project.chefklub.R;

public class RegistrationActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);
    }

    public void sigin(View view) {
        startActivity(new Intent(RegistrationActivity.this, LoginActivity.class));
        finish();
    }

    public void home(View view) {
        startActivity(new Intent(RegistrationActivity.this, MainActivity.class));
        finish();
    }
}