package BootCamp.AutomationProjects;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import Common.Utility;
import PageObjectModel.Amazon1;
import PageObjectModel.Amazon2;

public class Amazon extends Utility {
  @Test
  public void TestOnAmazon() throws IOException {
	  Amazon1 ob= new Amazon1(driver);
	  ob.SearchBar();
	  shots();
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  ob.SearchClick();
	  shots();
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  
	  Amazon2 ob1=new Amazon2(driver);
	  ob1.SelectItem();
	  shots();
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  ob1.AddToCart();
	  shots();
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
  }
}
