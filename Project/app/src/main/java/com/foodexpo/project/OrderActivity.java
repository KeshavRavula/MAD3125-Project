package com.foodexpo.project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.ArrayList;

public class OrderActivity extends AppCompatActivity implements View.OnClickListener {

    TextView welcomeText;
    Spinner planType;
    CheckBox breakfast,lunch,dinner;
    RadioButton veg,nonveg;

    public static String pT="";
    public static ArrayList<String> mT=new ArrayList<>();
    public static String vn="";

    String plType[]={"Weekly","Bi-Weekly","Monthly","Quarterly"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order);
        welcomeText = findViewById(R.id.restWlcm);
        welcomeText.setText(RestaurantActivity.welcomeRestMessage);
        planType=findViewById(R.id.planTypespinner);
        breakfast=findViewById(R.id.breakfast);
        lunch=findViewById(R.id.lunch);
        dinner=findViewById(R.id.dinner);
        veg=findViewById(R.id.veg);
        nonveg=findViewById(R.id.nonVeg);

        ArrayAdapter planT=new ArrayAdapter(this,android.R.layout.simple_expandable_list_item_1,plType);
        planType.setAdapter(planT);
        planType.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                pT=plType[i];
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        breakfast.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(breakfast.isChecked()){
                    mT.add("Breakfast");
                }
                else {
                    mT.remove("Breakfast");
                }
            }
        });
        lunch.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(lunch.isChecked()){
                    mT.add("Lunch");
                }
                else {
                    mT.remove("Lunch");
                }
            }
        });
        dinner.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(dinner.isChecked()){
                    mT.add("Dinner");
                }
                else {
                    mT.remove("Dinner");
                }
            }
        });

        veg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                vn="Veg";
            }
        });
        nonveg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                vn="Non-Veg";
            }
        });
    }

    @Override
    public void onClick(View view) {
        System.out.println("---------"+pT+"-----------"+mT+"----------"+vn);
        Intent summary=new Intent(this,SummaryActivity.class);
        startActivity(summary);
    }
}