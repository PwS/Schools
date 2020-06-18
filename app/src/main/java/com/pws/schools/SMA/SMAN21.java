package com.pws.schools.SMA;

import android.content.Intent;
//import android.support.v7.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import com.pws.schools.R;

public class SMAN21 extends AppCompatActivity {
    private Button btnmaps;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sman21);
        getSupportActionBar().setTitle("SMAN 21");

        btnmaps = (Button) findViewById(R.id.btnmap);

        btnmaps.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pindahmap= new Intent(SMAN21.this,mapsman21.class);
                startActivity(pindahmap);
            }
        });
    }
}
