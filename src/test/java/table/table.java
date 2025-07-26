package table;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import base.BaseClass;

public class table extends BaseClass {

	@Test
	public void tableData() {
		driver.findElement(By.xpath("//section[text()='Web Table']")).click();
	List<WebElement> tableRow =	driver.findElements(By.xpath("//table/tbody/tr"));
	for(WebElement tr:tableRow) {
		String itemName =tr.findElement(By.xpath("./th")).getText();
		
		List<WebElement> td = tr.findElements(By.xpath("./td"));
		
		String rating = td.get(0).getText();
		String quantity = td.get(1).getText();
		String discount = td.get(2).getText();
		String price = td.get(3).getText();
		
		
		System.out.println( itemName + " " +rating+" "+quantity+" "+ discount +" "+ price);
	}
	}
}
