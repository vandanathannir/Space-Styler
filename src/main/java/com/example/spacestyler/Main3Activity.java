package com.example.marvelmania;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class Main3Activity extends AppCompatActivity implements View.OnClickListener {

    ArrayList<String> list = new ArrayList<String>();
    Button play;
    Button restart;
    String result;
    String mod;
    TextView text;
    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        ArrayList<String> answers = (ArrayList<String>) getIntent().getSerializableExtra("answers");
        System.out.println("This is my transferred list: "+answers);

        restart=findViewById(R.id.buttonR);
        restart.setOnClickListener(Main3Activity.this);

        result=Results(answers);
        mod=result.toLowerCase();
        mod=mod.replace(" ","");

        System.out.println(mod);
        System.out.println();

        imageView=findViewById(R.id.imageView);
        imageView.setImageResource(R.drawable.skrulls);

        switch(mod){
            case "one":
                imageView.setImageResource(R.drawable.one);
                break;
            case "two":
                imageView.setImageResource(R.drawable.two);
                break;
            case "three":
                imageView.setImageResource(R.drawable.three);
                break;
            case "four":
                imageView.setImageResource(R.drawable.four);
                break;
            case "five":
                imageView.setImageResource(R.drawable.five);
                break;
            case "six":
                imageView.setImageResource(R.drawable.six);
                break;
            case "seven":
                imageView.setImageResource(R.drawable.seven);
                break;
            case "eight":
                imageView.setImageResource(R.drawable.eight);
                break;
            case "nine":
                imageView.setImageResource(R.drawable.nine);
                break;
            case "ten":
                imageView.setImageResource(R.drawable.ten);
                break;
            case "eleven":
                imageView.setImageResource(R.drawable.eleven);
                break;
            case "twelve":
                imageView.setImageResource(R.drawable.twelve);
                break;
            case "thirteen":
                imageView.setImageResource(R.drawable.thirteen);
                break;
            case "fourteen":
                imageView.setImageResource(R.drawable.fourteen);
                break;
            case "fifteen":
                imageView.setImageResource(R.drawable.fifteen);
                break;
            case "sixteen":
                imageView.setImageResource(R.drawable.sixteen);
                break;
            case "seventeen":
                imageView.setImageResource(R.drawable.seventeen);
                break;
            case "eighteen":
                imageView.setImageResource(R.drawable.eighteen);
                break;
            case "nineteen":
                imageView.setImageResource(R.drawable.nineteen);
                break;
            case "twenty":
                imageView.setImageResource(R.drawable.twenty);
                break;
            case "twentyone":
                imageView.setImageResource(R.drawable.twentyone);
                break;
        }

        text=findViewById(R.id.textView);
    }

    @Override
    public void onClick(View v) {
        if (v.getId()==R.id.buttonR){
            startActivity(new Intent(Main3Activity.this, MainActivity.class));
        }
    }

    //glasses hair rings moon accessories mood
    public static String Results (ArrayList<String> list){

        String result = "";

        if (list.get(0).equals("Yes") && list.get(1).equals("Yes") & list.get(2).equals("Yes") && list.get(3).equals("Yes") && list.get(4).equals("Yes") && list.get(5).equals("Happy"))
            result = "twentyone";
            //correct ones
        else if (list.get(0).equals("No") && list.get(1).equals("No") & list.get(2).equals("No") && list.get(3).equals("Yes") && list.get(4).equals("Yes") && list.get(5).equals("Sassy"))
            result = "twelve";

        else if (list.get(0).equals("Yes") && list.get(1).equals("No") & list.get(2).equals("No") && list.get(3).equals("Yes") && list.get(4).equals("Yes") && list.get(5).equals("Sassy"))
            result = "nineteen";

        else if (list.get(0).equals("No") && list.get(1).equals("No") & list.get(2).equals("No") && list.get(3).equals("No") && list.get(4).equals("Yes") && list.get(5).equals("Happy"))
            result = "seven";

        else if (list.get(0).equals("No") && list.get(1).equals("No") & list.get(2).equals("Yes") && list.get(3).equals("No") && list.get(4).equals("Yes") && list.get(5).equals("Happy"))
            result = "eleven";

        else if (list.get(0).equals("Yes") && list.get(1).equals("No") & list.get(2).equals("No") && list.get(3).equals("No") && list.get(4).equals("No") && list.get(5).equals("Sassy"))
            result = "nine";

        if (result.equals("")){
            int rand = (int)(Math.random()*2);
            if (rand == 0)
                result = "fourteen";
            if (rand == 1)
                result = "four";
            if (rand == 2)
                result = "seventeen";
        }

        return result;
    }
}
