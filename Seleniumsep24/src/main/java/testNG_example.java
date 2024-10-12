import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class testNG_example {
	
	@Test(priority=5, enabled=true, timeOut=4000)
	public void apple() throws InterruptedException {
	}
	@Test(priority=3, enabled=false)
	public void samsung() {
		
	}
	@Test(priority=1, description="this test cases created for some feature")
	public void xiomi() {
		
	}
	
	@Test(priority=2)
	public void oppo() {
		
	}
	@Test(priority=4)
	public void vivo() {
		
	}
	@Test
	public void login() {
		
	}
	@Test(dependsOnMethods= {"login"})
	public void checkMessages() {
		
	}
	
	
	
	
	
}
