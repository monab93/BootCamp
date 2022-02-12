package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class hDepotCreate1 {
public WebDriver driver;

@FindBy (xpath="//body//div[@id='single-signin']//div[contains(@class,'flexbox--center-center')]"
		+ "//div[contains(@class,'flexbox--center-center')]"
		+ "//div[1]//div[1]//div[1]//div[1]//div[4]//button[1]//span[1]") WebElement PersAcct;
public hDepotCreate1(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver, this);
}
public void PersonalAcctClick() {
	PersAcct.click();
}
}
