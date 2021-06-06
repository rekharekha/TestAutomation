package com.sgtesting.tests;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class FireFoxBrowserTestScriptDemo {
	public static WebDriver oBrowser=null;
	public static void main(String[] args) {

		launchBrowser();
		navigate();
		login();
		minimizeFlyOutWindow();
		logout();
		closeApplication();
	}

	static void launchBrowser()
	{
		try
		{//Load json wire protocol supporting information
			System.setProperty("webdriver.chrome.driver", "D:\\DemoWorkSpace\\Web-Automation\\Library\\Drivers\\chromedriver.exe");
			oBrowser=new ChromeDriver();//open the browser
			oBrowser.manage().window().maximize();//maximize the browser
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	static void navigate()
	{
		try
		{
			oBrowser.get("http://localhost:81/user/submit_tt.do");//Load the URL
			WebDriverWait wait=new WebDriverWait(oBrowser, 30);
			wait.until(ExpectedConditions.attributeToBe(By.id("username"), "id", "username"));
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	static void closeApplication()// Close the browser
	//Validate browser is closed successful
	{
		try
		{
			oBrowser.close();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	static void login()
	{
		try
		{
			oBrowser.findElement(By.id("username")).sendKeys("admin");//2. Enter UN & PWD and click on Login button
			oBrowser.findElement(By.name("pwd")).sendKeys("manager");//Validate login is successful & home page is displayed
			oBrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();

			WebDriverWait wait=new WebDriverWait(oBrowser, 60);
			wait.until(ExpectedConditions.textToBe(By.xpath("//td[text()='Enter Time-Track']"), "Enter Time-Track"));
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	static void minimizeFlyOutWindow()
	{
		try
		{
			WebDriverWait wait=new WebDriverWait(oBrowser, 60);
			wait.until(ExpectedConditions.elementToBeClickable(By.id("gettingStartedShortcutsPanelId")));
			oBrowser.findElement(By.id("gettingStartedShortcutsPanelId")).click();//3. Handle the shortcut window If it appears
			//Shortcut window should be handled successful
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	static void logout()//4. Logout from the application
	//Validate logout should be successful
	{
		try
		{
			oBrowser.findElement(By.linkText("Logout")).click();
			WebDriverWait wait=new WebDriverWait(oBrowser, 30);
			wait.until(ExpectedConditions.attributeToBe(By.id("username"), "id", "username"));
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}


}


