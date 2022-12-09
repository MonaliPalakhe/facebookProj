package fbPomclass;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class signup {

	WebDriver driver;
	Select s1;
	Select s2;
	Select s3;
	FileInputStream input;
	Sheet sh;
	
	
	@FindBy(xpath="(//input[@type='text'])[1]")private WebElement fname;
	@FindBy(xpath="(//input[@type='text'])[2]")private WebElement sname;
	@FindBy(xpath="(//input[@type='text'])[3]")private WebElement mobile;
	@FindBy(xpath="//input[@type='password']")private WebElement pass;
	
	@FindBy(xpath="//select[@id='day']")private WebElement day;
	@FindBy(xpath="//select[@id='month']")private WebElement month;
	@FindBy(xpath="//select[@id='year']")private WebElement year;
    @FindBy(xpath="(//input[@type='radio'])[1]")private WebElement female;
	@FindBy(xpath="(//button[@type='submit'])[1]")private WebElement signUp;
	
	
	public signup(WebDriver driver) throws EncryptedDocumentException, IOException 
	{
		PageFactory.initElements(driver,this);
		input=new FileInputStream("C:\\Users\\dell\\Desktop\\JAVA\\fipkartUser.xlsx");
		sh=WorkbookFactory.create(input).getSheet("Sheet1");
		s1=new Select(day);
		s2=new Select(month);
		s3=new Select(year);
	}
	
	public void fname()
	{
		fname.sendKeys(sh.getRow(2).getCell(0).getStringCellValue());
	}
	public void sname()
	{
		sname.sendKeys(sh.getRow(2).getCell(1).getStringCellValue());
	}
	public void mob()
	{
		mobile.sendKeys(sh.getRow(2).getCell(2).getStringCellValue());
	}
	public void password()
	{
		pass.sendKeys(sh.getRow(2).getCell(3).getStringCellValue());
	}
	public void day()
	{
		s1.selectByVisibleText(sh.getRow(2).getCell(4).getStringCellValue());
	}
	public void month()
	{
		s2.selectByVisibleText(sh.getRow(2).getCell(5).getStringCellValue());
	}
	public void year()
	{
		s3.selectByVisibleText(sh.getRow(2).getCell(6).getStringCellValue());
	}
	public void female()
	{
		female.click();
	}
	public void signUp()
	{
		signUp.click();
	}
	
	
	
	
	
	
	
	
	
}
