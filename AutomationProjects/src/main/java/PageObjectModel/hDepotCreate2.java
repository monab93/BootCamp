package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class hDepotCreate2 {
public WebDriver driver;

@FindBy (id="email") WebElement Email;
@FindBy (name="password") WebElement Passwd;
@FindBy (name="zipcode") WebElement Zip;
@FindBy (id="phone") WebElement Phone;

@FindBy (xpath="//span[@class='bttn__content']") WebElement Create;

public hDepotCreate2(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver, this);
}
public void EmailSendkeys() {
	Email.sendKeys("test@pnt.com");
}
public void PassSendkeys() {
	Passwd.sendKeys("abcd");
}
public void ZipSendkeys() {
	Zip.sendKeys("22091");
}
public void PhoneSendkeys() {
	Phone.sendKeys("1234567788");
}

public void CreateClick() {
	Create.click();
}
}
