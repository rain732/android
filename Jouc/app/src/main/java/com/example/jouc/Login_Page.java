package com.example.jouc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Login_Page extends AppCompatActivity {




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);

    }

    public void log_in_button(View view) {
        EditText email ;
        email=findViewById(R.id.name);
        String em = email.getText().toString();

        EditText pass;
        pass=findViewById(R.id.password);
        String pas = pass.getText().toString();



        if (em.equals("admin") && pas.equals("admin")) {
            Intent i = new Intent(this, Jouc.class);
            startActivity(i);
        }

        else{
            MessageError();
        }
    }
    public void MessageError(){
        Toast toast=Toast.makeText(this,"Invalid Login",Toast.LENGTH_SHORT);
        toast.show();
    }
}
