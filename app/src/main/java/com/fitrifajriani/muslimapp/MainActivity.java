package com.fitrifajriani.muslimapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button btn_produk_halal;
    private Button btn_jadwal_sholat;
    private Button btn_doa_harian;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_produk_halal = (Button) findViewById(R.id.btn_produk_halal);
        btn_jadwal_sholat = (Button) findViewById(R.id.btn_jadwal_sholat);
        btn_doa_harian = (Button) findViewById(R.id.btn_doa_harian);


        btn_produk_halal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MainHalal.class);
                startActivity(intent);
            }
        });
        btn_jadwal_sholat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MainSholat.class);
                startActivity(intent);
            }
        });
        btn_doa_harian.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MainDoa.class);
                startActivity(intent);
            }

        });
    }
}
