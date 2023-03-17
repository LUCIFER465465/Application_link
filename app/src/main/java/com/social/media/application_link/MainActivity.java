package com.social.media.application_link;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView Ap1,Ap2,Ap3,Ap4,Ap5,Ap6,Ap7,Ap8,Ap9,Ap10,Ap11,Ap12,Ap13,Ap14,Ap15,Ap16,Ap17,Ap18,Ap19,Ap20;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Ap1 = findViewById(R.id.Ap1);
        Ap2 = findViewById(R.id.Ap2);
        Ap3 = findViewById(R.id.Ap3);
        Ap4 = findViewById(R.id.Ap4);
        Ap5 = findViewById(R.id.Ap5);
        Ap6 = findViewById(R.id.Ap6);
        Ap7 = findViewById(R.id.Ap7);
        Ap8 = findViewById(R.id.Ap8);
        Ap9 = findViewById(R.id.Ap9);
        Ap10 = findViewById(R.id.Ap10);
        Ap11= findViewById(R.id.Ap11);
        Ap12 = findViewById(R.id.Ap12);
        Ap13 = findViewById(R.id.Ap13);
        Ap14 = findViewById(R.id.Ap14);
        Ap15 = findViewById(R.id.Ap15);
        Ap16 = findViewById(R.id.Ap16);
        Ap17 = findViewById(R.id.Ap17);
        Ap18 = findViewById(R.id.Ap18);
        Ap19 = findViewById(R.id.Ap19);
        Ap20 = findViewById(R.id.Ap20);

        Ap1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(MainActivity.this,MainActivity1.class);
                startActivity(intent);
            }
        }); Ap2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(MainActivity.this,MainActivity2.class);
                startActivity(intent);
            }
        }); Ap3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(MainActivity.this,MainActivity3.class);
                startActivity(intent);
            }
        }); Ap4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(MainActivity.this,MainActivity4.class);
                startActivity(intent);
            }
        }); Ap5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(MainActivity.this,MainActivity5.class);
                startActivity(intent);
            }
        }); Ap6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(MainActivity.this,MainActivity6.class);
                startActivity(intent);
            }
        }); Ap7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(MainActivity.this,MainActivity7.class);
                startActivity(intent);
            }
        }); Ap8.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                Intent intent = new Intent(MainActivity.this,MainActivity8.class);
                startActivity(intent);
            }
        }); Ap9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(MainActivity.this,MainActivity9.class);
                startActivity(intent);
            }
        }); Ap10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(MainActivity.this,MainActivity10.class);
                startActivity(intent);
            }
        }); Ap11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(MainActivity.this,MainActivity11.class);
                startActivity(intent);
            }
        }); Ap12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(MainActivity.this,MainActivity12.class);
                startActivity(intent);
            }
        }); Ap13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(MainActivity.this,MainActivity13.class);
                startActivity(intent);
            }
        }); Ap14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(MainActivity.this,MainActivity14.class);
                startActivity(intent);
            }
        }); Ap15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(MainActivity.this,MainActivity15.class);
                startActivity(intent);
            }
        }); Ap16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(MainActivity.this,MainActivity16.class);
                startActivity(intent);
            }
        }); Ap17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(MainActivity.this,MainActivity17.class);
                startActivity(intent);
            }
        }); Ap18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(MainActivity.this,MainActivity18.class);
                startActivity(intent);
            }
        }); Ap19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(MainActivity.this,MainActivity19.class);
                startActivity(intent);
            }
        }); Ap20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(MainActivity.this,MainActivity20.class);
                startActivity(intent);
            }
        });
    }
}