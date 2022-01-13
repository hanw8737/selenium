package com.mushishi.Imooc.runcase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseCase {
	public WebDriver driver;
	public WebDriver GetDriver(String browser) {
		
		if (browser.equalsIgnoreCase("chrome")) {
		  	System.setProperty("webdriver.chrome.driver", "D:\\java\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();
		}else {
		  	System.setProperty("webdriver.gecko.driver", "D:\\java\\geckodriver\\geckodriver-v0.24.0-win64\\geckodriver.exe");
		  	driver = new FirefoxDriver();
		}
		return driver;	
	}

}
