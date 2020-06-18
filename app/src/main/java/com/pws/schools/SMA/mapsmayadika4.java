package com.pws.schools.SMA;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

public class mapsmayadika4 extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        String latitude="-6.2685000";
        String longitude="106.9168000";

        openLocation(latitude,longitude);

    }
    private void openLocation(String latitude, String longitude) {
        Intent mapsmayadika4 = new Intent(Intent.ACTION_VIEW, Uri.parse("geo:" +latitude+","+
                longitude+"?z=17&q="+latitude+","+longitude));
        startActivity (mapsmayadika4);
    }
}
