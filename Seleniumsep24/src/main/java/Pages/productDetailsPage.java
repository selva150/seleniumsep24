package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class productDetailsPage {
	
	WebDriver driver;
	
	public productDetailsPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id= "add-to-cart")
	private WebElement addToCart;
	
	@FindBy(name="remove-sauce-labs-backpack")
	private WebElement remove;
	
	@FindBy(className= "shopping_cart_link")
	private WebElement cart;
	
	public void clickAddToCart() {
		addToCart.click();
	}
	
	public void removeItem() {
		remove.click();
	}
	
	public void clickCart() {
		cart.click();
	}
	
	

}
