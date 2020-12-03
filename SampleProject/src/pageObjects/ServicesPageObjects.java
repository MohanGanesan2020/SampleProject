package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ServicesPageObjects {
	public void PreOpenSrcSupp(WebDriver driver) throws InterruptedException
	{
		//Service Page 
		driver.findElement(By.linkText("Services")).click();
		System.out.println("Clicked on Services Link");
		Thread.sleep(30000);
		driver.findElement(By.linkText("Premier Open Source Support")).click();
	}

}
