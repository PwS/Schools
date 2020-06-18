package com.pws.schools;

import android.content.Intent;
//import android.support.v7.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;

import com.pws.schools.SD.SDActivity;
import com.pws.schools.SMA.SMAActivity;
import com.pws.schools.SMP.SMPActivity;

public class SekolahActivity extends AppCompatActivity {

    private ImageButton btnsd, btnsmp, btnsma;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sekolah);
        ImageButton simpleImageView = (ImageButton) findViewById(R.id.btnsd);
        simpleImageView.setScaleType(ImageButton.ScaleType.FIT_CENTER);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        btnsd = (ImageButton) findViewById(R.id.btnsd);
        btnsmp = (ImageButton) findViewById(R.id.btnsmp);
        btnsma = (ImageButton) findViewById(R.id.btnsma);

        btnsd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pindahsd = new Intent(SekolahActivity.this, SDActivity.class);
                startActivity(pindahsd);
            }
        });
        btnsmp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pindahsmp = new Intent(SekolahActivity.this, SMPActivity.class);
                startActivity(pindahsmp);
            }
        });
        btnsma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pindahsma = new Intent(SekolahActivity.this, SMAActivity.class);
                startActivity(pindahsma);
            }
        });
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        Intent intent = new Intent(SekolahActivity.this, MainActivity.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(intent);
        return super.onOptionsItemSelected(item);
    }
}
