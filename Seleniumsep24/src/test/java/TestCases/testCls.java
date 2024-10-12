package TestCases;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Pages.checkoutPage;
import Pages.completePage;
import Pages.infoPage;
import Pages.loginPage;
import Pages.overviewPage;
import Pages.productDetailsPage;
import Pages.productsPage;

public class testCls {
	
	WebDriver driver;
	
	@BeforeMethod
	public void setup() {
		driver= new ChromeDriver();
		driver.get("https://www.saucedemo.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(12));
	}
	
	@Test
	public void Shopping() {
		loginPage lp = new loginPage(driver); // className obj = new className();
		productsPage pp = new productsPage(driver);
		productDetailsPage pdp = new productDetailsPage(driver);
		checkoutPage cp = new checkoutPage(driver);
		infoPage ip = new infoPage(driver);
		overviewPage op = new overviewPage(driver);
		completePage comp= new completePage(driver);
		lp.login();
		pp.clickBackPack();
		pdp.clickAddToCart();
		pdp.clickCart();
		cp.clickCheckOut();
		ip.enterDetails();
		op.clickFinish();
		String msg = comp.getHeaderText();
		Assert.assertEquals(msg, "Thank you for your order!"); //pass or fail
		comp.clickBackHome();
	}
	
	
	
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	

}
