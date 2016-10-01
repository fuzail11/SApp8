package com.example.ff.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView number = (TextView) findViewById(R.id.number_id);
        number.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent numIntent = new Intent(MainActivity.this, Number.class);

                startActivity(numIntent);

            }


        });


        TextView familyMember = (TextView) findViewById(R.id.family_member);
        familyMember.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent familyIntent = new Intent(MainActivity.this, Number.class);

                startActivity(familyIntent);
            }
        });


    }
}
