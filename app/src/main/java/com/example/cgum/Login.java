package com.example.cgum;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.app.ActivityOptions;
import android.content.Intent;
import android.os.Bundle;
import android.util.Pair;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputLayout;
import com.google.firebase.auth.FirebaseAuth;

public class Login extends AppCompatActivity {
    private TextInputLayout email , pass ;
    private Button loginBtn , regBtn;
    private FirebaseAuth mAuth;
    private AuthUtility authUtility;

    private CProgress cProgress;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        getWindow().setStatusBarColor(ContextCompat.getColor(this , R.color.startColor));
        cProgress = new CProgress(Login.this);

        authUtility = AuthUtility.getInstance();
        mAuth = authUtility.getAuth();
        email = findViewById(R.id.email);
        pass = findViewById(R.id.pass);
        loginBtn = findViewById(R.id.login);
        regBtn = findViewById(R.id.reg);


        loginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cProgress.show();
                //Toast.makeText(Login.this, email.getEditText().getText().toString(), Toast.LENGTH_SHORT).show();
                String mail = email.getEditText().getText().toString();
                String password = pass.getEditText().getText().toString();
                if(mail.isEmpty() || password.isEmpty()) {
                    cProgress.cancel();
                    Toast.makeText(Login.this, "Please fill all the fields", Toast.LENGTH_SHORT).show();
                }else{
                    mAuth.signInWithEmailAndPassword(mail , password).addOnCompleteListener(Login.this , task -> {
                        if(task.isSuccessful()){
                            Toast.makeText(Login.this, "Login Successful", Toast.LENGTH_SHORT).show();
                            Intent intent = new Intent(Login.this , MainActivity.class);
                            cProgress.cancel();
                            startActivity(intent);
                            finish();
                        }else{
                            cProgress.cancel();
                            Toast.makeText(Login.this, task.getException().getMessage(), Toast.LENGTH_SHORT).show();
                        }
                    });
                }
            }
        });
        regBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Login.this , Sign_up.class);
                ActivityOptions options = ActivityOptions.makeSceneTransitionAnimation(Login.this);
                startActivity(intent , options.toBundle());
            }
        });
    }
}