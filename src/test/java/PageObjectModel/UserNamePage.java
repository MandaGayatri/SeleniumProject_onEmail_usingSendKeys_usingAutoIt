package PageObjectModel;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseClass.BaseClass;

public class UserNamePage extends BaseClass
{
   public  RemoteWebDriver driver;
   
   public UserNamePage(RemoteWebDriver driver)
   {
	   this.driver = driver;
	   PageFactory.initElements(driver, this);
   }
   
   @FindBy(xpath = "//*[text() = 'Sign in']")
  public  WebElement signin;
   @FindBy(xpath = "//*[@type = 'email']")
  public  WebElement username;
   @FindBy(xpath = "//*[text()= 'Next']")
  public  WebElement button;
   
   public String signinlogo()
   {
	   signin.isDisplayed();
	   return toString();
   }
   public void emailfield(String email)
   {
	   username.sendKeys(email);
   }
   public void nextbutton()
   {
	   button.click();
   }
   public void clearfield()
   {
	   username.clear();
   }
}
