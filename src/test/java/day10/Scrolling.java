package day10;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import helper.NewTest;

public class Scrolling extends NewTest 
{
  @Test
  public void f() throws Exception 
  {
	  JavascriptExecutor js=(JavascriptExecutor)webDriver;
	  webDriver.get("https://www.selenium.dev/");
	  js.executeScript("arguments[0].scrollIntoView();", webDriver.findElement(By.linkText("Sri Harsha")));
	  Thread.sleep(2000);
	  js.executeScript("window.scrollBy(0,200)");
	  Thread.sleep(2000);
	  js.executeScript("window.scrollBy(0,-document.body.scrollHeight)");
  }
}
