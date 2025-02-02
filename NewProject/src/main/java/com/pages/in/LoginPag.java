package com.pages.in;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.driverfactory.in.ConfigReader;

public class LoginPag {
	public WebDriver driver;
public LoginPag(WebDriver driver) throws IOException{
	this.driver=driver;
	PageFactory.initElements(driver, this);
}

@FindBy(id="input-email")
public WebElement userName;

@FindBy(id="input-password")
public WebElement password;

public void userName(String usr) {
	
	userName.sendKeys(usr);
}
public void password(String pass) {
password.sendKeys(pass);
}


}