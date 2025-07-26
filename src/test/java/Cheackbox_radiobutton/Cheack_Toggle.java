package Cheackbox_radiobutton;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import base.BaseClass;

public class Cheack_Toggle extends BaseClass {

	@Test(priority = 1)
	public void cheackBox() {
		driver.findElement(By.xpath("//section[text()='Check Box']")).click();
		driver.findElement(By.id("domain_a")).click();
		driver.findElement(By.id("mode_a")).click();
		driver.findElement(By.id("mode_e")).click();
		driver.findElement(By.id("mode_g")).click();
	}
	@Test(priority = 2)
	public void radio() throws InterruptedException {
		
		List<WebElement> elem=driver.findElements(By.xpath("//section[@class='py-4 border-b-[1px]']/aside/article[2]//label/span/span"));
	     for(WebElement ele:elem) {
	    	 ele.click();
	     }
	     
	     driver.findElement(By.id("togglers")).click();
	     Thread.sleep(1000);
	}
	
	@Test(priority = 3)
	public void getImageAttribute() {
	
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		WebElement ele=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//img[@title='Image tooltip']")));
		System.out.println("Image height "+ele.getSize().getHeight());
		System.out.println("Image width "+ele.getSize().getWidth());
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
