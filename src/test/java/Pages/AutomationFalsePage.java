package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AutomationFalsePage {
	
	static WebDriver driver;
	
	public AutomationFalsePage(WebDriver driver) {
		AutomationFalsePage.driver = driver;
		
	}
	
	public void fillUp() {
		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys("admin@gmail.com");
		
		WebElement nextButton = driver.findElement(By.id("enterimg"));
		nextButton.click();
		
		WebDriverWait holdUp = new WebDriverWait(driver, 10);
		holdUp.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//body/section[@id='section']/div/div/div/form[@id='basicBootstrapForm']/div[1]/div[1]/input[1]")));
		
		WebElement firstName = driver.findElement(By.xpath("//body/section[@id='section']/div/div/div/form[@id='basicBootstrapForm']/div[1]/div[1]/input[1]"));
		firstName.sendKeys("Faculdade");
		
		WebElement lastName = driver.findElement(By.xpath("//body/section[@id='section']/div/div/div/form[@id='basicBootstrapForm']/div/div[2]/input[1]"));
		lastName.sendKeys("Fadergs");
		
		WebElement inputAddress = driver.findElement(By.xpath("//form[@id='basicBootstrapForm']//div//div//textarea"));
		inputAddress.sendKeys("R. Riachuelo, 1257");
		
		WebElement inputEmail = driver.findElement(By.xpath("//div[@id='eid']//input"));
		inputEmail.sendKeys(" admin@fadergs.edu.br");
		
		WebElement inputPhone = driver.findElement(By.xpath("//div[4]//div[1]//input[1]"));
		inputPhone.sendKeys("0007678678");
		
		WebElement selectGender = driver.findElement(By.xpath("//label[2]//input[1]"));
		selectGender.click();
		
		WebElement selectHobbies = driver.findElement(By.id("checkbox2"));
		selectHobbies.click();
		
		WebElement selectLanguage = driver.findElement(By.id("msdd"));
		selectLanguage.click();
		
		WebDriverWait holdUpTwo = new WebDriverWait(driver, 10);
		holdUpTwo.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(text(),'Arabic')]")));
		
		driver.findElement(By.xpath("//a[contains(text(),'Portuguese')]")).click();
		
		Select selectSkills = new Select(driver.findElement(By.id("Skills")));
		selectSkills.selectByValue("Java");
		
		Select selectCountry = new Select(driver.findElement(By.id("countries")));
		selectCountry.selectByValue("Brazil");
		
		WebElement selectCountryTwo = driver.findElement(By.xpath("//span[@class='select2-selection select2-selection--single']"));
		selectCountryTwo.click();
		
		WebDriverWait holdUpThree = new WebDriverWait(driver, 10);
		holdUpThree.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@class='select2-search__field']")));
		
		WebElement selectCountryThree = driver.findElement(By.xpath("//input[@class='select2-search__field']"));
		selectCountryThree.sendKeys("Japan");
		selectCountryThree.sendKeys(Keys.ENTER);
		
		Select selectYear = new Select(driver.findElement(By.id("yearbox")));
		selectYear.selectByValue("1986");
		
		Select selectMonth = new Select(driver.findElement(By.xpath("//div[@class='col-sm-6 col-md-6 col-xs-12']//div[2]//select[1]")));
		selectMonth.selectByValue("June");
		
		Select selectDay = new Select(driver.findElement(By.id("daybox")));
		selectDay.selectByValue("4");
		
		WebElement firstPassword = driver.findElement(By.id("firstpassword"));
		firstPassword.sendKeys("C84jcjDVpcH@w7E");
		
		WebElement secondPassword = driver.findElement(By.id("secondpassword"));
		secondPassword.sendKeys("C84jcjDVpcH@w7E");
		
		WebElement submitButton = driver.findElement(By.id("submitbtn"));
		submitButton.click();
		
	}
		public String checkText()
		{
			return driver.findElement(By.xpath("//div[@class='col-xs-offset-1 col-xs-4 ng-scope']")).getText();
		}
}