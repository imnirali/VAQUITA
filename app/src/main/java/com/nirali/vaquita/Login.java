package com.nirali.vaquita;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Login extends ActionBarActivity implements View.OnClickListener {
    Button login;
    EditText username;
    EditText password;
    String sUsername, sPassword;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        login = (Button) findViewById(R.id.loginbtn);
        username = (EditText) findViewById(R.id.usernameinput);
        password = (EditText) findViewById(R.id.passwordinput);

        login.setOnClickListener(this);

    }


    @Override
    public void onClick(View v)
    {
        sUsername = username.getText().toString();
        sPassword = password.getText().toString();
        if (sUsername.matches("pateln64@mcmaster.ca")){
            if(sPassword.matches("123abc")){
                Intent i = new Intent(getApplicationContext(),DeviceList.class);
                startActivity(i);
                setContentView(R.layout.activity_device_list);
            }else{
                Toast.makeText(this,"incorrect Password",Toast.LENGTH_SHORT).show();
            }

        }else{
            Toast.makeText(this, "incorrect username", Toast.LENGTH_SHORT).show();
        }

    }
}
