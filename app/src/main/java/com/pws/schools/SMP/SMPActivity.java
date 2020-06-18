package com.pws.schools.SMP;

import android.content.Intent;
//import android.support.v7.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;
import com.pws.schools.R;

public class SMPActivity extends AppCompatActivity {
    private ListView lvItemsmp;
    private String[] smp = new String[]{
            "SMP ISLAM ASSYAFIIYAH 06","SMPN 17","SMP Pelita Alam","SMP PGRI PONDOKGEDE",
            "SMP MIFTAHUL HIDAYAH","SMP SANTO BELLARMINUS","SMP TUNAS CEMERLANG","SMPS MITRA NUSANTARA",
            "SMP ISLAM ASSYAFIIYAH 04","SMP ISLAM AYMAN","SMP ISLAM TERPADU MIFTAHUL JANNAH","SMP IT AL HASSAN"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_smp);
        getSupportActionBar().setTitle("Sekolah Menengah Pertama");
        lvItemsmp = (ListView) findViewById(R.id.list_viewsmp);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(SMPActivity.this, R.layout.listsmp,R.id.Itemnamesmp,smp);
    /*
    Step 2
    Membinding atau memformat data
     */

        lvItemsmp.setAdapter(adapter);
        //menset data di dalam listview

        //Step 3
        lvItemsmp.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(SMPActivity.this, "Memilih "+smp[position], Toast.LENGTH_SHORT).show();

                if (position == 0){
                    startActivity(new Intent(SMPActivity.this, SMPASSYAFIIYAH06.class));
                }else if (position == 1){
                    startActivity(new Intent(SMPActivity.this, SMPN17.class));
                }else if (position == 2){
                    startActivity(new Intent(SMPActivity.this, SMPPELITAALAM.class));
                }else if (position == 3){
                    startActivity(new Intent(SMPActivity.this, SMPPGRI.class));
                }else if (position == 4){
                    startActivity(new Intent(SMPActivity.this, SMPMIFTAHUL.class));
                }else if (position == 5){
                    startActivity(new Intent(SMPActivity.this, SMPSANTOBELLARMINUS.class));
                }else if (position == 6){
                    startActivity(new Intent(SMPActivity.this, SMPTUNASCEMERLANG.class));
                }else if (position == 7){
                    startActivity(new Intent(SMPActivity.this, SMPSMITRANUSANTARA.class));
                }else if (position == 8){
                    startActivity(new Intent(SMPActivity.this, SMPISLAMASSYAFIIYAH04.class));
                }else if (position == 9){
                    startActivity(new Intent(SMPActivity.this, SMPISLAMAYMAN.class));
                }else if (position == 10){
                    startActivity(new Intent(SMPActivity.this, SMPISLAMTERPADUMIFTAHULJANNAH.class));
                }else if (position == 11){
                    startActivity(new Intent(SMPActivity.this, SMPITALHASSAN.class));
                }
                //memanggil set on Item ClickListener untuk Listview, jadi jika salah satu item list view diklik akan
                //akan bereaksi menampilkan toast atau aksi lainya.
        }
    });
    }
}