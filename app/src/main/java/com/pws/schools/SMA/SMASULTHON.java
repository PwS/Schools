package com.pws.schools.SMA;

import android.content.Intent;
//import android.support.v7.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.pws.schools.R;

public class SMASULTHON extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_smasulthon);
        getSupportActionBar().setTitle("SMA Sulthon Aulia Boarding School Bekasi");

        Button btnmaps = (Button) findViewById(R.id.btnmapsmasulthon);

        btnmaps.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pindahmap= new Intent(SMASULTHON.this,mapsmasulthon.class);
                startActivity(pindahmap);
            }
        });
    }
}
