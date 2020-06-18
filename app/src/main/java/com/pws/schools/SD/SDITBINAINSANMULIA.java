package com.pws.schools.SD;
import android.content.Intent;
//import android.support.v7.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import com.pws.schools.R;

public class SDITBINAINSANMULIA extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sditbinainsanmuli);
        getSupportActionBar().setTitle("SDIT BINA INSAN MULIA");

        Button btnmaps = (Button) findViewById(R.id.btnmap);

        btnmaps.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pindahmap= new Intent(SDITBINAINSANMULIA.this,mapsdbinainsanmulia.class);
                startActivity(pindahmap);
            }
        });
    }
}
