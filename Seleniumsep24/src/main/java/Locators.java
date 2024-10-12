import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Locators {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new EdgeDriver(); // Interface obj = new ClassName();
		driver.get("https://www.saucedemo.com");
		driver.manage().window().maximize();
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		Thread.sleep(1000);
		driver.findElement(By.name("user-name")).clear();
		driver.findElement(By.className("btn_action")).click();
		String s = driver.findElement(By.tagName("title")).getTagName();
		System.out.println(s);
		driver.get("https://demoqa.com/links");
		driver.findElement(By.linkText("Home"));
		driver.findElement(By.partialLinkText("Hom"));
		driver.get("https://www.saucedemo.com");
		driver.findElement(By.cssSelector("input#user-name"));  //1. tagname#id 2. tagname.classname
		driver.findElement(By.cssSelector("input.form_input"));
		driver.findElement(By.xpath("//input[@name='user-name']"));
		driver.findElement(By.xpath("//h4[contains(text(),'are:')]"));
		driver.findElement(By.xpath("//h4[text()='Accepted usernames are:']"));
		driver.findElement(By.xpath("//input[contains(@placeholder,'U')]"));
		driver.findElement(By.xpath("//input[@id='user-name' and @name='user-name']"));
		driver.quit();
	}

}
