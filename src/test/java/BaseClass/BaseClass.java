package BaseClass;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

public class BaseClass 
{
   public static Properties pro;
   public static RemoteWebDriver driver;
   
    
	public void readconfig()
	{
		File f = new File("C:\\Users\\pcs\\eclipse-workspace\\SeleniumProject_onEmail\\cofigurations\\config.properties");
		
		try {
			FileInputStream fs = new FileInputStream(f);
			pro = new Properties();
			pro.load(fs);		
	        }
	  catch(Exception e)
	   {
		System.out.println(e.getMessage());
	   }
	
	}
	@Parameters(value = "browsers")
	@BeforeClass
	public void launchapp(String br) throws Exception
	{
	  
		if(br.contains("chrome"))
		{
			driver = new ChromeDriver();
		}
		else if(br.contains("firefox"))
		{
			driver = new FirefoxDriver();
		}
		else if(br.contains("ie"))
		{
			driver = new InternetExplorerDriver();
		}
		
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.get(pro.getProperty("url"));
		Thread.sleep(5000);
		}
		
	
	@AfterClass
	public void teardown()
	{
		driver.quit();
	}
	
}
