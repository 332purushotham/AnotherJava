package com.driverfactory.in;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ConfigReader {
	public static WebDriver driver;
	static Properties prop;
	DriverFactory DriverFactory;
	
public ConfigReader() throws IOException
{
prop=new Properties();
String str=	System.getProperty("user.dir");
System.out.println(str);
File file =new File(System.getProperty("user.dir")+"/src/test/resources/config.properties");	///NewProject/src/test/resources/config.properties
FileInputStream fis=new FileInputStream(file);
 prop.load(fis);
driver= initlizeBrowser(prop.getProperty("browser"));
//driver.get("ddddddddddd");
}
public static WebDriver initlizeBrowser(String browser) {
	if(browser.equalsIgnoreCase("chrome"))
	{
		WebDriverManager.chromedriver().setup();
		 driver=new ChromeDriver();
	}
	else if(browser.equalsIgnoreCase("firefox")){
		driver=new FirefoxDriver();
	}
	else {
		System.out.println("give proper driver name");
	}
	return driver;
}
}
