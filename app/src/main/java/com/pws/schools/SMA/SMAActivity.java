package com.pws.schools.SMA;

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

public class SMAActivity extends AppCompatActivity {
    private ListView lvItemsma;
    private String[] sma = new String[]{
            "SMAN 21 Bekasi"," SMAN 5 Bekasi",
            "SMA Sulthon Aulia Boarding School Bekasi","SMAS Yadika 4","SMAS YATAMA","SMAS ISLAM ASSYAFIIYAH 02"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sma);
        getSupportActionBar().setTitle("Sekolah Menengah Atas");
        lvItemsma = (ListView) findViewById(R.id.list_viewsma);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(SMAActivity.this, R.layout.listsma,R.id.Itemnamesma,sma);
    /*
    Step 2
    Membinding atau memformat data
     */

        lvItemsma.setAdapter(adapter);
        //menset data di dalam listview

        //Step 3
        lvItemsma.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(SMAActivity.this, "Memilih " + sma[position], Toast.LENGTH_SHORT).show();

                if (position == 0) {
                    startActivity(new Intent(SMAActivity.this, SMAN21.class));
                } else if (position == 1) {
                    startActivity(new Intent(SMAActivity.this, SMAN5.class));
                } else if (position == 2) {
                    startActivity(new Intent(SMAActivity.this, SMASULTHON.class));
                } else if (position == 3) {
                    startActivity(new Intent(SMAActivity.this, SMASYADIKA4.class));
                } else if (position == 4) {
                    startActivity(new Intent(SMAActivity.this, SMASYATAMA.class));
                } else if (position == 5) {
                    startActivity(new Intent(SMAActivity.this, SMAASSYAFIIYAH.class));
                }

                //memanggil set on Item ClickListener untuk Listview, jadi jika salah satu item list view diklik akan
                //akan bereaksi menampilkan toast atau aksi lainya.
            }
        });
    }
}
