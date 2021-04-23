package day10;

import java.io.FileReader;
import java.util.List;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.opencsv.CSVReader;

import helper.NewTest;

public class Datadriven extends NewTest {
	 
	 int i;
  @Test(dataProvider = "dp")
  public void loginProcess(String user, String pwd) throws InterruptedException
  {
	    webDriver.get("https://opensource-demo.orangehrmlive.com/");
	    webDriver.findElement(By.id("txtUsername")).sendKeys(user);
	    webDriver.findElement(By.id("txtPassword")).sendKeys(pwd);
	    webDriver.findElement(By.id("btnLogin")).click();
		boolean bn= webDriver.getCurrentUrl().contains("dashboard");
		Thread.sleep(1000);
		Assert.assertEquals(bn,true,"invalid user or pwd");
		 webDriver.findElement(By.id("welcome")).click();
		Thread.sleep(2000);
		 webDriver.findElement(By.linkText("Logout")).click();
	
	  
  }
  

  @DataProvider
  public Object[][] dp() throws Exception
  {
   
   CSVReader csv=new CSVReader(new FileReader("D:\\logindata.csv"));
   List<String[]> li=csv.readAll();
   Object data[][]=new Object[li.size()][2];
   int i=0;
	  for(String l[]:li)
	  {
		  data[i][0]=l[0];
		  data[i][1]=l[1];
		  i++;
	  }
   return data;
   
  }
}
