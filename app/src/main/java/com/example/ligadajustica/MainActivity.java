package com.example.ligadajustica;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void superman(View view){
        Intent intent;
        intent = new Intent(this, com.example.ligadajustia.Superman.class);
        startActivity(intent);
    }
    public void batman(View view){
        Intent intent = new Intent(this, com.example.ligadajustia.batman.class);
        startActivity(intent);
    }
    public void mulherMaravilha(View view){
        Intent intent = new Intent(this, com.example.ligadajustia.MulherMaravilha.class);
        startActivity(intent);
    }
    public void flash(View view){
        Intent intent = new Intent(this, Flash.class);
        startActivity(intent);
    }
}
