package Pages;

import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class AutomationDeletePage 
{
	
	static WebDriver driver;
	
	public AutomationDeletePage(WebDriver driver) 
	{
		AutomationDeletePage.driver = driver;	
	}
	
	public void deleteTable() 
	{
		WebElement name = driver.findElement(By.xpath("/html[1]/body[1]/section[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]"));
		String nameOne = name.getText();
		
		Actions action = new Actions(driver);
		WebElement button = driver.findElement(By.xpath("/html[1]/body[1]/section[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[6]/user-click-select[1]/div[1]/del-click[1]/button[1]"));
		action.contextClick(button).perform();
		
		driver.findElement(By.xpath("/html[1]/body[1]/section[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[6]/user-click-select[1]/div[1]/div[1]/ul[1]/li[1]/button[1]")).click();
		Alert alert = driver.switchTo().alert();
		Assert.assertEquals("Delete the record permanently", alert.getText());
		alert.accept();

		String validateDeletion = driver.findElement(By.xpath("/html[1]/body[1]/section[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]")).getText();
        Assert.assertNotEquals(nameOne, validateDeletion);
	}
}