package com.packge.in;

import java.io.IOException;

import org.testng.annotations.Test;

import com.driverfactory.in.ConfigReader;
import com.pages.in.LoginPag;


public class PageFactoryImpl_Class extends ConfigReader{
	LoginPag loginPag;
	public PageFactoryImpl_Class() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}

	@Test
	public void pageFactoryMethod() throws IOException
	{
		driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
		 loginPag=new LoginPag(driver);
		loginPag.userName("sss");
		loginPag.password("gulla");
	}

}
