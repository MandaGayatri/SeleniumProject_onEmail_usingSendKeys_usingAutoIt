package RunnerClass;

import java.io.IOException;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import BaseClass.BaseClass;
import PageObjectModel.HomePage1_Autoit;
import PageObjectModel.PaaswordPage;
import PageObjectModel.UserNamePage;


public class RunnerClass_Autoit extends BaseClass
{
	@BeforeTest
	public void setup()
	  {
		  readconfig();
	  }
	 
		@Test
		public void execute() throws InterruptedException, IOException
		{
			UserNamePage username = new UserNamePage(driver);
			PaaswordPage password = new PaaswordPage(driver);
			HomePage1_Autoit homepage1 = new HomePage1_Autoit(driver);
			
			
			 username.signinlogo();
		    username.emailfield(pro.getProperty("gmail"));
			 Thread.sleep(5000);
			 username.nextbutton();
			 Thread.sleep(5000);
			 password.passwordField(pro.getProperty("password"));
			 Thread.sleep(2000);
			 password.nextButton();
			 Thread.sleep(10000);
			 homepage1.composebutton();
			Thread.sleep(5000);
			 homepage1.tofield(pro.getProperty("gmail"));
			 Thread.sleep(5000);
			 homepage1.subjectfield(pro.getProperty("subjecttext"));
			 Thread.sleep(2000);
			 homepage1.textfield(pro.getProperty("maintext"));
			 Thread.sleep(2000); 
			 homepage1.attachfield();
			 Thread.sleep(2000);
			Runtime.getRuntime().exec(pro.getProperty("resumepath"));
			 Thread.sleep(10000);
			 homepage1.sendkey();
			 Thread.sleep(2000);
		   homepage1.messagesent();
	         Thread.sleep(2000);
	         homepage1.Button();
	         Thread.sleep(2000);
	    driver.switchTo().frame("account");
	         homepage1.signoutbutton();
	         Thread.sleep(2000);
		}
		
	
}
