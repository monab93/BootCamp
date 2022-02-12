package BootCamp.AutomationProjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.List;

public class FbUrls {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Mona\\git\\repository2\\"
		+ "AutomationProjects\\src\\Drivers\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		driver.navigate().to("https://www.facebook.com");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		List<WebElement> allUrls = driver.findElements(By.tagName("a"));
		System.out.println("This is the number of links present on facebook.com: " + allUrls.size());

		for (WebElement link : allUrls) 
		{
		System.out.println(link.getText() + " - " + link.getAttribute("href"));	
		}
		
		driver.close();
	}

}
