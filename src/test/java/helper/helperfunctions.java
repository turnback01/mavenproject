package helper;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

public class helperfunctions
{
	public static WebDriver startbrowser(String name)
	{
		WebDriver drive;
		if(name.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");
			ChromeOptions op=new ChromeOptions();
			op.addArguments("--disable-notifications");
			drive = new ChromeDriver(op);
			
		}
		else if(name.equalsIgnoreCase("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", "src/test/resources/drivers/geckodriver.exe");
			drive = new FirefoxDriver();
			
		}
		else
		{
			System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");
			drive = new ChromeDriver();
			
		}
		return drive;
		
	}
}


