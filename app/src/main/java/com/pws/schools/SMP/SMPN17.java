package com.pws.schools.SMP;
import android.content.Intent;
//import android.support.v7.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import com.pws.schools.R;

public class SMPN17 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_smpn17);
        getSupportActionBar().setTitle("SMPN 17");

        Button btnmaps = (Button) findViewById(R.id.btnmap);

        btnmaps.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pindahmap= new Intent(SMPN17.this,mapsmpn17.class);
                startActivity(pindahmap);
            }
        });
    }
}
