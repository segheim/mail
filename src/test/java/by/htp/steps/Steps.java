package by.htp.steps;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;

import by.htp.driver.DriverSingleton;
import by.htp.pages.LetterPage;
import by.htp.pages.MainPage;


public class Steps {

	private WebDriver driver;
	private final Logger logger = LogManager.getRootLogger();

	public void initBrowser()
	{
		driver = DriverSingleton.getDriver();
	}

	public void closeDriver()
	{
		DriverSingleton.closeDriver();
	}

	public void mailRegistrationMail(String username, String password)
	{
		MainPage mainPage = new MainPage(driver);
		mainPage.openPage();
		mainPage.mailRegistration(username, password);
	}
	
	public boolean isLoggedIn(String username)
	{
		MainPage mainPage = new MainPage(driver);
		String actualUsername = mainPage.getLoggedInUserName().trim().toLowerCase();
		logger.info("Actual username: " + actualUsername);
		return actualUsername.equals(username);
	}

	public void sendLetterMail()
	{
		LetterPage letterPage = new LetterPage(driver);
		letterPage.sendLetter();
	}

}
