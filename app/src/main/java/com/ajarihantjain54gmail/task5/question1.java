package com.ajarihantjain54gmail.task5;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class question1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question1);
    }
    public void Wrong1(View view){
        Intent intent = new Intent(this, question2.class);
        startActivity(intent);

    }
    public void Correct1(View view){
        MainActivity obj = new MainActivity();
        obj.answer++;
        Intent intent = new Intent(this, question2.class);
        startActivity(intent);


    }
    public void End1(View view){
        Intent intent = new Intent(this, thisisend.class);
        startActivity(intent);

    }

}
