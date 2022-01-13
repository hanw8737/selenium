package com.mushishi.Imooc.handle;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;

import com.mushishi.Imooc.page.SureSubmitPage;

public class SureSubmitHandle extends BaseHandle{
	public SureSubmitPage suresubmitpage;
	//public WebDriver driver;
	
	public SureSubmitHandle(WebDriver driver) {
		super(driver);
		this.driver = driver;
		suresubmitpage = new SureSubmitPage(driver);
	}
	
	public void ClickSureSubmitElement() {
		/**
		 * 点击确认订单按钮
		 * */
		ClickElement(suresubmitpage.GetSureSubmitElement());
	}
	

}
