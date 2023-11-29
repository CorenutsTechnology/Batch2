package com.cornuts.whatsAppVersions;

public class WhatsApp2k20 extends WhatsApp2k18 {
	
	@Override
	public void notification() {
		System.out.println("blue tick introduced in 2k20 on whatsApp");
	}
	
	
	@Override
	void call() {
		System.out.println("video call introduced in 2k20 on whatsApp");
	}
	
	@Override
	protected void document() {
		System.out.println("image document introduced in 2k20 on whatsApp");
	}

}
