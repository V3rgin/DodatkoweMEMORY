package com.example.dodatkowememo;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public int[] throwDraw(){
        Random r = new Random();
        int[] values = new int[8];

        for (int i = 0; i < values.length; i++){
            values[i] = r.nextInt(8)+1;
        }
        return values;
    }
}
