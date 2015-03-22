package com.example.passingintent;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.widget.TextView;

public class ActivityB extends ActionBarActivity {

  @Override protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_b);

    int value = getIntent().getIntExtra("val1", 0);

    TextView resultView = (TextView) findViewById(R.id.result);
    resultView.setText("Result: "+Integer.toString(value));
  }

}
