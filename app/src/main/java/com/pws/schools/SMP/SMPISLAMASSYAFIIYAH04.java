package com.pws.schools.SMP;
import android.content.Intent;
//import android.support.v7.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import com.pws.schools.R;

public class SMPISLAMASSYAFIIYAH04 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_smpislamassyafiiyah04);
        getSupportActionBar().setTitle("SMP ISLAM ASSYAFIIYAH 04");

        Button btnmaps = (Button) findViewById(R.id.btnmap);

        btnmaps.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pindahmap= new Intent(SMPISLAMASSYAFIIYAH04.this,mapsmpassyafiiyah04.class);
                startActivity(pindahmap);
            }
        });
    }
}
