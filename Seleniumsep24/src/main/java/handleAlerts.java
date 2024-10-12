import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class handleAlerts {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Alerts.html");
		driver.manage().window().maximize();
		driver.findElement(By.id("OKTab")).click();
		driver.switchTo().alert().accept();  // Simple Alert
		Thread.sleep(2000);
		 //Confirmation alert
		driver.findElement(By.xpath("//a[@href='#CancelTab']")).click();
		driver.findElement(By.id("CancelTab")).click();
		driver.switchTo().alert().accept();
		Thread.sleep(2000);
		// Input alert
		driver.findElement(By.xpath("//a[@href='#Textbox']")).click();
		driver.findElement(By.id("Textbox")).click();
		Alert al = driver.switchTo().alert();
		al.sendKeys("Selenium");
		al.accept();
		Thread.sleep(2000);
		driver.quit();
	}

}
