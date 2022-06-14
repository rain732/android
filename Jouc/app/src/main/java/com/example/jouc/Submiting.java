package com.example.jouc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Submiting extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.submitting);

        Button Back;
        Back=findViewById(R.id.Back);




        TextView Result;

        String Faculty = getIntent().getStringExtra("EXTRA_SESSION_ID");

        Result=findViewById(R.id.Result);
        Result.setText(Faculty);


    }

    public void Logout ( View View ){
        Intent i = new Intent(this , Login_Page.class);
        startActivity(i);

    }
    public void back(View view){
        Intent BACK=new Intent(this,Jouc.class);
        startActivity(BACK);
    }
    public void Submitting(View view){
        Toast toast=Toast.makeText(this,"Information is submetted",Toast.LENGTH_SHORT);
        toast.show();
    }
}