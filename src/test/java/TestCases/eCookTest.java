package TestCases;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Base.Base;
import Pages.eCookPgae;
import io.appium.java_client.android.AndroidDriver;

public class eCookTest extends Base{
	
	@SuppressWarnings("rawtypes")
	public AndroidDriver driver;

	
	public eCookTest() {
		super();
	}
	
	@BeforeClass
	public void initialize() throws InterruptedException {
		driver = initializeDriver();
        Thread.sleep(5000);		
	}
	
	@AfterClass
	public void tearDown() {
		driver.quit();
	}
	
	@Test(priority = 1)
	public void CustomerAddProductsShoppingCartTest() throws InterruptedException {
		eCookPgae customerAddProductsShoppingCartPage = new eCookPgae(driver);
		customerAddProductsShoppingCartPage.CustomerAddProductsShoppingCartWithMendatoryField();
		Thread.sleep(5000);
    }
}