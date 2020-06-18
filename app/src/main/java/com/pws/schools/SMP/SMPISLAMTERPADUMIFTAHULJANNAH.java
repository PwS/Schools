package com.pws.schools.SMP;
import android.content.Intent;
//import android.support.v7.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import com.pws.schools.R;

public class SMPISLAMTERPADUMIFTAHULJANNAH extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_smpislamterpadumiftahuljannah);
        getSupportActionBar().setTitle("SMP ISLAM TERPADU MIFTAHUL JANNAH");

        Button btnmaps = (Button) findViewById(R.id.btnmap);

        btnmaps.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pindahmap= new Intent(SMPISLAMTERPADUMIFTAHULJANNAH.this,mapsmpmiftahuljannah.class);
                startActivity(pindahmap);
            }
        });
    }
}
