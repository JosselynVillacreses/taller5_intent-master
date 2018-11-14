package com.example.josselyn.taller5_intent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class DisplayMessageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_message);

        // Get the Intent that started this activity and extract the string
        Intent intent = getIntent();
        String[] message = intent.getStringArrayExtra("strings");

        // Capture the layout's TextView and set the string as its text
        TextView textView = findViewById(R.id.txt_welcome);
        textView.setText("Bienvenido, \n"+message[0]);
        TextView textView2 = findViewById(R.id.txt_welcome_pass);
        textView2.setText("Contraseña: \n"+message[1]);
        TextView textView3 = findViewById(R.id.txt_welcome_code);
        textView3.setText("Código: \n"+message[2]);
    }
}
