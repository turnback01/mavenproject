package helper;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class KeyWords  
{
	WebDriver driver;
	public KeyWords(WebDriver driver)
	{
		this.driver=driver;
	}
	public void click(String xpathLocator)
	{
		driver.findElement(By.xpath( xpathLocator)).click();
	}
	public void type(String xpathLocator,String data)
	{
		driver.findElement(By.xpath( xpathLocator)).sendKeys(data);
	}
	public void dropDownSelect(String xpathLocator,String text)
	{
		Select sc=new Select(driver.findElement(By.xpath(xpathLocator)));
		sc.selectByVisibleText(text);
	}
	public void getSnap(String location) throws IOException
	{
		TakesScreenshot tc=(TakesScreenshot)driver;
		File f=tc.getScreenshotAs(OutputType.FILE);
		FileHandler.copy(f, new File(location));
		
	}
	public void getUrl(String url)
	{
		driver.get(url);
	}

}
