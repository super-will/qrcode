package com.superwill.qrcode;

import org.junit.Test;

import com.superwill.qrcode.QRcodeGenerater;

public class QRcodeTest {

	/**
	 * 测试输出二维码
	 * 测试读取二维码
	 */
	@Test
	public void test() {
//		输出目录
		String path = "C:/QRCode";
//		文件名称
		String fileName = "qrcode.png";
		
		QRcodeGenerater generater = 
				new QRcodeGenerater(path, "png", fileName, 200, 200, "www.baidu.com");
		generater.run();
		
		QRcodeParser.parse(path+"/"+fileName);
	}
	
	

}
