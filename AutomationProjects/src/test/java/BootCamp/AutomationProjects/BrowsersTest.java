package BootCamp.AutomationProjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class BrowsersTest {
	WebDriver driver;
	
  @Test
  @Parameters("browser")
  public void setUpBrowser(String Browser) throws Exception {
	  if (Browser.equalsIgnoreCase("Firefox"))
	  {
		  System.out.println("Running Firefox");
		  System.setProperty("webdriver.gecko.driver", "C:\\Users\\Mona\\git\\repository2\\AutomationProjects\\src\\Drivers\\geckodriver.exe");
		  driver=new FirefoxDriver();
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
	  else if (Browser.equalsIgnoreCase("Chrome"))
	  {
		  System.out.println("Running Chrome");
		  System.setProperty("webdriver.chrome.driver", "C:\\Users\\Mona\\git\\repository2\\AutomationProjects\\src\\Drivers\\chromedriver.exe");
		  WebDriver driver=new ChromeDriver();
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
		  System.setProperty("webdriver.edge.driver", "C:\\Users\\Mona\\git\\repository2\\AutomationProjects\\src\\MSEdgeDriver\\msedgedriver.exe");
		  WebDriver driver=new EdgeDriver();
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
