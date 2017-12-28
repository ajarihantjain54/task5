package com.ajarihantjain54gmail.task5;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

public class thisisend extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thisisend);
        MainActivity obj = new MainActivity();
        TextView textView = (TextView) findViewById(R.id.textview);
        if(obj.answer == 1)
            textView.setText("1");
        if(obj.answer == 2)
            textView.setText("2");
        if(obj.answer == 3)
            textView.setText("3");
        if(obj.answer == 0)
            textView.setText("0");



    }
}
