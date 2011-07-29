package com.android.settings;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class Changelog131 extends Activity {
   @Override
   public void onCreate(Bundle savedInstanceState) {
       super.onCreate(savedInstanceState);
       TextView tv = new TextView(this);
       tv.setText("-Rebuilt from scratch yet again...again. Hopefully for the last time." + "\n-Updated to android 2.3.5" + "\n-Add Hero to list of supported devices." + "\n-Add OG Droid to list of supported devices." + "\n-Add Thunderbolt to list of supported devices." + "\n-Add Fascinate to list of supported devices." + "\n-Add Showcase to list of supported devices." + "\n-Add Mesmerize to list of supported devices." + "\n-Add FM Radio app." + "\n-Total overhaul of the God Mode app, now featuring special rom settings, as well as CWM backup/restores, nightly build downloads, and other T3hh4xx0r addons." + "\n-Enable endless looping in the launcher." + "\n-Enable launcher rotation settings." + "\n-Return of the old centered lockscreen and LCD clock font." + "\n-Enabled scrollable widgets in stock Launcher2." + "\n-Enabled fully remappable hotseat keys." + "\n-Added overscroll weight and style options to God Mode." + "\n-Long press on music control toggle brings you to the music application." + "\n-SMS and Phone longpress shortcut added to the lockscreen." + "\n-Enabled quick uninstall of apps from stock Launcher2." + "\n-Add back in swipe to clear notification" + "\n-Allow hiding of individual status bar icons." + "\n-Long press Back to kill applications." + "\n-Introduction of our wallpapers app, featuring custom wallpapers." + "\n-Introduction of the new OMFT theme, available as an optional DL." + "\n-New lockscreen styles, including rotary, no lockscreen at all, and the new Honeycomb Concept lockscreen by LinuxMotion." + "\n-Added DSPManager by request." + "\n-New custom kernels available for many devices." + "\n-Addition of many new battery styles, including the MUIU battery type.");
       setContentView(tv);
   }
}
