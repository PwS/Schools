package com.pws.schools;
import android.content.DialogInterface;
import android.content.Intent;
//import android.support.v7.app.AlertDialog;
import androidx.appcompat.app.AlertDialog;
//import android.support.v7.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button btnsekolah , btnbantuan , btnabout , btnexit ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnsekolah = (Button) findViewById(R.id.btnsekolah);
        btnbantuan    = (Button) findViewById(R.id.btnbantuan);
        btnabout   = (Button) findViewById(R.id.btnabout);
        btnexit    = (Button) findViewById(R.id.btnexit);

        btnsekolah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pindahsekolah = new Intent(MainActivity.this, SekolahActivity.class);
                startActivity(pindahsekolah);
            }
        });
        btnbantuan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pindahbantuan = new Intent(MainActivity.this, BantuanActivity.class);
                startActivity(pindahbantuan);
            }
        });
        btnabout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pindahabout = new Intent(MainActivity.this,AboutActivity.class);
                startActivity(pindahabout);
            }
        });

        btnexit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder alertKeluar = new AlertDialog.Builder(MainActivity.this);
                alertKeluar
                        .setMessage("Ingin keluar dari aplikasi?")
                        .setCancelable(false)
                        .setPositiveButton("Ya", new AlertDialog.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface arg0, int arg1) {
                                finish();}}).
                        setNegativeButton("Tidak", new AlertDialog.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog,int which)
                            {
                                dialog.cancel();
                            }
                        });
                AlertDialog a = alertKeluar.create();
                a.show();
            }
        });
                }
    @Override
    public void onBackPressed() {
        new AlertDialog.Builder(this)
                .setMessage("Ingin keluar dari aplikasi?")
                .setCancelable(false)
                .setPositiveButton("Ya", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface arg0, int arg1) {
                    finish();}})
                .setNegativeButton("Tidak", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();
                    }
                })
                .show();
            }}


