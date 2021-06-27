package com.example.maildot;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.material.textfield.TextInputLayout;

public class SignUp extends AppCompatActivity {

    TextInputLayout regName, regUserName, regEmail, regPhoneNo, regPassword;
    Button regBtn, regToLoginBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
//Hooks to all xml elements in activity_sign_up.xml
        regName = findViewById(R.id.reg_name);
        regUserName = findViewById(R.id.reg_userName);
        regEmail = findViewById(R.id.reg_email);
        regPhoneNo = findViewById(R.id.reg_phoneNo);
        regPassword = findViewById(R.id.reg_password);
        regBtn = findViewById(R.id.reg_button);
        regToLoginBtn = findViewById(R.id.reg_toLogIn);
//Save data in FireBase on button click
        regBtn.setOnClickListener(new View.OnClickListener () {
            @Override
            public void onClick(View view) {

            }
        });
    }
}