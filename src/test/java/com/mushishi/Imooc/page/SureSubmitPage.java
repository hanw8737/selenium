package com.mushishi.Imooc.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SureSubmitPage extends BasePage {

	public SureSubmitPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	public WebElement GetSureSubmitElement() {
		return GetElement("submit_order");
	}

}
