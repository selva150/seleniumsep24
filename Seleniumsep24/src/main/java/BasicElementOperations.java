import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class BasicElementOperations {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new EdgeDriver();
		driver.get("https://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getPageSource());
		driver.findElement(By.xpath("//button[@id='Button1']")).click();
		driver.findElement(By.xpath("//button[@id='Button1']")).submit(); // pressing Enter key
		driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("1234"+Keys.BACK_SPACE+Keys.NUMPAD8);
		driver.findElement(By.xpath("//input[@placeholder='First Name']")).clear();
		Thread.sleep(6000);
		driver.quit();
	}

}
