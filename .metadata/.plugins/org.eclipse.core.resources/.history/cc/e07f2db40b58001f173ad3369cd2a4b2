package com.driverfactory.in;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverFactory {
	public static WebDriver driver;
public static void initlizeBrowser(String browser) {
	if(browser.equalsIgnoreCase("chrome"))
	{
		WebDriverManager.chromedriver().setup();
		 driver=new ChromeDriver();
		//driver.get("");
	}
	else if(browser.equalsIgnoreCase("firefox")){
		driver=new FirefoxDriver();
	}
	else {
		System.out.println("give proper driver name");
	}
}
public static WebDriver getDriver() {
	return driver;
}
}
