package com.training.android.clickcounter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private int mCounter;

    private TextView mTvCounter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mTvCounter = (TextView) findViewById(R.id.tvCounter);
    }

    public void clickMe(View view) {
        mCounter++;
        mTvCounter.setText(String.valueOf(mCounter));
    }
}
