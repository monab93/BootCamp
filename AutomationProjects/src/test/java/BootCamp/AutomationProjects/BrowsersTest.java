package BootCamp.AutomationProjects;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class BrowsersTest {
	WebDriver driver;
	
  @Test
  @Parameters("Browser")
  public void setUpBrowser(String Browser) throws Exception {
	  if (Browser.equalsIgnoreCase("Firefox"))
	  {
		  System.out.println("Running Firefox");
		  System.setProperty("webdriver.gecko.driver", "C:\\Users\\Mona\\git\\repository2\\AutomationProjects\\src\\Drivers\\geckodriver.exe");
		  driver=new FirefoxDriver();
		 
		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		  driver.manage().window().maximize();
		  driver.get("https:www.google.com/");
		
		  
		  String ActualTitle=driver.getTitle();
		  System.out.println(ActualTitle);
		  String ExpectedTitle="Google";
		  
		  if (ActualTitle.equals(ExpectedTitle))
		  {
			  System.out.println("Test Passed");
		  }
		  else {
			  System.out.println("Test Failed");
		  }
		  Thread.sleep(3000);
		  driver.close();
	  }
	  else if (Browser.equalsIgnoreCase("chrome"))
	  {
		  System.out.println("Running Chrome");
		  System.setProperty("webdriver.chrome.driver", "C:\\Users\\Mona\\git\\repository2\\AutomationProjects\\src\\Drivers\\chromedriver.exe");
		  WebDriver driver=new ChromeDriver();
		  
		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		  driver.manage().window().maximize();
		  driver.get("https://www.google.com");
		  
		 
		  String ActualTitle=driver.getTitle();
		  System.out.println(ActualTitle);
		  String ExpectedTitle="Google";
		  
		  if (ActualTitle.equals(ExpectedTitle))
		  {
			  System.out.println("Test Passed");
		  }
		  else {
			  System.out.println("Test Failed");
		  }
		  Thread.sleep(3000);
		  driver.close();
	  }
	  else if (Browser.equalsIgnoreCase("Edge"))
	  {
		  System.out.println("Running Edge");
		  System.setProperty("webdriver.edge.driver", "C:\\Users\\Mona\\git\\repository2\\AutomationProjects\\src\\Drivers\\msedgedriver.exe");
		  WebDriver driver=new ChromeDriver();
		  
		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		  driver.manage().window().maximize();
		  driver.get("https://www.google.com");
		 
		  String ActualTitle=driver.getTitle();
		  System.out.println(ActualTitle);
		  String ExpectedTitle="Google";
		  
		  if (ActualTitle.equals(ExpectedTitle))
		  {
			  System.out.println("Test Passed");
		  }
		  else {
			  System.out.println("Test Failed");
		  }
		  Thread.sleep(3000);
		  driver.close();
  }
  }
  	
}
