package RunnerClass;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import BaseClass.BaseClass;
import PageObjectModel.HomePage;
import PageObjectModel.PaaswordPage;
import PageObjectModel.UserNamePage;

public class RunnerClass extends BaseClass 
{
	@BeforeTest
  public void setup()
  {
	  readconfig();
  }
 
	@Test
	public void execute() throws InterruptedException
	{
		UserNamePage username = new UserNamePage(driver);
		PaaswordPage password = new PaaswordPage(driver);
		HomePage homepage = new HomePage(driver);
		
		  username.signinlogo();
	
		 username.emailfield(pro.getProperty("gmail"));
		 Thread.sleep(5000);
		 username.nextbutton();
		 Thread.sleep(5000);
		 password.passwordField(pro.getProperty("password"));
		 Thread.sleep(2000);
		 password.nextButton();
		 Thread.sleep(2000);
		 homepage.composebutton();
		 Thread.sleep(2000);
		 homepage.tofield(pro.getProperty("gmail"));
		 Thread.sleep(2000);
		 homepage.subjectfield(pro.getProperty("subjecttext"));
		 Thread.sleep(2000);
		 homepage.textfield(pro.getProperty("maintext"));
		 Thread.sleep(2000);
		 homepage.fileupload(pro.getProperty("fileupload"));
		 Thread.sleep(2000);
		 homepage.sendkey();
		 Thread.sleep(2000);
	   homepage.messagesent();
         Thread.sleep(2000);
         homepage.Button();
         Thread.sleep(2000);
    driver.switchTo().frame("account");
         homepage.signoutbutton();
         Thread.sleep(2000);
	}
}
