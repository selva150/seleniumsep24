package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class overviewPage {
	
	WebDriver driver;
	public overviewPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(name= "cancel")
	private WebElement cancel;
	
	@FindBy(xpath = "//button[@id='finish']")
	private WebElement finish;
	
	public void clickCancel() {
		cancel.click();
	}
	
	public void clickFinish() {
		finish.click();
	}
	
}
