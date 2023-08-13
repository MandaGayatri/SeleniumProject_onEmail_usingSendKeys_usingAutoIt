package PageObjectModel;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseClass.BaseClass;

public class HomePage1_Autoit extends BaseClass 
{
	public RemoteWebDriver driver ;
	public HomePage1_Autoit(RemoteWebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//*[text() = 'Compose']")
	public WebElement compose;
	@FindBy(xpath = "(//*[@aria-label = 'To']//following::input[1])[1]")
	public WebElement to;
	@FindBy(xpath = "//*[@name = 'subjectbox']")
	public WebElement subject;
	@FindBy(xpath = "//*[@role = 'textbox']")
	public WebElement text;
	@FindBy(xpath = "(//*[@command = 'Files']//child::div[1]//child::div[1]//child::div[1])[1]")
	public WebElement attach;
	@FindBy(xpath = "//*[text() =  'Send']")
	public WebElement send;
	@FindBy(xpath = "//*[text() = 'Message sent']")
	public WebElement message;
	@FindBy(xpath = "(//*[@role = 'presentation'])[8]//preceding::img[1]")
	public WebElement button;
	@FindBy(xpath = "//*[text() = 'Sign out']")
	public WebElement signout;

	public void composebutton()
	{
		compose.click();
	}
	public void tofield(String text)
	{
		to.sendKeys(text);
	}
	public void subjectfield(String text)
	{
		subject.sendKeys(text);
	}
	public void textfield(String text1)
	{
		text.sendKeys(text1);
	}
    public void attachfield()
    {
    	attach.click();
    }
	
	public void sendkey()
	{
		send.click();
	}
	public String messagesent()
	{
		message.isDisplayed();
		return toString();
	}
	public void Button()
	{
		button.click();
	}
	public void signoutbutton()
	{
		signout.click();
	}
}
