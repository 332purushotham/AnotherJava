package com.packge.in;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ReloadClass {
	WebDriver driver;
	@BeforeMethod
	public void setUp()
	{
	WebDriverManager.chromedriver().setup();
	 driver=new ChromeDriver();
	driver.manage().window().maximize();
		
	}
	@Parameters("url")
@Test
	public void reloadMethod(String url) {
		driver.get(url);
		Actions action=new Actions(driver);
		action.sendKeys(Keys.F1);
		
	}
}
