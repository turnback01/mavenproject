package day10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class BingTest
{
	WebDriver webDriver;
	@BeforeTest
	public void beforeTest()
	{
		System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");
		ChromeOptions op=new ChromeOptions();
		op.addArguments("--disable-notifications");
		op.addArguments("--headless");
		webDriver=new ChromeDriver(op);
	}
  @Test
  public void googleTest() 
  {
	  ExtentReports ex= new ExtentReports();
	  ex.attachReporter(new ExtentHtmlReporter("Google.html"));
	  ExtentTest tc1= ex.createTest("GoogleTitle Test");
	  tc1.info("opening URL");
	  webDriver.get("https://www.google.com/");
	  tc1.info("fetching current title");
	  String t=webDriver.getTitle();
	  tc1.info("comparing title");
	  SoftAssert sa =new SoftAssert();
	  sa.assertEquals(t, "Google");
	  tc1.pass("title matched and passed");
	  ex.flush();
	  sa.assertAll();
	  WebElement wt=webDriver.findElement(By.name("q"));
	  wt.sendKeys("LTI");
	  webDriver.close();
  }
}
