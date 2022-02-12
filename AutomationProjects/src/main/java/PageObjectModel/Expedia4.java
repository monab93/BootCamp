package PageObjectModel;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class Expedia4 {
public WebDriver driver;


public Expedia4(WebDriver driver) {
this.driver=driver;
PageFactory.initElements(driver, this);
}
public void ReturnFlight() throws InterruptedException {
	List<WebElement>retfly=driver.findElements(By.xpath("//*[contains(@data-test-id,'select-link')]"));
	System.out.println(retfly.size());
	Thread.sleep(3000);
	for (int i=0; i<retfly.size();i++)
	{
		retfly.get(0).click();
	}
	driver.getWindowHandle(); 
	String subWindowHandler = null;

	Set<String> handles = driver.getWindowHandles();
	Iterator<String> iterator = handles.iterator();
	while (iterator.hasNext()){
	    subWindowHandler = iterator.next();
	    driver.switchTo().window(subWindowHandler);

	    System.out.println(subWindowHandler);
	}
	List<WebElement>retSelect=driver.findElements(By.xpath("//*[contains(@data-test-id,\"select-button\")]"));
	System.out.println(retSelect.size());
	Thread.sleep(3000);
	for (int i=0; i<retSelect.size();i++)
	{
		
		retSelect.get(0).click();
	}
}
}
