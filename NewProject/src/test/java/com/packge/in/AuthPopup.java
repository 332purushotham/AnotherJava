package com.packge.in;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AuthPopup {
@Test
public void setUp() throws InterruptedException  
{
	
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	JavascriptExecutor jse=(JavascriptExecutor)driver;
	jse.executeScript("window.location='http://omayo.blogspot.com/'");

//	Thread.sleep(2000);
	//jse.executeScript("window.location.reload()");
	String str=jse.executeScript("return document.title").toString();
	System.out.println(str);
	synchronized(driver) {
		driver.wait(6000);
	}
	jse.executeScript("return document.getElementById('link1').click()");
	//ele.sendKeys("telugu");
}	
}