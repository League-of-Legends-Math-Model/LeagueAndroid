package com.example.sisyphus.leagueapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }

    public void startEquip(View view){
        Intent intent = new Intent(this, Equip_Menu.class);
        startActivity(intent);
    }
}
