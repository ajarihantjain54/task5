package com.ajarihantjain54gmail.task5;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class question2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question2);
    }
    public void Wrong2(View view){
        Intent intent = new Intent(this, question3.class);
        startActivity(intent);

    }
    public void Correct2(View view){
        MainActivity obj = new MainActivity();
        obj.answer++;
        Intent intent = new Intent(this, question3.class);
        startActivity(intent);


    }
    public void End2(View view){
        Intent intent = new Intent(this, thisisend.class);
        startActivity(intent);

    }
}
