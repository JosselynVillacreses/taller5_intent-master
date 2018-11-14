package com.example.josselyn.taller5_intent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    public static final String EXTRA_MESSAGE = "com.example.myfirstapp.MESSAGE";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void sendMessage(View view) {
        // Do something in response to button
        Intent intent = new Intent(this, DisplayMessageActivity.class);
        EditText txtname = (EditText) findViewById(R.id.txt_name);
        EditText txtpass = (EditText) findViewById(R.id.txt_pass);
        EditText txtcode = (EditText) findViewById(R.id.txt_code);



        String name = txtname.getText().toString();
        String pass = txtpass.getText().toString();
        String code = txtcode.getText().toString();


        String[] title = new String[]{
                ""+name,
                ""+pass,
                ""+code
        };


        intent.putExtra("strings", title);
        startActivity(intent);
    }
}
