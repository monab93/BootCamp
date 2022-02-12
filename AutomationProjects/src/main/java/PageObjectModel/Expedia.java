package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Expedia {
public WebDriver driver;

@FindBy (xpath="//span[normalize-space()='Flights']") WebElement flights;

	public Expedia(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
public void FlightsTab() throws InterruptedException {
	flights.click();
	driver.manage().deleteAllCookies();
	  Expedia2 ob1=new Expedia2(driver);
	  ob1.DepartBox();
	 
}
}
