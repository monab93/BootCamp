package BootCamp.AutomationProjects;

import org.testng.annotations.Test;

import PageObjectModel.Expedia;
import PageObjectModel.Expedia2
import PageObjectModel.Expedia3;
import PageObjectModel.Expedia4;
import PageObjectModel.Expedia5;
import PageObjectModel.Expedia6;

import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;

public class ExpediaTest {
public WebDriver driver;
  @Test
  public void f() throws InterruptedException {
	
	  Expedia ob1 =new Expedia(driver);
	  ob1.FlightsTab();
	  
	  Expedia2 ob2=new Expedia2(driver);
	  ob2.DepartBox();
	  ob2.ArriveBox();
	  ob2.DateSelection();
	  
	 Expedia3 ob3=new Expedia3(driver);
	 ob3.SelectFlight();
	 
	 Expedia4 ob4 = new Expedia4(driver);
	 ob4.ReturnFlight();
	 
	  Expedia5 ob5= new Expedia5(driver);
	  ob5.CheckOut();
	  
	  Expedia6 ob6=new Expedia6(driver);
			  ob6.Demographics();
  }
  
  
  @BeforeTest
  public void beforeTest() throws InterruptedException {
		System.setProperty("webdriver.edge.driver", "C:\\Users\\Mona\\git\\repository2\\AutomationProjects\\src\\MSEdgeDriver\\msedgedriver.exe");
	    driver=new EdgeDriver();
	    driver.navigate().to("https://www.expedia.com");
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    
  }

  
  @AfterTest
  public void afterTest() throws InterruptedException {
	  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	  driver.close();
	 
  }

}
