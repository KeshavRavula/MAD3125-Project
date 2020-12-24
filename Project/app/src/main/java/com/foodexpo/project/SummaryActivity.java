package com.foodexpo.project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class SummaryActivity extends AppCompatActivity {
    TextView summary;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_summary);
        summary=findViewById(R.id.summary);
        summary.setText(" Plan Type : "+OrderActivity.pT+"\n Meals : "+OrderActivity.mT+"\n Meal Type : "+OrderActivity.vn);
    }
    public void goHome(View view){
        Intent home=new Intent(this,RestaurantActivity.class);
        startActivity(home);
    }
}