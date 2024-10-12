import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class BasicActions {
	
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Static.html");
		driver.manage().window().maximize();
		WebElement start = driver.findElement(By.id("dragarea"));
		WebElement end = driver.findElement(By.id("droparea"));
		Actions act = new Actions(driver);//classname obj = new Classname();
		act.dragAndDrop(start, end).perform();
		Thread.sleep(2000);
		WebElement video = driver.findElement(By.xpath("//a[text()='Video']"));
		WebElement yt = driver.findElement(By.xpath("//a[text()='Youtube']"));
		act.moveToElement(video).moveToElement(yt).click().perform();
		WebElement home = driver.findElement(By.xpath("//a[text()='Home']"));
		act.contextClick(home).perform();
		Thread.sleep(2000);
		act.clickAndHold(home).perform();
		Thread.sleep(2000);
		act.doubleClick(home).perform();
		Thread.sleep(2000);
		act.click(home);
		Thread.sleep(2000);
		driver.quit();
	}

}
