package fbPomclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Logout {
	WebDriver driver;
	Actions a; 
	@FindBy(xpath="((//span[contains(@class,'x4k')])[1]") private WebElement acc;
	@FindBy(xpath="//span[text()='Log Out']")private WebElement logOT;

	public Logout(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	 this.driver=driver;
	 a=new Actions(driver);
	}
	
	public void account()
	{
		a.moveToElement(acc).click().perform();
		
	}
	public void logot()
	{
		logOT.click();
	}
	
}
