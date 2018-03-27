package com.example.administrator.goslinglovelace;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView textView = (TextView) findViewById(R.id.ada_text);
        textView.setMovementMethod(new ScrollingMovementMethod());
        //TextView textView2 = (TextView) findViewById(R.id.james_text);
        //textView2.setMovementMethod(new ScrollingMovementMethod());
    }
}
