package com.pws.schools.SD;
import android.content.Intent;
//import android.support.v7.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import com.pws.schools.R;

public class SDBANIYATULKHOLIDIYAH extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sdbaniyatulkholidiyah);
        getSupportActionBar().setTitle("SD ISLAM BANIYATUL KHOLIDIYAH");

        Button btnmaps = (Button) findViewById(R.id.btnmap);

        btnmaps.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pindahmap= new Intent(SDBANIYATULKHOLIDIYAH.this,mapsdbaniyatulkholidiyah.class);
                startActivity(pindahmap);
            }
        });
    }
}
