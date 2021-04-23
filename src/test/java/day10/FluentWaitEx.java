package day10;

import java.time.Duration;

import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.FluentWait;
import org.testng.annotations.Test;

import com.google.common.base.Function;

import helper.NewTest;

public class FluentWaitEx extends NewTest {
	@Test
    public void f() {
        webDriver.get("http://google.com");
        // Parent p=new Child
        Wait<WebDriver> wait = new FluentWait<WebDriver>(webDriver).withTimeout(Duration.ofSeconds(30))
                .pollingEvery(Duration.ofSeconds(2)).ignoring(NoSuchElementException.class);
 
        WebElement search = wait.until(new Function<WebDriver, WebElement>() {

            public WebElement apply(WebDriver driver) {
                return driver.findElement(By.name("q"));
            }
        });
        search.sendKeys("LTI");
        //No pre-difined methods are available in case of FluentWait similar to WebDriver Wait
    }
}
