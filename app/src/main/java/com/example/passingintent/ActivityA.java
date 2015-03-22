package com.example.passingintent;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;

public class ActivityA extends ActionBarActivity {

  @Override protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_a);

    findViewById(R.id.start).setOnClickListener(new View.OnClickListener() {
      @Override public void onClick(View v) {
        startSecond();
      }
    });
  }

  private void startSecond(){
    Intent i = new Intent(this, ActivityB.class);
    i.putExtra("val1", 3);
    startActivity(i);
  }
}
