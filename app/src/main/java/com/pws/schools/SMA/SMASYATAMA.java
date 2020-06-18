package com.pws.schools.SMA;

import android.content.Intent;
//import android.support.v7.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.pws.schools.R;

public class SMASYATAMA extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_smasyatama);
        getSupportActionBar().setTitle("SMAS YATAMA");

        Button btnmaps = (Button) findViewById(R.id.btnbantuan);

        btnmaps.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pindahmap= new Intent(SMASYATAMA.this,mapsmayatama.class);
                startActivity(pindahmap);
            }
        });
    }
}
