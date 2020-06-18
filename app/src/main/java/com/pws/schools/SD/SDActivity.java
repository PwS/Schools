package com.pws.schools.SD;

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

public class SDActivity extends AppCompatActivity {
    private ListView lvItemsd;
    private String[] sd = new String[]{
            "SD AL-AZHAR SYIFA BUDI JATIBENING","SD ASSHODRIYAH 9 ISLAMIC PRIMARY SCHOOL","SD ISLAM TERPADU IQRO",
            "SD YATIM ASSYAFIIYAH","SD ISLAM TERPADU AL BARKAH","SD PAMARDI YUWANA BHAKTI","SD PELITA ALAM","SDIT BINA INSAN MULIA",
            "SD ISLAM KASIH SAYANG IBU","SD ISLAM ROUDHOTUL MUTTAQIN","SD ISLAM TERPADU MIFTAHUL JANNAH","SD SYAFIUL IKHWAN",
            "SD ISLAM AL-AMAL","SD ISLAM ARMINA","SD IT AN-NUR","SD SANTO BELLARMINUS","SD EDELWEISS","SD ISLAM BANIYATUL KHOLIDIYAH",
            "SDIT GEMBIRA"," SD TUNAS CEMERLANG","SD ISLAM AS SYAFIIYAH 02","SD MARTHA"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sd);
        getSupportActionBar().setTitle("Sekolah Dasar");
        lvItemsd = (ListView) findViewById(R.id.list_viewsd);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(SDActivity.this, R.layout.listsd,R.id.Itemnamesd,sd);
    /*
    Step 2
    Membinding atau memformat data
     */

        lvItemsd.setAdapter(adapter);
        //menset data di dalam listview

        //Step 3
        lvItemsd.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(SDActivity.this, "Memilih "+sd[position], Toast.LENGTH_SHORT).show();

                if (position == 0){
                    startActivity(new Intent(SDActivity.this,SDALAZHARSYIFABUDIJATIBENING.class));}
                else if (position == 1){
                    startActivity(new Intent(SDActivity.this,SDASSHODRIYAH.class));}
                else if (position == 2){
                    startActivity(new Intent(SDActivity.this,SDIQRO.class));}
                else if (position == 3){
                    startActivity(new Intent(SDActivity.this,SDASSYAFIIYAH.class));}
                else if (position == 4){
                    startActivity(new Intent(SDActivity.this,SDALBARKAH.class));}
                else if (position == 5){
                    startActivity(new Intent(SDActivity.this,SDPAMARDIYUMANABHAKTI.class));}
                else if (position == 6){
                    startActivity(new Intent(SDActivity.this,SDPELITAALAM.class));}
                else if (position == 7){
                    startActivity(new Intent(SDActivity.this,SDITBINAINSANMULIA.class));}
                else if (position == 8){
                    startActivity(new Intent(SDActivity.this,SDISLAMKASIHSAYANGIBU.class));}
                else if (position == 9){
                    startActivity(new Intent(SDActivity.this,SDROUDHOTUL.class));}
                else if (position == 10){
                    startActivity(new Intent(SDActivity.this,SDMIFTAHULJANNAH.class));}
                else if (position == 11){
                    startActivity(new Intent(SDActivity.this,SDSYAFIULIKHWAN.class));}
                else if (position == 12){
                    startActivity(new Intent(SDActivity.this,SDALAMAL.class));}
                else if (position == 13){
                    startActivity(new Intent(SDActivity.this,SDARMINA.class));}
                else if (position == 14){
                    startActivity(new Intent(SDActivity.this,SDANNUR.class));}
                else if (position == 15){
                    startActivity(new Intent(SDActivity.this,SDSANTOBELLARMINUS.class));}
                else if (position == 16){
                    startActivity(new Intent(SDActivity.this,SDEDELWEISS.class));}
                else if (position == 17){
                    startActivity(new Intent(SDActivity.this,SDBANIYATULKHOLIDIYAH.class));}
                else if (position == 18){
                    startActivity(new Intent(SDActivity.this,SDITGEMBIRA.class));}
                else if (position == 19){
                    startActivity(new Intent(SDActivity.this,SDTUNASCEMERLANG.class));}
                else if (position == 20){
                    startActivity(new Intent(SDActivity.this,SDISLAMASSYAFFIYAH.class));}
                else if (position == 21){
                    startActivity(new Intent(SDActivity.this,SDMARTHA.class));}

                //memanggil set on Item ClickListener untuk Listview, jadi jika salah satu item list view diklik akan
                //akan bereaksi menampilkan toast atau aksi lainya.
                //Step 4
            }
        });
    }
}
