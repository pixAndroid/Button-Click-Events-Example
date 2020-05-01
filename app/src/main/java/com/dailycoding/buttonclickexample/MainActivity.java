package com.dailycoding.buttonclickexample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button button01, button02, button03;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button01 = findViewById(R.id.button_01);
        button02 = findViewById(R.id.button_02);
        button03 = findViewById(R.id.button_03);

        button01.setOnClickListener(this);
        button02.setOnClickListener(this);
        button03.setOnClickListener(this);


        /*
        Remember: button01.setOnClickListener(this); this statement is not required
        if we approach click event like below.

        button01.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(this, "Button01 Clicked", Toast.LENGTH_SHORT).show();
            }
        });
        button02.......
        button03.......
        */
    }

    @Override
    public void onClick(View v) {
        int id = v.getId();
        if (id == R.id.button_01) {
            Toast.makeText(this, "Button01 Clicked", Toast.LENGTH_SHORT).show();
        } else if (id == R.id.button_02) {
            Toast.makeText(this, "Button02 Clicked", Toast.LENGTH_SHORT).show();
        } else if (id == R.id.button_03) {
            Toast.makeText(this, "Button03 Clicked", Toast.LENGTH_SHORT).show();
        }
    }


    /*
    Remember: In XML, widgets or views must include android:onClick="myButtonClick" attribute ...

    public void myButtonClick(View view) {
        int id = view.getId();

        switch (id) {
            case R.id.button_01:
                Toast.makeText(this, "Button01 Clicked", Toast.LENGTH_SHORT).show();
                break;
            case R.id.button_02:
                Toast.makeText(this, "Button02 Clicked", Toast.LENGTH_SHORT).show();
                break;
            case R.id.button_03:
                Toast.makeText(this, "Button03 Clicked", Toast.LENGTH_SHORT).show();
                break;
        }
    }*/
}
