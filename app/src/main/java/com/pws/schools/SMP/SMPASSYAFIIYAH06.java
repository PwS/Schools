package com.pws.schools.SMP;
import android.content.Intent;
//import android.support.v7.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import com.pws.schools.R;

public class SMPASSYAFIIYAH06 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_smpassyafiiyah06);
        getSupportActionBar().setTitle("SMP ISLAM ASSYAFIIYAH 06");

        Button btnmaps = (Button) findViewById(R.id.btnmap);

        btnmaps.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pindahmap= new Intent(SMPASSYAFIIYAH06.this,mapsmpassyafiiyah06.class);
                startActivity(pindahmap);
            }
        });
    }
}
