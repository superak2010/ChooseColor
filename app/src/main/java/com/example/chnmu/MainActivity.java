package com.example.chnmu;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView mwinlose;
    Button mblue1, mblue2, mbluedifferent, mblue4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mblue1 = findViewById(R.id.blue1);
        mblue2 = findViewById(R.id.blue2);
        mbluedifferent = findViewById(R.id.bluedifferent);
        mblue4= findViewById(R.id.blue4);
        mwinlose = findViewById(R.id.winlose);

        mblue1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mwinlose.setText("THUA");
            }
        });

        mblue2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mwinlose.setText("THUA");
            }
        });

        mblue4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mwinlose.setText("THUA");
            }
        });

        mbluedifferent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mwinlose.setText("THẮNG");
            }
        });






    }
}