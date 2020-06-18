package com.pws.schools.SMA;

import android.content.Intent;
//import android.support.v7.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import com.pws.schools.R;

public class SMAASSYAFIIYAH extends AppCompatActivity {
    private Button btnmaps;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_smaassyafiiyah);
        getSupportActionBar().setTitle("SMAS ISLAM ASSYAFIIYAH 02");

        btnmaps = (Button) findViewById(R.id.btnmap);

btnmaps.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        Intent pindahmap= new Intent(SMAASSYAFIIYAH.this,mapsmaassyafiiyah.class);
        startActivity(pindahmap);
    }
});
    }
}
