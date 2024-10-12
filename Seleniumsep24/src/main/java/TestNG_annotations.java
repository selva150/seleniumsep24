import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNG_annotations extends Before {
	
	@Test
	public void fileUpload() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(12));
		WebElement file = driver.findElement(By.id("imagesrc"));
		file.sendKeys("C:\\Users\\PC\\Downloads\\Demo.java");
	}
	
	@Test
	public void navigation() throws InterruptedException {
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
		driver.navigate().to("https://demo.automationtesting.in/Register.html");
	}
	@Test
	public void scrolling() throws InterruptedException {
		WebElement submit = driver.findElement(By.id("submitbtn"));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true);", submit);
		WebElement home = driver.findElement(By.xpath("//a[text()='Home']"));
		Thread.sleep(2000);
		js.executeScript("arguments[0].scrollIntoView(true)",home);
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(0,748)"); //http://www.brenz.net/snippets/xy.asp 
		Thread.sleep(2000);
		js.executeScript("arguments[0].click();", home);
		Thread.sleep(2000);
	}
	
	

}
