package com.cornuts.whatsAppVersions;

public class WhatsApp2k18 extends WhatsApp2k16 {

	@Override
	public void notification() {
		System.out.println("double tick introduced in 2k18 on whatsApp");
	}

//	@Override
//	void message() {
//		System.out.println("images");
//	}CAN NOT OVERRIDE PRIVATE ACCESS MODIFIER

	// default access modifier
	void call() {
		System.out.println("voice call introduced in 2k18 on whatsApp");
	}

	protected void document() {
		System.out.println("PDF documents introduced in 2k18 on whatsApp");
	}
}
