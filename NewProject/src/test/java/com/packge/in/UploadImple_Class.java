package com.packge.in;

import java.io.File;
import java.io.IOException;

import org.testng.annotations.Test;

import com.driverfactory.in.ConfigReader;
import com.pages.in.UploadPage;

public class UploadImple_Class extends ConfigReader{
	public UploadImple_Class() throws IOException {
		super();
	}
	@Test
public void uploadMethod() {
		driver.get("https://filebin.net/");
	UploadPage UploadPage=new UploadPage(driver);
	File file=new File("D:\\jenkins\\New folder\\one.doc");
	
	UploadPage.upload("D:\\jenkins\\New folder\\one.docx");
}
}
