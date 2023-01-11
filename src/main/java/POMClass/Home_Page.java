package POMClass;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import UtilClass.UtilClass;

public class Home_Page extends UtilClass
{
   WebDriver driver;
   
   @FindBy(xpath="//input[@class='_3704LK']")
   private WebElement SearchFeild;
   
   @FindBy(xpath="//button[@class='L0Z3Pu']")
   private WebElement SearchBtn;
   
   @FindBy(xpath="(//div[@class='_2kHMtA'])[1]")
   private WebElement SelectMobile;
   
   @FindBy(xpath="//ul[@class='row']//li[1]")
   private WebElement AddToCart;
   
   public Home_Page (WebDriver driver)
   {
   	PageFactory.initElements(driver, this);
   	driver=this.driver;
   }
   
   public void SearchFeild()
   {
	   SearchFeild.sendKeys("redmi 9 power");
   }
   
   public void SearchBtn()
   {
	   SearchBtn.click();
   }
   
   public void SelectMobile()
   {
	   SelectMobile.click();
	    
   }
   
   public void Addtocart()
   {
	   
	   Set <String> allWindows = driver.getWindowHandles();
//	   List<String> address1=new ArrayList<String>(allWindows); 
//   	   driver.switchTo().window(address1.get(0));
   	   
   	Iterator<String> itr = allWindows.iterator();
   	
   	while(itr.hasNext())
   	{
   		driver.switchTo().window(itr.next());
   	}
	   
	   AddToCart.click();
	   
	   
	   
	   
	   
	  
	   
//	   boolean displayed = verifyMobile.isDisplayed();
//	   
//	   if(displayed ==true)
//	   {
//		   System.out.println("new window is opened");
//	   }
//	   else
//	   {
//		   System.out.println("no window");
//	   }
   }
   
   }
