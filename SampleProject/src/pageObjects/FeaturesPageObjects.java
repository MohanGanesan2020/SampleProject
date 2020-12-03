package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FeaturesPageObjects {
	public void RequestDesk(WebDriver driver) throws InterruptedException
	{
		//Features Page
		driver.findElement(By.linkText("Features")).click();
		System.out.println("Clicked on Features Link");
		Thread.sleep(10000);
		//driver.findElement(By.linkText("Learn More")).click();
	}
	

}
