package com.foodexpo.project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class RestaurantActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {
    TextView welcomeTxt;
    ListView restaurantList;
    ArrayList<Restaurant> restList = new ArrayList<>();
    public static String welcomeRestMessage;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rest);
        fillData();
        welcomeTxt =findViewById(R.id.welcome);
        welcomeTxt.setText("Welcome Mr.Wick");

        restaurantList = findViewById(R.id.restList);
        restaurantList.setAdapter(new RestaurantAdapter(this,restList));

        restaurantList.setOnItemClickListener(this);
    }

    public void fillData(){
        restList.add(new Restaurant("KFC","Scarborough","kfc"));
        restList.add(new Restaurant("Mc Donalds","Toronto","mcd"));
        restList.add(new Restaurant("Tim Hortons","Markham","tim"));
        restList.add(new Restaurant("Paradise Biryani","Mississuaga","paradise"));
        restList.add(new Restaurant("Hyderabad House","Toronto","hydhouse"));
    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
        for(int j=0;j<restList.size();j++){
            if(j==i){
                welcomeRestMessage = restList.get(i).getRestName();
                Intent intent = new Intent(RestaurantActivity.this,OrderActivity.class);
                startActivity(intent);
            }
        }
    }
}