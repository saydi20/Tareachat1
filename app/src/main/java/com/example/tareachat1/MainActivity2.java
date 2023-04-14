package com.example.tareachat1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    private TextView tv1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        tv1=(TextView)findViewById(R.id.etv1);

        String dato=getIntent().getStringExtra("dato");
        tv1.setText("Hola "+dato+ " que tal");
    }

    public void Regresar(View view){
        Intent regresar=new Intent(this, MainActivity.class);
        startActivity(regresar);
    }
}