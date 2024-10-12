import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;

public class Before {
WebDriver driver;
	
	@BeforeClass
	public void setup() {
		driver = new ChromeDriver(); 
		driver.get("https://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize();
	}
	
	@AfterClass
	public void TearDown() {
		driver.quit();
	}
}
