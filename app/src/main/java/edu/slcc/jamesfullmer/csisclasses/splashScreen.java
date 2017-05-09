package edu.slcc.jamesfullmer.csisclasses;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class splashScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        Runnable waitTime = new Runnable()
        {
            public void run()
            {
                nextActivity();
            }
        };

        Handler handler = new Handler();
        handler.postDelayed(waitTime, 3500);
    }

    public void nextActivity()
    {
        Intent intent = new Intent(this, courseListActivity.class);
        startActivity(intent);
    }
}
