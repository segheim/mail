package by.htp.pages;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainPage extends AbstractPage {	
	
	private final Logger logger = LogManager.getRootLogger();
	private final String BASE_URL = "https://mail.ru/";

	@FindBy(xpath = ".//input[@id='mailbox:login']")
	private WebElement loginMail;

	@FindBy(xpath = ".//input[@id='mailbox:password']")
	private WebElement passwordMail;
	
	@FindBy(xpath = ".//input[@class='o-control']")
	private WebElement enterMail;
	
	public MainPage(WebDriver driver)
	{
		super(driver);
		PageFactory.initElements(this.driver, this);
	}
	
	public void mailRegistration(String username, String password)
	{
		loginMail.sendKeys(username);
		passwordMail.sendKeys(password);
		enterMail.submit();	
		logger.info("Login performed");
	}
	
	public String getLoggedInUserName()
	{
		return loginMail.getAttribute("value");
	}
	
	@Override
	public void openPage()
	{
		driver.navigate().to(BASE_URL);
	}

}
