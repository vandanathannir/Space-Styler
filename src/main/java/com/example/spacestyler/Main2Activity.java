package com.example.marvelmania;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.ArrayList;

public class Main2Activity extends AppCompatActivity implements View.OnClickListener{

    Button next;
    Spinner spinner1, spinner2, spinner3;
    TextView textview1, textview2, textview3;
    ArrayList<String> list1 = new ArrayList<String>();
    ArrayList<String> list2 = new ArrayList<String>();
    ArrayList<String> list3 = new ArrayList<String>();
    ArrayList<String> list4 = new ArrayList<String>();
    ArrayList<String> list5 = new ArrayList<String>();
    ArrayList<String> list6 = new ArrayList<String>();
    ArrayList<String> answers = new ArrayList<String>();
    int page = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        next = (Button) (findViewById(R.id.button1));
        next.setOnClickListener(Main2Activity.this);
        spinner1 = (Spinner) (findViewById(R.id.spinner1));
        spinner2 = (Spinner) (findViewById(R.id.spinner2));
        spinner3 = (Spinner) (findViewById(R.id.spinner3));

        textview1 = findViewById(R.id.textView1);
        textview2 = findViewById(R.id.textView2);
        textview3 = findViewById(R.id.textView3);

        list1.add("Yes");
        list1.add("No");

        list2.add("Yes");
        list2.add("No");

        list3.add("Yes");
        list3.add("No");

        list4.add("Yes");
        list4.add("No");

        list5.add("Yes");
        list5.add("No");

        list6.add("Happy");
        list6.add("Sassy");


        for (int i=0;i<12;i++)
            answers.add("");

        textview1.setText("Do you want glasses?");
        textview2.setText("Do you want hair?");
        textview3.setText("Do you want rings?");

        if (page == 1) {

            next.setText("Next");

            ArrayAdapter<String> adapt1 = new ArrayAdapter<String>(this, R.layout.support_simple_spinner_dropdown_item, list1);
            spinner1.setAdapter(adapt1);

            ArrayAdapter<String> adapt2 = new ArrayAdapter<String>(this, R.layout.support_simple_spinner_dropdown_item, list2);
            spinner2.setAdapter(adapt2);

            ArrayAdapter<String> adapt3 = new ArrayAdapter<String>(this, R.layout.support_simple_spinner_dropdown_item, list3);
            spinner3.setAdapter(adapt3);

            spinner1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                @Override
                public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                    answers.set(0,list1.get(position));
                }

                @Override
                public void onNothingSelected(AdapterView<?> parent) {

                }
            });

            spinner2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                @Override
                public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                    answers.set(1,list2.get(position));
                }

                @Override
                public void onNothingSelected(AdapterView<?> parent) {

                }
            });

            spinner3.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                @Override
                public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                    answers.set(2,list3.get(position));
                }

                @Override
                public void onNothingSelected(AdapterView<?> parent) {

                }
            });
        }
    }

    @Override
    public void onClick(View v) {
        if (page==1)
            page=2;
        else if (page==2)
            page=3;

        if (page == 2) {

            next.setText("Next");

            textview1.setText("Do you want a moon?");
            textview2.setText("Do you want accessories");
            textview3.setText("How do you feel?");

            ArrayAdapter<String> adapt4 = new ArrayAdapter<String>(this, R.layout.support_simple_spinner_dropdown_item, list4);
            spinner1.setAdapter(adapt4);

            ArrayAdapter<String> adapt5 = new ArrayAdapter<String>(this, R.layout.support_simple_spinner_dropdown_item, list5);
            spinner2.setAdapter(adapt5);

            ArrayAdapter<String> adapt6 = new ArrayAdapter<String>(this, R.layout.support_simple_spinner_dropdown_item, list6);
            spinner3.setAdapter(adapt6);

            spinner1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                @Override
                public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                    answers.set(3,list4.get(position));
                }

                @Override
                public void onNothingSelected(AdapterView<?> parent) {

                }
            });

            spinner2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                @Override
                public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                    answers.set(4,list5.get(position));
                }

                @Override
                public void onNothingSelected(AdapterView<?> parent) {

                }
            });

            spinner3.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                @Override
                public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                    answers.set(5,list6.get(position));
                }

                @Override
                public void onNothingSelected(AdapterView<?> parent) {

                }
            });
        }

        if (page == 3) {
            Intent myIntent = new Intent(Main2Activity.this, Main3Activity.class);
            myIntent.putExtra("answers", answers);
            startActivity(myIntent);
        }
        System.out.println(answers);
    }
}
