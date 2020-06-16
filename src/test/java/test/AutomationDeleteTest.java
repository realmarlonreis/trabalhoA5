package test;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Pages.AutomationDeletePage;

public class AutomationDeleteTest {
	
	static WebDriver driver; 
	static AutomationDeletePage automationDeletePage;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/WebTable.html");
		automationDeletePage = new AutomationDeletePage(driver);
		driver.manage().window().maximize();
	}

	@Test
	public void test() {
		automationDeletePage.deleteTable();
		driver.quit();
	}	
	
	@Before
	public void setUp() throws Exception {
	}

}