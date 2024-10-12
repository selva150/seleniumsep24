import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumWait {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(12)); 
		//1. implicit wait : Page loads 
		//2. Explicit wait: particular condition to be met:
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement e = driver.findElement(By.id("imagesrc"));
		wait.until(ExpectedConditions.visibilityOf(e));		
		driver.quit();
	}

}
