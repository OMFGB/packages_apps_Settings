package com.android.settings;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class ThanksDrod extends Activity {
   @Override
   public void onCreate(Bundle savedInstanceState) {
       super.onCreate(savedInstanceState);
       TextView tv = new TextView(this);
       tv.setText("-Built us many of the maazing kernels you will find in our roms." );
       setContentView(tv);
   }
}
