package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class infoPage {
	

	WebDriver driver;
	public infoPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(name= "firstName")
	private WebElement fName;
	
	@FindBy(name= "lastName")
	private WebElement lName;
	
	@FindBy(name= "postalCode")
	private WebElement pinCode;
	
	@FindBy(name= "continue")
	private WebElement cont;
	
	public void enterDetails() {
		fName.sendKeys("Nathiya");
		lName.sendKeys("S");
		pinCode.sendKeys("32424234234");
		cont.click();
	}
	
	
}
