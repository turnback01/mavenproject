package day10;

import org.testng.annotations.Test;

public class Grouping {
  @Test(groups= {"smoke"})
  public void f1() 
  {
	  System.out.println("Smoke Testing");
  }
  @Test(groups= {"smoke","regression"})
  public void f2() 
  {
	  System.out.println("Smoke Testing & Regression Testing");
  }
  @Test(groups= {"regression","linkTest"})
  public void f3() 
  {
	  System.out.println("Link Testing & Regression Testing");

  }
  @Test(groups= {"linkTest"})
  public void f4() 
  {
	  System.out.println("Link Testing");

  }
}
