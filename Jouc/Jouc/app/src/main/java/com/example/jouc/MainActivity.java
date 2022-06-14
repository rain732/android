package com.example.jouc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    public void log_in_button(View View) {
        EditText email = (EditText) findViewById(R.id.username);
        EditText pass = (EditText) findViewById(R.id.password);
        String em = email.getText().toString();
        String pas = pass.getText().toString();

        if (em.equals("admin") && pas.equals("1234aa")) {
            Intent i = new Intent(this, MainActivity2.class);
            startActivity(i);
        }

        else{
            TextView text = (TextView) findViewById(R.id.result);
            text.setText("wrong password");

        }
    }
}
