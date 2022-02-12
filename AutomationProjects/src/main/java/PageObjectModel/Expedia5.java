package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Expedia5 {
	public WebDriver driver;
@FindBy (xpath="//*[contains(@aria-label,'Continue to checkout')]")WebElement checkOut;

	public Expedia5(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver, this);
	}
public void CheckOut() {
	checkOut.click();
}
}
