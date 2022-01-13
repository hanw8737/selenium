package com.mushishi.Imooc;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HandleCookie {
	public WebDriver driver;
	  @BeforeClass
	  public void beforeClass() {
			System.setProperty("webdriver.chrome.driver", "D:\\java\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();
			
	  }
	  
	  @AfterClass
	  public void afterClass() {
		  driver.close();
	  }  
		  
	@BeforeMethod
	public void beforeMethod() {
		driver.get("https://coding.imooc.com/class/303.html");
		try {
			Thread.sleep(20);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	@AfterMethod
	public void afterMethod() {
		System.out.println("afterMethod执行完毕");
	}
	
	@Test
	public void test01() {
		String value = "I5ZTVmZmUzMGE1NDY2OTljZjFjYzkyMTMyMjk3MmUAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAANzIxMzU2MQAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAABNdXNoaXNoaV94dUAxNjMuY29tAAAAAAAAAAAAAAAAAGUwNGVhYWFhOThlZTY3Mzc0YzgxZjY3ODBkMDU2MmU0BLXLXAS1y1w%3DZW";
		System.out.println("登陆失败，，获取到cookie---->");
		Set<Cookie> cookies = driver.manage().getCookies();
		for(Cookie cookie1:cookies) {
			System.out.println("获取到cookie---->"+cookie1);
			if(cookie1.getName().equals("apsid")) {
				System.out.println("登陆成功，，获取到cookie---->"+cookie1);
			}
		}
		driver.manage().deleteAllCookies();
		Cookie cookie = new Cookie("apsid",value,".imooc.com","/",null);
		System.out.println(cookie);
		driver.manage().addCookie(cookie);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("登陆成功，，获取到cookie-------------------->");
		driver.navigate().refresh();
		System.out.println("登陆成功，，获取到cookie-------------------->"+driver.manage().getCookies());
		try {
			Thread.sleep(15000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
//Hm_lpvt_c1c5f01e0fc4d75fd5cbb16f2e713d56=1556856098; path=/; domain=.coding.imooc.com, imooc_uuid=ad8a091d-be9c-4759-94d8-d006dfe764b6; expires=星期六, 02 五月 2020 12:01:33 CST; path=/; domain=.imooc.com, IMCDNS=0; expires=星期六, 04 五月 2019 12:01:38 CST; path=/; domain=.imooc.com, imooc_isnew=1; expires=星期六, 02 五月 2020 12:01:33 CST; path=/; domain=.imooc.com, zg_f375fe2f71e542a4b890d9a620f9fb32=%7B%22sid%22%3A%201556856094872%2C%22updated%22%3A%201556856098144%2C%22info%22%3A%201556856094879%2C%22superProperty%22%3A%20%22%7B%5C%22%E5%BA%94%E7%94%A8%E5%90%8D%E7%A7%B0%5C%22%3A%20%5C%22%E5%AE%9E%E6%88%98%E6%95%B0%E6%8D%AE%E7%BB%9F%E8%AE%A1%5C%22%2C%5C%22Platform%5C%22%3A%20%5C%22web%5C%22%7D%22%2C%22platform%22%3A%20%22%7B%7D%22%2C%22utm%22%3A%20%22%7B%7D%22%2C%22referrerDomain%22%3A%20%22%22%7D; expires=星期六, 02 五月 2020 12:01:38 CST; path=/; domain=.imooc.com, zg_did=%7B%22did%22%3A%20%2216a7bdac0925a-08c694ddfdb5e3-9333061-e12d0-16a7bdac093204%22%7D; expires=星期六, 02 五月 2020 12:01:38 CST; path=/; domain=.imooc.com, cvde=5ccbbd1d64c8a-4; path=/; domain=.imooc.com, Hm_lvt_c1c5f01e0fc4d75fd5cbb16f2e713d56=1556856096; expires=星期六, 02 五月 2020 12:01:38 CST; path=/; domain=.coding.imooc.com, imooc_isnew_ct=1556856093; expires=星期六, 02 五月 2020 12:01:33 CST; path=/; domain=.imooc.com]
	//apsid=	
	//[Hm_lpvt_c1c5f01e0fc4d75fd5cbb16f2e713d56=1556853857; path=/; domain=.coding.imooc.com, imooc_uuid=4ba7750f-d9ab-49f7-bf04-e16205991c20; expires=星期六, 02 五月 2020 11:24:12 CST; path=/; domain=.imooc.com, IMCDNS=0; expires=星期六, 04 五月 2019 11:24:15 CST; path=/; domain=.imooc.com, imooc_isnew=1; expires=星期六, 02 五月 2020 11:24:12 CST; path=/; domain=.imooc.com, zg_f375fe2f71e542a4b890d9a620f9fb32=%7B%22sid%22%3A%201556853855180%2C%22updated%22%3A%201556853855180%2C%22info%22%3A%201556853855189%2C%22superProperty%22%3A%20%22%7B%5C%22%E5%BA%94%E7%94%A8%E5%90%8D%E7%A7%B0%5C%22%3A%20%5C%22%E5%AE%9E%E6%88%98%E6%95%B0%E6%8D%AE%E7%BB%9F%E8%AE%A1%5C%22%2C%5C%22Platform%5C%22%3A%20%5C%22web%5C%22%7D%22%2C%22platform%22%3A%20%22%7B%7D%22%2C%22utm%22%3A%20%22%7B%7D%22%2C%22referrerDomain%22%3A%20%22%22%7D; expires=星期六, 02 五月 2020 11:24:15 CST; path=/; domain=.imooc.com, zg_did=%7B%22did%22%3A%20%2216a7bb893c426d-00b73d20ee8911-9333061-e12d0-16a7bb893c5325%22%7D; expires=星期六, 02 五月 2020 11:24:15 CST; path=/; domain=.imooc.com, cvde=5ccbb45db3649-2; path=/; domain=.imooc.com, Hm_lvt_c1c5f01e0fc4d75fd5cbb16f2e713d56=1556853857; expires=星期六, 02 五月 2020 11:24:16 CST; path=/; domain=.coding.imooc.com, imooc_isnew_ct=1556853853; expires=星期六, 02 五月 2020 11:24:12 CST; path=/; domain=.imooc.com]
	//[Hm_lpvt_c1c5f01e0fc4d75fd5cbb16f2e713d56=1556854022; path=/; domain=.coding.imooc.com, imooc_uuid=dfd0812a-8e91-46fa-b466-1726d2e19389; expires=星期六, 02 五月 2020 11:26:42 CST; path=/; domain=.imooc.com,
	//apsid=I5ZTVmZmUzMGE1NDY2OTljZjFjYzkyMTMyMjk3MmUAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAANzIxMzU2MQAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAABNdXNoaXNoaV94dUAxNjMuY29tAAAAAAAAAAAAAAAAAGUwNGVhYWFhOThlZTY3Mzc0YzgxZjY3ODBkMDU2MmU0BLXLXAS1y1w%3DZW; expires=星期日, 02 六月 2019 11:27:00 CST; path=/; domain=.imooc.com, IMCDNS=0; expires=星期六, 04 五月 2019 11:27:01 CST; path=/; domain=.imooc.com, last_login_username=Mushishi_xu%40163.com; expires=星期五, 10 五月 2019 11:27:00 CST; path=/; domain=.imooc.com, imooc_isnew=1; expires=星期六, 02 五月 2020 11:26:42 CST; path=/; domain=.imooc.com, zg_f375fe2f71e542a4b890d9a620f9fb32=%7B%22sid%22%3A%201556854005359%2C%22updated%22%3A%201556854021546%2C%22info%22%3A%201556854005365%2C%22superProperty%22%3A%20%22%7B%5C%22%E5%BA%94%E7%94%A8%E5%90%8D%E7%A7%B0%5C%22%3A%20%5C%22%E5%AE%9E%E6%88%98%E6%95%B0%E6%8D%AE%E7%BB%9F%E8%AE%A1%5C%22%2C%5C%22Platform%5C%22%3A%20%5C%22web%5C%22%7D%22%2C%22platform%22%3A%20%22%7B%7D%22%2C%22utm%22%3A%20%22%7B%7D%22%2C%22referrerDomain%22%3A%20%22%22%7D; expires=星期六, 02 五月 2020 11:27:01 CST; path=/; domain=.imooc.com, loginstate=1; expires=星期日, 02 六月 2019 11:27:00 CST; path=/; domain=.imooc.com, zg_did=%7B%22did%22%3A%20%2216a7bbade691ed-066d1d2cbd1057-9333061-e12d0-16a7bbade6a20b%22%7D; expires=星期六, 02 五月 2020 11:27:01 CST; path=/; domain=.imooc.com, cvde=5ccbb4f3b4c37-5; path=/; domain=.imooc.com, Hm_lvt_c1c5f01e0fc4d75fd5cbb16f2e713d56=1556854007; expires=星期六, 02 五月 2020 11:27:01 CST; path=/; domain=.coding.imooc.com, imooc_isnew_ct=1556854003; expires=星期六, 02 五月 2020 11:26:42 CST; path=/; domain=.imooc.com]
	//apsid=I5ZTVmZmUzMGE1NDY2OTljZjFjYzkyMTMyMjk3MmUAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAANzIxMzU2MQAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAABNdXNoaXNoaV94dUAxNjMuY29tAAAAAAAAAAAAAAAAAGUwNGVhYWFhOThlZTY3Mzc0YzgxZjY3ODBkMDU2MmU0BLXLXAS1y1w%3DZW; path=/; domain=imooc.com

	
}
