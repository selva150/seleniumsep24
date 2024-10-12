import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGAdvanced {
	@BeforeSuite
	public void beforesuite() {
		
		
	}
	
	@BeforeTest
	public void beforetest() {
		
	}
	@BeforeClass
	public void beforeclass() {
		
	}
	@BeforeMethod
	public void beforemethod() {
		
	}
	
	@Test
	public void test() {
		
	}
	
	@AfterMethod
	public void aftermethod() {
		
		
	}
	
	@AfterClass
	public void afterclass() {
		
	}
	@AfterTest
	public void aftertest() {
		
	}
	@AfterSuite
	public void aftersuite() {
		
	}
	
	
	
	
	
}
