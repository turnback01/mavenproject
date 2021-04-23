package helper;

import org.testng.annotations.BeforeTest;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;

public class NewTest {

	public WebDriver webDriver;
	public Properties prop;

	@BeforeTest
	public void beforeTest() throws Exception {
		prop=new Properties();
		prop.load(new FileInputStream("src/test/resources/settings.property"));
		webDriver = helperfunctions.startbrowser(prop.getProperty("browserName"));
		webDriver.manage().window().maximize();
	}

	@AfterTest
	public void afterTest() throws Exception {
		Thread.sleep(3000);
		webDriver.quit();
	}

}
