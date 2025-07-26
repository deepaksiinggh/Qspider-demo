package popups;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import base.BaseClass;

public class ChildWindowPopUp extends BaseClass {
	@Test
	public void childWindowPopup() throws InterruptedException {
	driver.findElement(By.xpath("//section[text()='Popups']")).click();
	driver.findElement(By.xpath("//section[text()='Hidden division']")).click();
	driver.findElement(By.xpath("//button[text()='Add Customer']")).click();
//	String childwindow = driver.getWindowHandle();
//	driver.switchTo().window(childwindow);
	driver.findElement(By.id("customerName")).sendKeys("deepak");
	driver.findElement(By.id("customerEmail")).sendKeys("deepak@gmail.com");
	WebElement product = driver.findElement(By.id("prod"));
	Select sel = new Select(product);
	sel.selectByValue("Mobile");
	driver.findElement(By.id("message")).sendKeys("hello deepak");
	driver.findElement(By.xpath("//button[text()='Submit']")).click();
	Thread.sleep(5000);
	
	}
}
