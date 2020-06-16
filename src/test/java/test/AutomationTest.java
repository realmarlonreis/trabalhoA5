package test;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import Pages.AutomationPage;
import support.Web;

public class AutomationTest {
	
	static WebDriver driver;
	static AutomationPage automationPage;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		driver = Web.createChromeInstance();
		automationPage = new AutomationPage(driver);
	}

	@Test
	public void test() {
		automationPage.fillUp();
		assertEquals(automationPage.checkText(), "EDIT");
		driver.quit();
	}
	
	@Before
	public void setUp() throws Exception {
	}

}