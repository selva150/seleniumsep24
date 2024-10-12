package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class productsPage {
	
	// 1. page elements 2. page actions  3. page factory
	WebDriver driver;
	public productsPage(WebDriver dr) {
		this.driver= dr;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="item_4_title_link")
	private WebElement backPack;
	
	@FindBy(xpath="//div[text()='29.99']")
	private WebElement price;
	
	
	public void clickBackPack() {
		backPack.click();
	}
	
	public String getPrice() {
		return price.getText();
	}

}
