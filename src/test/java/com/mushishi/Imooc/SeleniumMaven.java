package com.mushishi.Imooc;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.mushishi.Imooc.util.ProUtil;

public class SeleniumMaven {

	public WebDriver driver;
	public void InitDriver() {
		System.setProperty("webdriver.chrome.driver", "D:\\java\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://www.imooc.com/user/newlogin/from_url/1005/");
		//driver.close();
	}
	
	@Test
	public void UserLogin() {
		
		ProUtil pro = new ProUtil("user.properties");
		String user = null;
		String username;
		String password;
		int Lines = pro.GetLines();
		for(int i = 0; i<Lines;i++) {
			InitDriver();
			user = pro.GetPro("user"+i);
			 //username=name>email
			username = user.split(">")[0];
			password = user.split(">")[1];
			
			//WebElement EmailElement = driver.findElement(By.name(UserElement));
			WebElement EmailElement = GetElement("username");
			WebElement PassWordElement = GetElement("password");
			WebElement LoginButtonElement = GetElement("loginbutton");
			EmailElement.sendKeys(username);
			PassWordElement.sendKeys(password);
			LoginButtonElement.click();
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			try {
				WebElement UserPng = GetElement("headpng");
				Actions  MoseActions = new Actions(driver);
				MoseActions.moveToElement(UserPng).perform();
				String UserNameInfo = GetElement("userinfo").getText();
				if (UserNameInfo.equals("慕虎0064869")) {
					System.out.println("登陆成功");
				}else {
					System.out.println("用户信息不匹配:"+UserNameInfo);
				}
				
				
			}catch(Exception e) {
				System.out.println("登陆失败");
			}
			
			driver.close();
			
		}

		
	}
	
	
	public By GetByLocal(String key) {
		ProUtil pro = new ProUtil("element.properties");
		String Locator = pro.GetPro(key); //username=name>email
		String LocatorBy = Locator.split(">")[0];
		String LocatorValue = Locator.split(">")[1];
		if(LocatorBy.equals("id")) {
			return By.id(LocatorValue);
		}else if(LocatorBy.equals("name")) {
			return By.name(LocatorValue);
		}else if(LocatorBy.equals("className")) {
			return By.className(LocatorValue);
		}else {
			return By.xpath(LocatorValue);
		}
	}
	
	
	public void GetByLocator(String key) {

	}
	
	public WebElement GetElement(String key) {
		WebElement Element = driver.findElement(this.GetByLocal(key));
		return Element;
	}
	


}
