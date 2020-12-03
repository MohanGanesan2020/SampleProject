package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class testCases {
	@Test
	public void LoginTest() throws InterruptedException
	{
		System.out.println("Welcome");
		System.out.println("Test Case Starts");
		System.setProperty("webdriver.chrome.driver", "C:/Users/user/git/SampleProject/SampleProject/Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com");
		driver.manage().window().maximize();
		
		//Service Page 
		driver.findElement(By.linkText("Services")).click();
		System.out.println("Clicked on Services Link");
		Thread.sleep(30000);
		driver.findElement(By.linkText("Premier Open Source Support")).click();
		
		
		/*//Features Page
		driver.findElement(By.linkText("Features")).click();
		System.out.println("Clicked on Features Link");
		
		
		//Success Stories Page
		driver.findElement(By.linkText("Success Stories")).click();
		System.out.println("Clicked on Success Stories Link");
		
		//Partners Page
		driver.findElement(By.linkText("Partners")).click();
		System.out.println("Clicked on Partners Link");
		
		//Blog Page
		driver.findElement(By.linkText("Blog")).click();
		System.out.println("Clicked on Blog Link");
		
		//Resources Page
		driver.findElement(By.linkText("Resources")).click();
		System.out.println("Clicked on Services Link");
		System.out.println("Test Case Ends");*/

	}

}
