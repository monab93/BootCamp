package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Amazon2 {
	public WebDriver driver;
	
	@FindBy(xpath="//span[normalize-space()='Harry Potter: Knitting Magic:"
			+ " The Official Harry Potter Knitting Pattern Book']") WebElement Select;
	@FindBy(name="submit.add-to-cart") WebElement Add;
	
public Amazon2(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver, this);
}
public void SelectItem() {
	Select.click();
}
public void AddToCart() {
	Add.click();
}
}
