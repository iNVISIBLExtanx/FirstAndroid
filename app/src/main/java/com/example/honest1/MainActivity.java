package com.example.honest1;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    public static final String EXTRA_TEXT = "com.example.honest1.EXTRA_TEXT";
    public static final String EXTRA_NUMBER = "com.example.honest1.EXTRA_NUMBER";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                openActivity2();
            }
        });
    }
    public void openActivity2(){
        EditText editText1 = (EditText) findViewById(R.id.edittext1);
        String text = editText1.getText().toString();

        EditText editText2 = (EditText) findViewById(R.id.edittext2);
        int number = Integer.parseInt(editText2.getText().toString());

        Intent intent = new Intent(this, Main2Activity.class);
        intent.putExtra(EXTRA_TEXT, text);
        intent.putExtra(EXTRA_NUMBER, number);
        startActivity(intent);
    }
}