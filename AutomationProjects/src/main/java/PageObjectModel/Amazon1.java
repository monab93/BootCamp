package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Amazon1 {
	public WebDriver driver;
	
	@FindBy(id = "twotabsearchtextbox") WebElement Search;
	@FindBy(id ="nav-search-submit-button") WebElement Submit;
	
public Amazon1(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver, this);
}
public void SearchBar() {
	Search.click();
	Search.sendKeys("Knitting Magic");
}
public void SearchClick() {
	Submit.click();
}
}