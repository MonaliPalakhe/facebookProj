package fbTestClass;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import fbPomclass.Login;
import fbPomclass.Logout;
import fbPomclass.signup;

public class signupTest {

	 WebDriver driver;
	 signup s;
	    @BeforeClass
	    public void beforeClass()
	    {
	    	System.setProperty("webdriver.chrome.driver","C:\\Users\\dell\\Desktop\\JAVA\\Java Programs\\chromedriver.exe");
			
			 driver = new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.manage().window().maximize();
			
	    }
	    
	    @BeforeMethod
	    public void beforeMethod()
	    {
	    	driver.get("https://www.facebook.com/r.php/");
	    	
	    }
	    
	    
	    @Test
	    public void test1() throws EncryptedDocumentException, IOException, InterruptedException
	    {
           s=new signup(driver);
           s.fname();
           Thread.sleep(2000);
           s.sname();
           Thread.sleep(2000);
           s.mob();
           Thread.sleep(2000);
       s.password();
       Thread.sleep(2000);
       s.day();
       Thread.sleep(2000);
       s.month();
       Thread.sleep(2000);
       s.year();
       Thread.sleep(2000);
       s.female();
       Thread.sleep(2000);
       s.signUp();
       String url=driver.getCurrentUrl();
       Assert.assertEquals(url,"https://www.facebook.com/r.php/");
    }
	    
	    
	    @AfterMethod
	    public void afterMethod()
	    {
	    	System.out.println(driver.getTitle());
	    	
	    }
	    
	    @AfterClass
	    public void afterClass()
	    {
	    	driver.close();
	    	
	    }
	    
	    
		
		
}
