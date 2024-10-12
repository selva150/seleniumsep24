import java.util.ArrayList;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleMultiTabs {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Windows.html");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//button[contains(text(),'    click   ')]")).click();
		Thread.sleep(1000);
		//Get the list of window handles
		ArrayList<String> allTabs = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(allTabs.get(0)); // previous tab
		Thread.sleep(2000);
		driver.switchTo().window(allTabs.get(1));  // new tab
		Thread.sleep(2000);
		driver.switchTo().window(allTabs.get(1));
		Thread.sleep(1500);
		driver.quit();
	}

}
