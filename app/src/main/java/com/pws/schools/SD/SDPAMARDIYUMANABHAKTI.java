package com.pws.schools.SD;
import android.content.Intent;
//import android.support.v7.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import com.pws.schools.R;

public class SDPAMARDIYUMANABHAKTI extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sdpamardiyumanabhakti);
        getSupportActionBar().setTitle("SD PAMARDI YUWANA BHAKTI");

        Button btnmaps = (Button) findViewById(R.id.btnmap);

        btnmaps.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pindahmap= new Intent(SDPAMARDIYUMANABHAKTI.this,mapsdpamardiyumanabhakti.class);
                startActivity(pindahmap);
            }
        });
    }
}
