package com.fitrifajriani.muslimapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainDoa extends AppCompatActivity {
    private Button doaHabisWudhu;
    private Button doaSusah;
    private Button doaburukhati;
    private Button doaBahagia;
    private Button doaMasuk;
    private Button doaCinta;
    private Button doaIlmu;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_doa);

        doaHabisWudhu = (Button)findViewById(R.id.btn_doa_habis_wudhu);
        doaSusah = (Button)findViewById(R.id.btn_doa_susah);
        doaburukhati = (Button)findViewById(R.id.btn_doa_buruk_hati);
        doaBahagia = (Button)findViewById(R.id.btn_doa_bahagia);
        doaMasuk = (Button)findViewById(R.id.btn_doa_masuk);
        doaCinta = (Button)findViewById(R.id.btn_doa_cinta);
        doaIlmu = (Button)findViewById(R.id.btn_doa_ilmu);

        doaHabisWudhu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent fitri = new Intent(MainDoa.this, DoaHabisWudhu.class);
                startActivity(fitri);
            }

        });
        doaSusah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent fitri = new Intent(MainDoa.this, DoaSusah.class);
                startActivity(fitri);
            }
        });
        doaburukhati.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent fitri = new Intent(MainDoa.this, DoaBurukHati.class);
                startActivity(fitri);
            }
        });
        doaBahagia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent fitri = new Intent(MainDoa.this, DoaBahagia.class);
                startActivity(fitri);
            }
        });
        doaMasuk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent fitri = new Intent(MainDoa.this, DoaMasukRumah.class);
                startActivity(fitri);
            }
        });
        doaCinta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent fitri = new Intent(MainDoa.this, DoaCinta.class);
                startActivity(fitri);
            }
        });
        doaIlmu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent fitri = new Intent(MainDoa.this, DoaIlmu.class);
                startActivity(fitri);
            }
        });

    }
}