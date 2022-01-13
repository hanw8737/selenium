package com.mushishi.Imooc.handle;

import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BaseHandle {
	public WebDriver driver;
	public BaseHandle(WebDriver driver) {
		this.driver = driver;
	}
	
	/**
	 * 植入cookie
	 * */
	public void  SetUserCookie() {
		String value = "I5ZTVmZmUzMGE1NDY2OTljZjFjYzkyMTMyMjk3MmUAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAANzIxMzU2MQAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAABNdXNoaXNoaV94dUAxNjMuY29tAAAAAAAAAAAAAAAAAGUwNGVhYWFhOThlZTY3Mzc0YzgxZjY3ODBkMDU2MmU0BLXLXAS1y1w%3DZW";
		driver.manage().deleteAllCookies();
		Cookie cookie = new Cookie("apsid",value,".imooc.com","/",null);
		driver.manage().addCookie(cookie);
	}
	
	
	public void ClearText(WebElement element) {
		/**
		 * 		清空输入框
		 * */
		element.clear();
	}
	
	/**
	 * 获取title
	 * */
	public String GetTitle() {
		return driver.getTitle();
	}
	
	public void ClickElement(WebElement element) {
		element.click();
	}
}
