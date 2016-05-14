package com.training.android.clickcounter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private int mCounter;

    private TextView mTvCounter;
    private Button   mBtnClickMe;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mTvCounter = (TextView) findViewById(R.id.tvCounter);
        mBtnClickMe = (Button) findViewById(R.id.btnClickMe);

        // Set the appropriate listener
        mBtnClickMe.setOnClickListener(this);
    }

    public void clickMe() {
        mCounter++;
        mTvCounter.setText(String.valueOf(mCounter));
    }

    @Override
    public void onClick(View v) {
        clickMe();
    }
}
