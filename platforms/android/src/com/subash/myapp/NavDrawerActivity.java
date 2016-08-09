package com.subash.myapp;

import android.os.Bundle;
import org.apache.cordova.CordovaActivity;

/**
 * Created by Subash on 8/9/16.
 */

public class NavDrawerActivity extends CordovaActivity {
  @Override public void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_nav_drawer);
    loadUrl(launchUrl);
  }
}
