package test;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import Pages.AutomationFalsePage;
import support.Web;

public class AutomationFalseTest {
	
	static WebDriver driver;
	static AutomationFalsePage automationFalsePage;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		driver = Web.createChromeInstance();
		automationFalsePage = new AutomationFalsePage(driver);
	}

	@Test
	public void test() {
		automationFalsePage.fillUp();
		assertEquals(automationFalsePage.checkText(), "Phone number already exists");
		driver.quit();
	}
	
	@Before
	public void setUp() throws Exception {
	}

}