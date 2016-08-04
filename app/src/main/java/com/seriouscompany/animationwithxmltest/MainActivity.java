package com.seriouscompany.animationwithxmltest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        animate();
    }

    private void animate() {
        TextView textView = (TextView) findViewById(R.id.textView);
        Animation animation = AnimationUtils.loadAnimation(this, R.anim.translate);
        textView.startAnimation(animation);
    }
}
