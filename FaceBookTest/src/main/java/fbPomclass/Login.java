package fbPomclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {

	@FindBy(xpath="//input[@type='text']")private WebElement uname;
	@FindBy(xpath="//input[@type='password']")private WebElement pass;
	@FindBy(xpath="//button[@value='1']")private WebElement sub;
	
	public Login(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public void username()
	{
		uname.sendKeys("manasisutar2210@gmail.com");
	}
	public void password()
	{
	  pass.sendKeys("monali@1022");	
	}
	public void submit()
	{
		sub.click();
	}
	
	
	
	
	
	
	
}
