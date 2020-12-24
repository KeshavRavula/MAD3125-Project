package com.foodexpo.project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText userName, password;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        userName=findViewById(R.id.user);
        password =findViewById(R.id.pass);
    }

    public void Login(View view){

        if(userName.getText().toString().equals("user")&&password.getText().toString().equals("pass")){
            //ToDo Move to next Screen
            Intent login=new Intent(this, RestaurantActivity.class);
            startActivity(login);
        }
           else if(userName.getText().toString().equals("")||password.getText().toString().equals("")){

                Toast.makeText(this,"Please enter Username & Password",Toast.LENGTH_SHORT).show();

            }
            else {
                Toast.makeText(this,"Incorrect Username or Password",Toast.LENGTH_SHORT).show();
            }
    }
}