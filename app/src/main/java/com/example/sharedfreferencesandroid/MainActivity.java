package com.example.sharedfreferencesandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.util.HashSet;
import java.util.Set;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if(!DataLocalMananger.getfirstinstalled()){
            Toast.makeText(this, "first install", Toast.LENGTH_SHORT).show();
            DataLocalMananger.setfirstinstalled(true);
        }
        Set<String> name=new HashSet<>();
        name.add("duy dong");
        name.add("duy dong2");
        name.add("duy dong1");
        name.add("duy dong4");
        DataLocalMananger.setStringset(name);

        Button btnclick=findViewById(R.id.btnclick);
        btnclick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,MainActivity2.class);
                startActivity(intent);
            }
        });
    }
}