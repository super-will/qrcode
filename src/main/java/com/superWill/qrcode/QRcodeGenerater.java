package com.superWill.qrcode;

import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.util.HashMap;
import java.util.Map;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.google.zxing.MultiFormatWriter;
import com.google.zxing.client.j2se.MatrixToImageWriter;
import com.google.zxing.common.BitMatrix;

/**
 * @author hcguo
 *
 */
public class QRcodeGenerater 
{
	private String path;
	private String format;
	private String fileName;
	private String content;
	private int width;
	private int height;
	
	//初始化参数
    public QRcodeGenerater(String path,String format,String fileName,int width,int height,String content){
    	this.path = path;
    	this.format = format;
    	this.fileName = fileName;
    	this.content = content;
    	this.height = height;
    	this.width = width;
    }
    
    private QRcodeGenerater(){}
    
    /**
     *生成二维码 
     */
    public void run(){
    	Map<EncodeHintType, Object> hints = new HashMap<EncodeHintType, Object>();
    	hints.put(EncodeHintType.CHARACTER_SET, "UTF-8");
    	try {
			BitMatrix bitmatrix = new MultiFormatWriter().encode(content, BarcodeFormat.QR_CODE, width, height, hints);
			Path pathWrite = FileSystems.getDefault().getPath(path, fileName);
			MatrixToImageWriter.writeToPath(bitmatrix, format, pathWrite);// 输出图像  
    	    System.out.println("输出成功");
    	} catch (Exception e) {
			e.printStackTrace();
		}
    }
}
