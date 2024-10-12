package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class checkoutPage {
	
	WebDriver driver;
	public checkoutPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(id= "continue-shopping")
	private WebElement contShopping;
	
	@FindBy(id= "remove-sauce-labs-backpack")
	private WebElement remove;
	
	@FindBy(xpath = "//button[text()='Checkout']")
	private WebElement checkout;
	
	public void clickCheckOut() {
		checkout.click();
	}
	
// create two more methods	
	
	
}
