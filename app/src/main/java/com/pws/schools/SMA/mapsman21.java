package com.pws.schools.SMA;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

public class mapsman21 extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        String latitude="-6.2698927";
        String longitude="106.9348223";

        openLocation(latitude,longitude);

    }
    private void openLocation(String latitude, String longitude) {
        Intent Mapsman21 = new Intent(Intent.ACTION_VIEW, Uri.parse("geo:" +latitude+","+
                longitude+"?z=17&q="+latitude+","+longitude));
        startActivity (Mapsman21);
    }
}
