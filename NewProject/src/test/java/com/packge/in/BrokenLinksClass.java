package com.packge.in;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.driverfactory.in.ConfigReader;

import com.setup.in.SetupClass;

public class BrokenLinksClass extends ConfigReader{
	
public BrokenLinksClass() throws IOException {

	PageFactory.initElements(driver, this);
}	
@Test
public void setUpUrl() throws IOException {
	
	driver.get("https://bstackdemo.com/");
List<WebElement> ele=driver.findElements(By.tagName("a")); 
for(WebElement single:ele) {
System.out.println(single.getAttribute("href"));
String strr=single.getAttribute("href");
URL url=new URL(strr);
HttpURLConnection huc=(HttpURLConnection) url.openConnection();
huc.setConnectTimeout(200);

 huc.connect();
 if(huc.getResponseCode()==200) {
	 System.out.println(huc.getResponseCode()+" "+huc.getResponseMessage()+ "" + strr);}
	 else {
		 System.err.println(huc.getResponseCode()+" "+huc.getResponseMessage()+ "" + strr);
	 }
 }
	 
	 
}
}

