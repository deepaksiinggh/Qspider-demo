package SignIn_Login;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import base.BaseClass;

public class LogIn extends BaseClass{

	@Test(priority = 0)
	public void register() throws InterruptedException {
		driver.findElement(By.id("name")).sendKeys("Deepak");
		driver.findElement(By.id("email")).sendKeys("Deepak@gmail.com");
		driver.findElement(By.id("password")).sendKeys("Deepak@9981");
		driver.findElement(By.xpath("//button[text()='Register']")).click();

	}
	
	@Test(priority = 1)
	public void logIn() {
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("email")));
		driver.findElement(By.id("email")).sendKeys("Deepak@gmail.com");
		driver.findElement(By.id("password")).sendKeys("Deepak@9981");
		driver.findElement(By.xpath("//button[text()='Login']")).click();
	}
}
