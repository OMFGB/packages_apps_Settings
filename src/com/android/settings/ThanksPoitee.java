package com.android.settings;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class ThanksPoitee extends Activity {
   @Override
   public void onCreate(Bundle savedInstanceState) {
       super.onCreate(savedInstanceState);
       TextView tv = new TextView(this);
       tv.setText("-Free access to his personal quad core box to build on. Without him, I wouldnt be able to dev." + " \n-He came up with the idea for the OMFBOT and currently maintains that." );
       setContentView(tv);
   }
}
