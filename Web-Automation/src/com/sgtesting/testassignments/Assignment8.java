package com.sgtesting.testassignments;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Assignment8 {
	public static WebDriver oBrowser=null;
	public static WebDriver getbrowser=null;
	public static WebElement add=null, fname=null, lname=null, email=null, uname=null, pwd=null, repwd=null, create=null, login=null, logout=null;
	@Test(priority=1)
	public void launchBrowser()
	{
		try
		{
			System.setProperty("webdriver.chrome.driver", "D:\\DemoWorkSpace\\Web-Automation\\Library\\Drivers\\chromedriver.exe");
			getbrowser=new ChromeDriver();
		}catch(Exception e)
		{
			e.printStackTrace();
		}

	}
	@Test(priority=2)
	public void navigate()
	{
		try
		{
			
			getbrowser.navigate().to("http://localhost:81/user/submit_tt.do");
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	@Test(priority=3)
	public void loginAdmin()
	{
		try
		{
			uname=getbrowser.findElement(By.name("username"));uname.sendKeys("admin");Thread.sleep(1000);
			pwd=getbrowser.findElement(By.name("pwd")); pwd.sendKeys("manager");Thread.sleep(1000);
			login=getbrowser.findElement(By.xpath("//*[@id=\'loginButton\']/div")); login.click();Thread.sleep(1000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	@Test(priority=4)
	public void minimizeFlyOutWindow()
	{
		try
		{
			getbrowser.findElement(By.id("gettingStartedShortcutsPanelId")).click();
			Thread.sleep(1000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	@Test(priority=5)
	public void create3Users()
	{	

		try
		{
			getbrowser.findElement(By.xpath("//*[@id=\'topnav\']/tbody/tr[1]/td[5]/a/div[2]")).click();Thread.sleep(1000);
			//creating user 1
			add=getbrowser.findElement(By.xpath("//*[@id=\'createUserDiv\']/div/div[2]"));	add.click();Thread.sleep(1000);
			fname=getbrowser.findElement(By.name("firstName"));		fname.sendKeys("user1");
			lname=getbrowser.findElement(By.name("lastName"));		lname.sendKeys("last1");
			email=getbrowser.findElement(By.name("email"));			email.sendKeys("user1@mail.com");
			uname=getbrowser.findElement(By.name("username"));		uname.sendKeys("user1");
			pwd=getbrowser.findElement(By.name("password"));		pwd.sendKeys("password1");
			repwd=getbrowser.findElement(By.name("passwordCopy"));	repwd.sendKeys("password1");
			create=getbrowser.findElement(By.xpath("//*[@id=\'userDataLightBox_commitBtn\']/div/span"));	create.click();
			Thread.sleep(1500);
			//creating user 2
			add=getbrowser.findElement(By.xpath("//*[@id=\'createUserDiv\']/div/div[2]"));	add.click();Thread.sleep(1000);
			fname=getbrowser.findElement(By.name("firstName"));		fname.sendKeys("user2");
			lname=getbrowser.findElement(By.name("lastName"));		lname.sendKeys("last2");
			email=getbrowser.findElement(By.name("email"));			email.sendKeys("user2@mail.com");
			uname=getbrowser.findElement(By.name("username"));		uname.sendKeys("user2");
			pwd=getbrowser.findElement(By.name("password"));		pwd.sendKeys("password2");
			repwd=getbrowser.findElement(By.name("passwordCopy"));	repwd.sendKeys("password2");
			create=getbrowser.findElement(By.xpath("//*[@id=\'userDataLightBox_commitBtn\']/div/span"));	create.click();
			Thread.sleep(1500);
			//creating user 3
			add=getbrowser.findElement(By.xpath("//*[@id=\'createUserDiv\']/div/div[2]"));	add.click();Thread.sleep(1000);
			fname=getbrowser.findElement(By.name("firstName"));		fname.sendKeys("user3");
			lname=getbrowser.findElement(By.name("lastName"));		lname.sendKeys("last3");
			email=getbrowser.findElement(By.name("email"));			email.sendKeys("user3@mail.com");
			uname=getbrowser.findElement(By.name("username"));		uname.sendKeys("user3");
			pwd=getbrowser.findElement(By.name("password"));		pwd.sendKeys("password3");
			repwd=getbrowser.findElement(By.name("passwordCopy"));	repwd.sendKeys("password3");
			create=getbrowser.findElement(By.xpath("//*[@id=\'userDataLightBox_commitBtn\']/div/span"));	create.click();
			Thread.sleep(1500);

		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	@Test(priority=6)
	public void logout()
	{
		try
		{
			logout=getbrowser.findElement(By.linkText("Logout"));	logout.click();
			Thread.sleep(1500);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	@Test(priority=7)
	public void loginandlogoutuser1()
	{
		try
		{
			uname=getbrowser.findElement(By.name("username"));		uname.sendKeys("user1");		Thread.sleep(1000);
			pwd=getbrowser.findElement(By.name("pwd"));		pwd.sendKeys("password1");	Thread.sleep(1000);
			login=getbrowser.findElement(By.xpath("//*[@id=\'loginButton\']/div"));		login.click();	Thread.sleep(1500);
			getbrowser.findElement(By.xpath("//*[@id=\'welcomeScreenBoxId\']/div[3]/div/span[1]")).click();  Thread.sleep(2000);
			logout=getbrowser.findElement(By.linkText("Logout"));	logout.click(); 	Thread.sleep(1000);

		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	@Test(priority=8)
	public void loginandlogoutuser2()
	{
		try
		{
			uname=getbrowser.findElement(By.name("username"));uname.sendKeys("user2");Thread.sleep(1000);
			pwd=getbrowser.findElement(By.name("pwd"));pwd.sendKeys("password2");Thread.sleep(1000);
			login=getbrowser.findElement(By.xpath("//*[@id=\'loginButton\']/div"));	login.click();Thread.sleep(1500);
			getbrowser.findElement(By.xpath("//*[@id=\'welcomeScreenBoxId\']/div[3]/div/span[1]")).click();Thread.sleep(2000);
			logout=getbrowser.findElement(By.linkText("Logout"));	logout.click(); Thread.sleep(200);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	@Test(priority=9)
	public void loginandlogoutuser3()
	{
		try
		{
			uname=getbrowser.findElement(By.name("username"));uname.sendKeys("user3");Thread.sleep(1000);
			pwd=getbrowser.findElement(By.name("pwd"));pwd.sendKeys("password3");	Thread.sleep(1000);
			login=getbrowser.findElement(By.xpath("//*[@id=\'loginButton\']/div"));login.click();Thread.sleep(1500);
			getbrowser.findElement(By.xpath("//*[@id=\'welcomeScreenBoxId\']/div[3]/div/span[1]")).click();Thread.sleep(2000);
			logout=getbrowser.findElement(By.linkText("Logout"));	logout.click(); Thread.sleep(200);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	@Test(priority=10)
	public void deleteUser()
	{
		try
		{	

			getbrowser.findElement(By.xpath("//*[@id=\'topnav\']/tbody/tr[1]/td[5]/a/div[2]")).click();Thread.sleep(1000);
			getbrowser.findElement(By.xpath("//*[@id=\'userListTableContainer\']/table/tbody/tr[1]")).click(); 
			Thread.sleep(1500);
			getbrowser.findElement(By.xpath("//*[@id=\'userDataLightBox_deleteBtn\']")).click();Thread.sleep(1500);
			Alert check=getbrowser.switchTo().alert();	check.accept();	Thread.sleep(2000);
			getbrowser.navigate().refresh();Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	@Test(priority=11)
	public void closebrowser()
	{
		try
		{
			getbrowser.close();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
