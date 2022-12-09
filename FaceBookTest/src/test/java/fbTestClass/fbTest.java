package fbTestClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import fbPomclass.Login;
import fbPomclass.Logout;

public class fbTest {
    WebDriver driver;
    Login log;
    Logout lgout;
    @BeforeClass
    public void beforeClass()
    {
    	System.setProperty("webdriver.chrome.driver","C:\\Users\\dell\\Desktop\\JAVA\\Java Programs\\chromedriver.exe");
		ChromeOptions option=new ChromeOptions();
		option.addArguments("disable-notifications");
		 driver = new ChromeDriver(option);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
    }
    
    @BeforeMethod
    public void beforeMethod()
    {
    	driver.get("https://www.facebook.com/");
    	log=new Login(driver);
    	log.username();
    	log.password();
    	log.submit();
    }
    
    
    @Test
    public void test1()
    {
    	System.out.println("Test case is passed");
    }
    
    
    @AfterMethod
    public void afterMethod()
    {
    	 lgout=new Logout(driver);
    	 lgout.account();
    	 lgout.logot();
    	
    }
    
    @AfterClass
    public void afterClass()
    {
    	driver.close();
    	
    }
    
    
	
	
	
}
