package PageObjectModel;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseClass.BaseClass;

public class PaaswordPage extends BaseClass
{
  public RemoteWebDriver driver;
  
  public PaaswordPage(RemoteWebDriver driver)
  {
	     this.driver = driver;
	  PageFactory.initElements(driver,this);
  }
  
  @FindBy(xpath = "//*[@type = 'password']")
public  WebElement password;
  @FindBy(xpath = "//*[text() = 'Next']")
 public  WebElement button;
  
  public void passwordField(String pwd)
  {
	  password.sendKeys(pwd);
  }
  public void nextButton()
  {
	  button.click();
  }
  public void clearfield()
  {
	  password.clear();
  }
}

