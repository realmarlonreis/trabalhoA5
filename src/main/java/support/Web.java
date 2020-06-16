package support;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;

public class Web {
	
	public static WebDriver createChromeInstance() {
		System.setProperty("webdriver.chrome.driver", "C:/chromedriver.exe");
		System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY, "true");
		WebDriver webDriver = new ChromeDriver();
		webDriver.manage().window().maximize();
		webDriver.get("http://demo.automationtesting.in/index.html");
		
		return webDriver;
	}

}