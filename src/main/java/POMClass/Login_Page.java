package POMClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import UtilClass.UtilClass;

public class Login_Page extends UtilClass

{
	WebDriver driver;
	
	@FindBy(xpath="//button[@class='_2KpZ6l _2doB4z']")
     private WebElement closeBtn;
	
	
    public Login_Page(WebDriver driver)
    {
    	PageFactory.initElements(driver, this);
    	driver=this.driver;
    }
    
    public void inpHomePageClosedButton()
    {
  	 // ExpliciteWait(driver,closeBtn);
  	  closeBtn.click();

    }
    
    
    
}
