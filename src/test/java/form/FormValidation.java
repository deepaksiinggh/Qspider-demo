package form;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import base.BaseClass;

public class FormValidation extends BaseClass{

	@Test
	public void formValidation() {
		driver.findElement(By.xpath("//section[text()='FormValidation']")).click();
		driver.findElement(By.id("fullName")).sendKeys("Deepak");
		driver.findElement(By.id("emailId")).sendKeys("deepak@gmail.com");
		driver.findElement(By.id("password")).sendKeys("Deepak1234");
		driver.findElement(By.id("mobile")).sendKeys("8989898989");
		WebElement city = driver.findElement(By.id("city"));
		Select sel = new Select(city);
		sel.selectByValue("pun");
		driver.findElement(By.id("mobile")).sendKeys("D:\\WhatsApp\\ds.png");
	    WebElement skill=driver.findElement(By.xpath("//label[text()='Enter your skills']/parent::section/div/div/select"));
	    Select sel2 = new Select(skill);
	    sel2.selectByValue("Nodejs");
	    driver.findElement(By.id("alert")).click();
	    By buttonLocator = By.xpath("//button[text()='Create Profile']");
	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
	    WebElement createProfileBtn = wait.until(ExpectedConditions.elementToBeClickable(buttonLocator));
	  createProfileBtn.click();
	}
}
