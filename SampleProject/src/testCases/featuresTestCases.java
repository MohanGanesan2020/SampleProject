package testCases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import pageObjects.FeaturesPageObjects;
public class featuresTestCases
{

	@Test
	public void FeaturesTest(WebDriver driver) throws InterruptedException
	{
		//Features Page
		//driver.findElement(By.linkText("Features")).click();
		System.out.println("Clicked on Features Link");
		Thread.sleep(10000);
		FeaturesPageObjects featuresPageObjects = new FeaturesPageObjects();
		featuresPageObjects.RequestDesk(driver);
	}
}
