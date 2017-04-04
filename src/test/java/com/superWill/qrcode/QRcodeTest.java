package com.superWill.qrcode;

import org.junit.Test;

public class QRcodeTest {

	@Test
	public void test() {
		QRcodeGenerater generater = 
				new QRcodeGenerater("C:/QRCode", "png", "qr.png", 200, 200, "梁建贞大逗比《*_*》");
		generater.run();
	}
	
	

}
