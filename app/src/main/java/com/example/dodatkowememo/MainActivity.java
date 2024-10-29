package com.example.dodatkowememo;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Random;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    Button one = (Button) findViewById(R.id.bt1);
    Button two = (Button) findViewById(R.id.bt2);
    Button three = (Button) findViewById(R.id.bt3);
    Button four = (Button) findViewById(R.id.bt4);
    Button five = (Button) findViewById(R.id.bt5);
    Button six = (Button) findViewById(R.id.bt6);
    Button seven = (Button) findViewById(R.id.bt7);
    Button eight = (Button) findViewById(R.id.bt8);
    Button nine = (Button) findViewById(R.id.bt9);
    Button ten = (Button) findViewById(R.id.bt10);
    Button eleven = (Button) findViewById(R.id.bt11);
    Button twelve = (Button) findViewById(R.id.bt12);
    Button thirteen = (Button) findViewById(R.id.bt13);
    Button fourteen = (Button) findViewById(R.id.bt14);
    Button fifteen = (Button) findViewById(R.id.bt15);
    Button sixteen = (Button) findViewById(R.id.bt16);


    public int[] play(){
        Random r = new Random();
        int[] values = new int[16];

        for (int i = 0; i < values.length; i++){
            values[i] = r.nextInt(8)+1;
        }
        return values;
    }
    public void setValues(int[] valuesTab){

    }

    public void showNHide(){

    }
    public int countMoves(){
        return 0;
    }
    public void reset(){

    }

    @Override
    public void onClick(View view) {

    }
}