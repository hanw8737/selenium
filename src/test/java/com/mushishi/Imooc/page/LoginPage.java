package com.mushishi.Imooc.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage extends BasePage{
//当前页面发生的
	
	//输入了xxx信息
	//点击了xxx信息
	//在某一个     页面，找到了某个    元素，输入      了xxx信息
	//在某一个页面，找到了某个元素，点击了xxx信息
	
	//按照页面进行所有元素的封装
	//按照页面对所有元素的操作进行封装
	//按照页面对所有case进行封装
	
	
	//1、创建一个登陆页面，然后把页面元素都封装起来 
	//LoginPage.java
	//获取元素
	/**
	 * 获取 邮箱 元素
	 * 获取 密码 元素
	 * 获取 7天登陆 元素
	 * 获取 登陆按钮 元素
	 * */
	
	public LoginPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	//RegisterPage.java
	//获取元素
	/**
	 * 获取 手机号 元素
	 * 获取 验证码 元素
	 * 获取 注册按钮 元素
	 * */
	
	
	public WebElement GetEmailElement() {
		return GetElement("username");
	}
	
	public WebElement GetPasswordElement() {
		return GetElement("password");
	}
	
	public WebElement GetSenvenElement() {
		return GetElement("senven");
	}
	
	public WebElement GetLoginButtonElement() {
		return GetElement("loginbutton");
	}
	
	public WebElement GetUsePngElement() {
		return GetElement("headpng");
	}
	
	public WebElement GetUseInfoElement() {
		return GetElement("userinfo");
	}
	
	public WebElement GetSigninButtonElement() {
		return GetElement("signin_button");
	}
	

	
	//LoginHandle.java
	/**
	 * 输入  邮箱
	 * 输入  密码
	 * 点击  7天登陆
	 * 点击  登陆按钮
	 * 
	 * */
	
	
	//LoginCase.java
	/**
	 * （1）、
	 * 输入正确邮箱
	 * 输入错误密码
	 * 点击登陆
	 * 
	 * 
	 * （2）、
	 * 输入错误邮箱
	 * 输入错误密码
	 * 点击登陆
	 * */
	
	// 元素、数据、case的分离
	
}
