package audio_video;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import base.BaseClass;

public class Audio_video extends BaseClass {

	@Test
	public void testAudio() throws InterruptedException {
		driver.findElement(By.xpath("//section[text()='Audio']")).click();
		WebElement audio = driver.findElement(By.xpath("//p[text()='Audio Player']/preceding-sibling::div/div/audio"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].play()", audio);
		Thread.sleep(2000);
		js.executeScript("arguments[0].pause()", audio);
		
		
	}
	
	@Test
	public void testVideo() throws InterruptedException {
		driver.findElement(By.xpath("//section[text()='Video']")).click();
		WebElement video = driver.findElement(By.xpath("//div[@class='pt-10']/section[2]/video"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].play()", video);
		Thread.sleep(2000);
		js.executeScript("arguments[0].pause()", video);
	}
}
