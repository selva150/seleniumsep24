import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scrolling {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize();
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
		driver.quit(); 

	}

}
