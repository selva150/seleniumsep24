import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandleDropDown {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize();
		Select obj= new Select(driver.findElement(By.id("Skills"))); // ClassName obj = new ClassName();
		obj.selectByValue("Analytics");
		obj.selectByVisibleText("AutoCAD");
		obj.selectByIndex(9);
		driver.navigate().to("https://demoqa.com/select-menu");
		WebElement cars = driver.findElement(By.id("cars"));
		Select multi = new Select(cars);
		multi.selectByIndex(0);
		multi.selectByValue("audi");
		multi.selectByVisibleText("Opel");
		multi.deselectByIndex(0);
		multi.deselectAll();
		driver.quit();
	}

}
