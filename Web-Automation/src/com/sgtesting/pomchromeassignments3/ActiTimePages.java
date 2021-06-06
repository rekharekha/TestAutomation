package com.sgtesting.pomchromeassignments3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActiTimePages {

	public ActiTimePages(WebDriver oBrowser)
	{
		PageFactory.initElements(oBrowser, this);
	}
	
	//Create WebElement for UserName text field
	private WebElement username;
	
	public WebElement getUserName()
	{
		return username;
	}
	
	//Create WebElement for Password Text Field
	private WebElement pwd;
	
	public WebElement getPassword()
	{
		return pwd;
	}
	
	//Create WebElement for Login button
	@FindBy(xpath="//*[@id='loginButton']/div")
	private WebElement oBtnLogin;
	
	public WebElement getLoginButton()
	{
		return oBtnLogin;
	}
	
	//Create WebElement for FlyOutWindow 
	private WebElement gettingStartedShortcutsPanelId;
	public WebElement getFlyOutWindow()
	{
		return gettingStartedShortcutsPanelId;
	}
	
	//Create WebElement for Logout Link
	@FindBy(linkText="Logout")
	private WebElement oLnkLogout;
	public WebElement getLogoutLink()
	{
		return oLnkLogout;
	}
	
	//user creation
	@FindBy(xpath="//*[@id='topnav']/tbody/tr[1]/td[5]/a/div[2]")
	private WebElement createUser;
	public WebElement createU()
	{
		return createUser;
	}
	
	
	//ADD USER
	@FindBy(xpath="//*[@id='createUserDiv']/div/div[2]")
	private WebElement AddUser;
	public WebElement addU()
	{
		return AddUser;
	}
	
	
	//ADD FIRSTNAME FOR NEW USER
	private WebElement firstName;
	public WebElement firstname()
	{
		return firstName;
	}
	
	
	//ADD LASTNAME FOR NEW USER
	private WebElement lastName;
	public WebElement lastname()
	{
		return lastName;
	}
	
	
	//ADD EMAIL FOR NEW USER
	private WebElement email;
	public WebElement Email()
	{
		return email;
	}
	
	
	//ADD USERNAME FOR NEW USER
	@FindBy(xpath="//*[@id='userDataLightBox_usernameField']")
	private WebElement usern ;
	public WebElement userNa()
	{
		return usern;
	}
	
	
	//ADD PASSWORD FOR NEW USER
	private WebElement password ;
	public WebElement password()
	{
		return password;
	}
	
	
	//RETYPE PASSWORD FOR NEW USER
	private WebElement passwordCopy ;
	public WebElement passwordC()
	{
		return passwordCopy;
	}
	
	
	//SUBMIT BUTTON FOR NEW USER
	@FindBy(xpath="//*[@id='userDataLightBox_commitBtn']/div/span")
	private WebElement commit ;
	public WebElement commit()
	{
		return commit;
	}
	
	
	//CLICK ON USER 1 TAB
	@FindBy(xpath="//*[@id='userListTableContainer']/table/tbody/tr[2]/td[1]/table/tbody/tr/td/div[1]/span[2]")
	private WebElement user ;
	public WebElement user1()
	{
		return user;
	}
	
	
	//DELETE USER BUTTON
	private WebElement userDataLightBox_deleteBtn;
	public WebElement deletebtn()
	{
		return userDataLightBox_deleteBtn;
	}
	
	
	
	//TASKS tab
	@FindBy(xpath="//*[@id='topnav']/tbody/tr[1]/td[3]/a")
	private WebElement task ;
	public WebElement newCustomer()
	{
		return task;
	}
	
	//DROPDOWN TO ADD CUSTOMER
	@FindBy(xpath="//*[@id='cpTreeBlock']/div[2]/div[1]/div[2]/div/div[3]")
	private WebElement addCust ;
	public WebElement addCust()
	{
		return addCust;
	}
	
	
	//NEW CUSTOMER
	@FindBy(xpath="/html/body/div[14]/div[1]")
	private WebElement customer1 ;
	public WebElement Cust1()
	{
		return customer1;
	}
	
	//ENTER NEW CUSTOMER NAME
	@FindBy(xpath="//*//*[@id='customerLightBox_nameField']")
	private WebElement Custname ;
	public WebElement custname()
	{
		return Custname;
	}
	
	
	//COMMIT TO CREATE CUSTOMER
	@FindBy(xpath="//*[@id='customerLightBox_commitBtn']/div/span")
	private WebElement commitCust ;
	public WebElement commitcust()
	{
		return commitCust;
	}
	
	
	//customer action settings
	@FindBy(xpath="//*[@id='cpTreeBlock']/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[2]/div[4]")
	private WebElement settings ;
	public WebElement Custaction()
	{
		return settings;
	}
	
	//customer -action dropdown 
	@FindBy(xpath="//*[@id='taskListBlock']/div[2]/div[1]/div[4]/div/div")
	private WebElement action ;
	public WebElement action()
	{
		return action;
	}
	
	
	//customer delete
	@FindBy(xpath="//*[@id='taskListBlock']/div[2]/div[4]/div/div[3]/div")
	private WebElement delete ;
	public WebElement deletecust()
	{
		return delete;
	}
	
	//customer permanently delete button
	@FindBy(xpath="//*[@id='customerPanel_deleteConfirm_submitBtn']/div")
	private WebElement deletebtn;
	public WebElement deletecustbtn()
	{
		return deletebtn;
	}
	
	//customer description modify
	@FindBy(xpath="//*[@id='taskListBlock']/div[2]/div[2]/div[1]/div[3]/div[2]/div/div[1]/textarea")
	private WebElement modify;
	public WebElement modifycust()
	{
		return modify;
	}
	
	//customer action window close button
	@FindBy(xpath="//*[@id='taskListBlock']/div[2]/div[1]/div[1]")
	private WebElement close;
	public WebElement closecustaction()
	{
		return close;
	}
	
	//project add
	@FindBy(xpath="/html/body/div[14]/div[2]")
	private WebElement padd;
	public WebElement projectadd()
	{
		return padd;
	}
	
	//project name add
	@FindBy(xpath="//*[@id='projectPopup_projectNameField']")
	private WebElement pname;
	public WebElement projectname()
	{
		return pname;
	}
	
	//commit project name button
	@FindBy(xpath="//*[@id='projectPopup_commitBtn']")
	private WebElement pcommit;
	public WebElement projectcommit()
	{
		return pcommit;
	}
	
	//????
	@FindBy(xpath="//*[@id='customerLightBox_commitBtn']/div/span")
	private WebElement click;
	public WebElement projectclick()
	{
		return click;
	}
	
	//project settings click
	@FindBy(xpath="//*[@id='cpTreeBlock']/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[3]/div[3]")
	private WebElement pclick;
	public WebElement projectsettings()
	{
		return pclick;
	}
	
	//project action 
	@FindBy(xpath="//*[@id='taskListBlock']/div[4]/div[1]/div[2]/div[3]/div/div")
	private WebElement paction;
	public WebElement projectaction()
	{
		return paction;
	}
	
	
	//project delete 
		@FindBy(xpath="//*[@id='taskListBlock']/div[4]/div[4]/div/div[3]/div")
		private WebElement pdelete;
		public WebElement projectdelete()
		{
			return pdelete;
		}
		
		
		//project delete permanantly 
		@FindBy(xpath="//*[@id='projectPanel_deleteConfirm_submitBtn']/div")
		private WebElement pdeletep;
		public WebElement projectdeletep()
		{
			return pdeletep;
		}
}
