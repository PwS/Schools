package com.pws.schools.SD;
import android.content.Intent;
//import android.support.v7.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import com.pws.schools.R;

public class SDALAZHARSYIFABUDIJATIBENING extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sdalazharsyifabudijatibening);
        getSupportActionBar().setTitle("SD AL-AZHAR SYIFA BUDI JATIBENING");

        Button btnmaps = (Button) findViewById(R.id.btnmap);

        btnmaps.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pindahmap= new Intent(SDALAZHARSYIFABUDIJATIBENING.this,mapsdalazharsyifabudijatibening.class);
                startActivity(pindahmap);
            }
        });
    }
}
