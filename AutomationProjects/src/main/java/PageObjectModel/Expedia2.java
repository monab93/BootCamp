package PageObjectModel;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Expedia2 {
public WebDriver driver;

@FindBy (xpath="//*[contains(@aria-label, 'Leaving from')]") WebElement depart;
@FindBy (xpath="//*[contains(@data-stid, 'location-field-leg1-origin-menu-input')]") WebElement type;
@FindBy (xpath="//*[contains(@aria-label, 'Going to')]") WebElement arrive;
@FindBy (xpath="//*[contains(@data-stid, 'location-field-leg1-destination-menu-input')]") WebElement type2;
@FindBy (id="d1-btn") WebElement cal;
@FindBy (xpath="//*[contains(@aria-label, 'Mar 20, 2022')]")WebElement leave;
@FindBy (xpath="//*[contains(@aria-label, 'Mar 26, 2022')]") WebElement ret;
@FindBy (xpath="//*[contains(@data-stid, 'apply-date-picker')]")WebElement done;
@FindBy (xpath="//*[contains(@data-testid, 'submit-button')]")WebElement submit;
public Expedia2(WebDriver driver) {
this.driver=driver;
PageFactory.initElements(driver, this);
}


public void DepartBox() throws InterruptedException {
	
	
	WebDriverWait t = new WebDriverWait(driver, 30); 
	t.until(ExpectedConditions.visibilityOf(depart));  
	t.until(ExpectedConditions.elementToBeClickable(depart));
	Actions action=new Actions(driver);
	action.click(depart).perform();
	type.sendKeys("helsinki");
	List<WebElement>list=driver.findElements(By.xpath("//strong[normalize-space()='Helsinki (HEL - Vantaa)']"));
	  System.out.println(list.size());
	  for (int i= 0; i<list.size(); i++) {
		  System.out.println(list.get(i).getText());
		  if(list.get(i).getText().contains("Helsinki (HEL - Vantaa)")){
			  list.get(i).click();
			  break;} }
	
}


public void ArriveBox() throws InterruptedException {
	WebDriverWait t = new WebDriverWait(driver, 30); 
	t.until(ExpectedConditions.visibilityOf(arrive));  
	t.until(ExpectedConditions.elementToBeClickable(arrive));
	arrive.click();
	type2.sendKeys("san");
	Thread.sleep(2000);
	List<WebElement>list2=driver.findElements(By.xpath("//strong[normalize-space()='San Diego (SAN - San Diego Intl.)']"));
	  System.out.println(list2.size());
	  for (int i= 0; i<list2.size(); i++) {
		  System.out.println(list2.get(i).getText());
		  if(list2.get(i).getText().contains("San Diego (SAN - San Diego Intl.)")){
			  list2.get(i).click();
			  break;}}
	 
	

}
public void DateSelection() throws InterruptedException {
	cal.click();
	Thread.sleep(1500);
	leave.click();
	Thread.sleep(1500);
	ret.click();
	Thread.sleep(1500);
	Actions act=new Actions(driver);
	act.click(done).perform();
	submit.click();
	
}
}


