package com.example.qrcode;

import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.Menu;
import android.view.Window;
import android.view.WindowManager;

import com.google.zxing.client.android.BeepManager;
import com.google.zxing.client.android.CaptureActivity;
import com.google.zxing.client.android.InactivityTimer;
import com.google.zxing.client.android.history.HistoryManager;

public class MainActivity extends CaptureActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
    	Window window = getWindow();
		window.addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
        
        
        hasSurface = false;
		historyManager = new HistoryManager(this);
		historyManager.trimHistory();
		inactivityTimer = new InactivityTimer(this);
		beepManager = new BeepManager(this);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_main, menu);
        return true;
    }
}
