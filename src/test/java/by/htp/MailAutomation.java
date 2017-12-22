package by.htp;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import by.htp.steps.Steps;

public class MailAutomation {
	
	private Steps steps;
	private final String USERNAME = "mailautomation";
	private final String PASSWORD = "108755m";

	@BeforeMethod(description = "Init browser")
	public void setUp()
	{
		steps = new Steps();
		steps.initBrowser();
	}

	/*@Test
	public void oneCanCreateProject()
	{
		steps.mailRegistrationMail(USERNAME, PASSWORD);
		Assert.assertTrue(steps.createNewRepository("testRepo", "auto-generated test repo"));		
	}
*/
	@Test(description = "Login to Mail.ru")
	public void oneCanLoginMail()
	{
		steps.mailRegistrationMail(USERNAME, PASSWORD);
		Assert.assertTrue(steps.isLoggedIn(USERNAME));
	}

	@AfterMethod(description = "Stop Browser")
	public void stopBrowser()
	{
		steps.closeDriver();
	}

}
