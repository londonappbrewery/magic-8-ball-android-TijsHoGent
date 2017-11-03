package com.londonappbrewery.magiceightball;

import android.content.res.TypedArray;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private Button askButton;
    private ImageView eightBall;

    private Random r;

    private TypedArray balls;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        askButton = (Button) findViewById(R.id.ask_button);

        eightBall = (ImageView) findViewById(R.id.image_eight_ball);

        r = new Random();

        balls = getResources().obtainTypedArray(R.array.eight_ball);

        askButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                eightBall.setImageDrawable(balls.getDrawable(r.nextInt(5)));

            }
        });
    }
}
