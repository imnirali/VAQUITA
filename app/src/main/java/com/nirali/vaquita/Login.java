package com.nirali.vaquita;


import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;

import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class Login extends ActionBarActivity implements View.OnClickListener {

//    private static final String TAG = "EmailPassword";
//
//
    private EditText username;
    private EditText passwordField;
    private String sUsername, sPassword;
//
//    private FirebaseAuth mAuth;
//    private FirebaseAuth.AuthStateListener mAuthListener;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        // views and buttons
        findViewById(R.id.loginbtn).setOnClickListener(this);
        findViewById(R.id.signupbtn).setOnClickListener(this);
        username = (EditText) findViewById(R.id.usernameinput);
        passwordField = (EditText) findViewById(R.id.passwordinput);


//        // initializing auth
//        mAuth = FirebaseAuth.getInstance();
//        mAuthListener = new FirebaseAuth.AuthStateListener(){
//            @Override
//            public void onAuthStateChanged(@NonNull FirebaseAuth firebaseAuth) {
//                FirebaseUser user = firebaseAuth.getCurrentUser();
//
//                if (user != null) {
//                    // User is signed in
//                    Log.d(TAG, "onAuthStateChanged:signed_in:" + user.getUid());
//                } else {
//                    // User is signed out
//                    Log.d(TAG, "onAuthStateChanged:signed_out");
//                }
//                updateUI(user);
//            }
//        };

    }
//    @Override
//    public void onStart() {
//        super.onStart();
//        mAuth.addAuthStateListener(mAuthListener);
//    }
//
//    @Override
//    public void onStop() {
//        super.onStop();
//        if (mAuthListener != null) {
//            mAuth.removeAuthStateListener(mAuthListener);
//        }
//    }
//
//    private void createAccount(String email, String password) {
//        Log.d(TAG, "createAccount:" + email);
//        if (!validateForm()) {
//            return;
//        }
//
//
//
//        // [START create_user_with_email]
//        mAuth.createUserWithEmailAndPassword(email, password)
//                .addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
//                    @Override
//                    public void onComplete(@NonNull Task<AuthResult> task) {
//                        Log.d(TAG, "createUserWithEmail:onComplete:" + task.isSuccessful());
//
//                        // If sign in fails, display a message to the user. If sign in succeeds
//                        // the auth state listener will be notified and logic to handle the
//                        // signed in user can be handled in the listener.
//                        if (!task.isSuccessful()) {
//                            Toast.makeText(Login.this, "auth failed",
//                                    Toast.LENGTH_SHORT).show();
//                        }
//
//                        // [START_EXCLUDE]
//
//                        // [END_EXCLUDE]
//                    }
//                });
//        // [END create_user_with_email]
//    }
//
//    private void signIn(String email, String password) {
//        Log.d(TAG, "signIn:" + email);
//        if (!validateForm()) {
//            return;
//        }
//
//
//
//        // [START sign_in_with_email]
//        mAuth.signInWithEmailAndPassword(email, password)
//                .addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
//                    @Override
//                    public void onComplete(@NonNull Task<AuthResult> task) {
//                        Log.d(TAG, "signInWithEmail:onComplete:" + task.isSuccessful());
//
//                        // If sign in fails, display a message to the user. If sign in succeeds
//                        // the auth state listener will be notified and logic to handle the
//                        // signed in user can be handled in the listener.
//                        if (!task.isSuccessful()) {
//                            Log.w(TAG, "signInWithEmail:failed", task.getException());
//                            Toast.makeText(Login.this,"auth failed",
//                                    Toast.LENGTH_SHORT).show();
//                        }
//
//                        // [START_EXCLUDE]
//                        if (!task.isSuccessful()) {
////                            mStatusTextView.setText(R.string.auth_failed);
//                            Toast.makeText(Login.this,"auth failed",
//                                    Toast.LENGTH_SHORT).show();
//                        }
//
//                        // [END_EXCLUDE]
//                    }
//                });
//        // [END sign_in_with_email]
//    }
//
//    private void signOut() {
//        mAuth.signOut();
//        updateUI(null);
//    }
//
//
//
//    private boolean validateForm() {
//        boolean valid = true;
//
//        String email = username.getText().toString();
//        if (TextUtils.isEmpty(email)) {
//            username.setError("Required.");
//            valid = false;
//        } else {
//            username.setError(null);
//        }
//
//        String password = passwordField.getText().toString();
//        if (TextUtils.isEmpty(password)) {
//            passwordField.setError("Required.");
//            valid = false;
//        } else {
//            passwordField.setError(null);
//        }
//
//        return valid;
//    }
//
//    private void updateUI(FirebaseUser user) {
//
//        if (user != null) {
//            Toast.makeText(this,"you are being signed out ",Toast.LENGTH_SHORT).show();
//
//        } else {
//            Intent i = new Intent(getApplicationContext(),DeviceList.class);
//                startActivity(i);
//                setContentView(R.layout.activity_device_list);
//        }
//    }

//
    @Override
    public void onClick(View v)
    {
        sUsername = username.getText().toString();
        sPassword = passwordField.getText().toString();
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

//    @Override
//    public void onClick(View v) {
//        int i = v.getId();
//        if (i == R.id.signupbtn) {
//            createAccount(username.getText().toString(), passwordField.getText().toString());
//        } else if (i == R.id.loginbtn) {
//            signIn(username.getText().toString(), passwordField.getText().toString());
////        } else if (i == R.id.sign_out_button) {
////            signOut();
//        }
//    }
}
