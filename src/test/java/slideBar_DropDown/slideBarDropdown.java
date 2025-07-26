package slideBar_DropDown;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import base.BaseClass;

public class slideBarDropdown extends BaseClass {

	@Test(priority = 1)
	public void slideBar() {
		driver.findElement(By.xpath("//section[text()='Slider']")).click();
		WebElement slide=driver.findElement(By.id("slide"));
		
		Actions act = new Actions(driver);
		act.clickAndHold(slide).moveByOffset(50, 0).release().perform();
	}
	
	@Test(priority = 2)
	public void handleDropDown() {
		driver.findElement(By.xpath("//section[text()='Dropdown']")).click();
		WebElement countryCode = driver.findElement(By.id("country_code"));
		Select sel = new Select(countryCode);
		sel.selectByValue("+92");
		driver.findElement(By.id("phone")).sendKeys("9294845246");
		driver.findElement(By.id("male")).click();
		WebElement country = driver.findElement(By.id("select3"));
		Select sel2 = new Select(country);
		sel2.selectByValue("India");
		WebElement state = driver.findElement(By.id("select5"));
		Select sel3 = new Select(state);
		sel3.selectByValue("Madhya Pradesh");
		WebElement city = driver.findElement(By.xpath("//label[text()='City']/following-sibling::select"));
		Select sel4 = new Select(city);
		sel4.selectByValue("Rewa");
		driver.findElement(By.id("continuebtn")).click();
	    
		
	}
}
