package by.htp.pages;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LetterPage extends AbstractPage {
	
	private final Logger logger = LogManager.getRootLogger();
	private final String BASE_URL = "https://e.mail.ru/messages/inbox/?back=1";

	@FindBy(xpath = ".//div[@id='LXfSu0R']//span[@class='b-toolbar__btn__text b-toolbar__btn__text_pad']")
	private WebElement letterButtom;
	
	@FindBy(xpath = ".//textarea[@tabindex='4']")
	private WebElement whomSendLetter;
	
	@FindBy(css = "body#tinymce")
	private WebElement textSendLeter;
	
	@FindBy(xpath = ".//div[@class='b-toolbar__item b-toolbar__item_ b-toolbar__item_false']//div[@data-bem='b-toolbar__btn']")
	private WebElement sendLetterButtom;

	public LetterPage(WebDriver driver)
	{
		super(driver);
		PageFactory.initElements(this.driver, this);
	}

	@Override
	public void openPage()
	{
		driver.navigate().to(BASE_URL);
		logger.info("Mail page opened");
	}
		
	
	public void sendLetter() 
	{
		letterButtom.click();
		whomSendLetter.sendKeys("tathtp@mail.ru");
		textSendLeter.sendKeys("Wazzzzzzzzzzap!");
		sendLetterButtom.click();		
	}
}
