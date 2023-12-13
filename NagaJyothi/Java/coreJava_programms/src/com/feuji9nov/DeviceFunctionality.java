package com.feuji9nov;

public class DeviceFunctionality implements MediaPlayer,InternetBrowser
{

	@Override
	public void playMedia() {
		System.out.println("play the music");
		
	}

	@Override
	public void browseInternet() {
		System.out.println("browsing in internet");
		
	}
	

}
