package UtilClass;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class UtilClass 
{
    public static String getTD(int rowIndex,int cellIndex) throws EncryptedDocumentException, IOException
    {
    	FileInputStream file=new FileInputStream("C:\\Users\\admin\\eclipse-workspace\\FlipKart2\\src\\test\\resources\\TestData\\katraj.xlsx");
    	
    	Sheet sh = WorkbookFactory.create(file).getSheet("Sheet1");
    	
    	String value = sh.getRow(rowIndex).getCell(cellIndex).getStringCellValue();
    	
    	return value;
    }
    
    public static String getPFData(String key) throws IOException
    {
    	FileInputStream file=new FileInputStream("C:\\Users\\admin\\eclipse-workspace\\FlipKart2\\configre.properties");
    	Properties p=new Properties();
    	p.load(file);
    	String value = p.getProperty(key);
    	return value;
    		
    }
    
    public static void getScreenshot(WebDriver driver) throws IOException
    {
    	File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
    	
    	System.out.println(src);
    	File dest=new File("C:\\Users\\admin\\eclipse-workspace\\FlipKart2\\src\\test\\resources\\Screenshot");
    	FileHandler.copy(src, dest);
    	
    }
    
    public static WebElement ExpliciteWait(WebDriver driver, WebElement element)
    {
    	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
    	wait.until(ExpectedConditions.visibilityOf(element));
    	return element;
    	
    	
    }
    
    
    
    
    
    
    
    
}
