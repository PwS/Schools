package com.pws.schools.SMA;

import android.content.Intent;
//import android.support.v7.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.pws.schools.R;

public class SMASYADIKA4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_smasyadika4);
        getSupportActionBar().setTitle("SMAS YADIKA 4");

        Button btnmaps = (Button) findViewById(R.id.btnbantuan);

        btnmaps.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pindahmap= new Intent(SMASYADIKA4.this,mapsmayadika4.class);
                startActivity(pindahmap);
            }
        });
    }
}
