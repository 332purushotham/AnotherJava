package com.packge.in;

import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.driverfactory.in.ConfigReader;

public class JavaScriptCode extends ConfigReader{
	
	public JavaScriptCode() throws IOException {

		PageFactory.initElements(driver, this);
	}	
	@Test
public void javaScriptExe() {
	
	JavascriptExecutor jsc=(JavascriptExecutor)driver;
	jsc.executeScript("window.location='https://bstackdemo.com/'");
	jsc.executeScript("window.alert('kishore');");
}
}
