package com.example.rlwiki;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class CarActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cars);

        if (getIntent().hasExtra("com.example.rlwiki.SOMETHING")) {
            TextView carTextView = (TextView) findViewById(R.id.carTextView);
            String text = getIntent().getExtras().getString("com.example.rlwiki.SOMETHING");
            carTextView.setText(text);
        }

    }
}
