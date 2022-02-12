package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class hDepotHome {
public WebDriver driver;

@FindBy (xpath ="//a[@id='headerMyAccount']//div[@class='MyAccount__label SimpleFlyout__link--bold']"
		+ "[normalize-space()='My Account']") WebElement Acct;
@FindBy (xpath ="//span[normalize-space()='Register']") WebElement Reg;

public hDepotHome(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver, this);
}
public void AcctBtnClick() {
	Acct.click();
}
public void RegBtnClick() {
	Reg.click();
}
}
