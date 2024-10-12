import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class booleanOperations {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/automation-practice-form");
		driver.manage().window().maximize();
		//Boolean commands
		Thread.sleep(3000);
		boolean x = driver.findElement(By.id("submit")).isDisplayed();
		System.out.println("Is Displayed: "+ x);
		boolean y = driver.findElement(By.id("city")).isEnabled();
		System.out.println("Is Enabled: " + y);
		boolean z = driver.findElement(By.id("hobbies-checkbox-1")).isSelected();
		System.out.println("Is Selected: " + z);
		driver.quit();

	}

}
