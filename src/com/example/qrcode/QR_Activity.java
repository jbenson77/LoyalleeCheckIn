package com.example.qrcode;

import org.apache.cordova.Config;
import org.apache.cordova.DroidGap;

import android.os.Bundle;

public class QR_Activity extends DroidGap {
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		// Set by <content src="index.html" /> in config.xml
		
		super.loadUrl(Config.getStartUrl());
		super.setIntegerProperty("loadUrlTimeoutValue", 60000);

		
	}
}
