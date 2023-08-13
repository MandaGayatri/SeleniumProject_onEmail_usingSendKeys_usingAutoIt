package datadriventest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import BaseClass.BaseClass;
import PageObjectModel.UserNamePage;
import XLData.XLSheetData;

public class Username_datadrivenTest extends BaseClass
{
   
    @BeforeTest
	public void setup()
	  {
		  readconfig();
	  }
	 
   
    @Test(dataProvider = "email")
    public void execute(String gmail) throws InterruptedException
    { 
    	 UserNamePage username = new UserNamePage(driver);
    	    username.signinlogo();
    	    username.clearfield();
		    username.emailfield(gmail);
			 Thread.sleep(2000);
			 username.nextbutton();
			 Thread.sleep(2000);
	}
    
    @DataProvider(name = "email")
    public Object[][] gmaildata() throws Exception
    {
    	String path = "C:\\Users\\pcs\\eclipse-workspace\\SeleniumProject_onEmail\\cofigurations\\data.xlsx";
    	int rownum  = XLSheetData.getRowCount(path, "username");
    	
    	int colnum = XLSheetData.getcellCount(path, "username", 0);
    	
    	Object[][] data =  new Object[rownum][colnum];
    	
    	for(int i=0;i<rownum;i++)
    	{
    	for(int j =0;j<colnum;j++)
    	{
    			data[i][j] = XLSheetData.getcellData(path ,"username",i+1,j);
    		}
    	}
    	return data;
    }
}
