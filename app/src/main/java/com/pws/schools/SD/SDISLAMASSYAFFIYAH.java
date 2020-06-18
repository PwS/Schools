package com.pws.schools.SD;
import android.content.Intent;
//import android.support.v7.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import com.pws.schools.R;

public class SDISLAMASSYAFFIYAH extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sdislamassyaffiyah02);
        getSupportActionBar().setTitle("SD ISLAM AS SYAFIIYAH 02");

        Button btnmaps = (Button) findViewById(R.id.btnmap);

        btnmaps.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pindahmap= new Intent(SDISLAMASSYAFFIYAH.this,mapsdislamassyaffiyah.class);
                startActivity(pindahmap);
            }
        });
    }
}
