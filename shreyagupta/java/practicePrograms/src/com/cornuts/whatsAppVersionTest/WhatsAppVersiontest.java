package com.cornuts.whatsAppVersionTest;

import com.cornuts.whatsAppVersions.WhatsApp2k16;
import com.cornuts.whatsAppVersions.WhatsApp2k18;
import com.cornuts.whatsAppVersions.WhatsApp2k20;

public class WhatsAppVersiontest extends WhatsApp2k18 {

	@Override
	protected void document() {
		System.out.println("Sending Documents feature introduced in 2k18 on whatsApp version");
	}

	public static void main(String[] args) {

		System.out.println("*****WHATSAPP APPLICATION***** ");

		WhatsApp2k16 whatsApp2k16 = new WhatsApp2k16();
		WhatsApp2k18 whatsApp2k18 = new WhatsApp2k18();
		WhatsApp2k20 whatsAapp2k20 = new WhatsApp2k20();
		WhatsAppVersiontest appVersiontest=new WhatsAppVersiontest();

		// whatsAapp2k20.call(); DEFAULT ACCESS MODIFIER CAN NOT BE ACCESSED
		// OUTSIDE THE PACKAGE

		whatsApp2k16.notification();
		appVersiontest.document();
		
		
	}

}
