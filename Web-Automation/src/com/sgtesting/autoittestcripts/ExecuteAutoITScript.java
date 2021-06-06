package com.sgtesting.autoittestcripts;

public class ExecuteAutoITScript {

	public static void main(String[] args) {
		executeAutoITScript();
	}
	
	static void executeAutoITScript()
	{
		try
		{
			Runtime.getRuntime().exec("D:\\Automation\\AutoIT\\Textscript1.exe");
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}



