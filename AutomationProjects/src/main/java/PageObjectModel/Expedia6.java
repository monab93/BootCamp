package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Expedia6 {
	public WebDriver driver;
@FindBy (id="firstname[0]")WebElement fname;
@FindBy (id="middlename[0]")WebElement mname;
@FindBy (id="lastname[0]")WebElement lname;
@FindBy (id="phone-number[0]")WebElement phone;
@FindBy (id="gender_male[0]")WebElement gender;
@FindBy (id="date_of_birth_month0")WebElement bmonth;
@FindBy (id="date_of_birth_day[0]")WebElement bday;
@FindBy (id="date_of_birth_year[0]")WebElement byear;

	public Expedia6(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver, this);
	}
public void Demographics() {
	fname.sendKeys("Peter");
	mname.sendKeys("Benjamin");
	lname.sendKeys("Parker");
	phone.sendKeys("256-333-1414");
	gender.click();
	Select month=new Select(bmonth);
	month.selectByValue("08");
	Select day=new Select(bday);
	day.selectByValue("10");
	Select year=new Select(byear);
	year.selectByValue("2001");
}
}
