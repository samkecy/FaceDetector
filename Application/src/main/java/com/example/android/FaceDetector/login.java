package com.example.android.FaceDetector;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.android.camera2basic.R;

public class login extends AppCompatActivity {


    EditText email, pass;
    Button login;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);


        email = (EditText)findViewById(R.id.edtEmail);
        pass = (EditText)findViewById(R.id.edtPass);

        login = (Button)findViewById(R.id.btnLogin);




        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String userEmail = email.getText().toString();
                String passWord = pass.getText().toString();

                String user = "admin";
                String pass = "1234";

                if (userEmail.equals(user) && passWord.equals(pass)) {
                    finish();

                } else {

                    Intent intent = new Intent(login.this, CameraActivity.class);
                    startActivity(intent);


                }
            }
        });



    }
}
