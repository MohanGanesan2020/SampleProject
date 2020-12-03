package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import pageObjects.ServicesPageObjects;

public class servicesTestCases {
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
		//ServicesPageObjects servicesPageObjects = new ServicesPageObjects();
		servicesPageObjects.PreOpenSrcSupp(driver);
		//System.out.println("Clicked on Premier Open Source Support Link");


		//Features Page
		driver.findElement(By.linkText("Features")).click();
		System.out.println("Clicked on Features Link");
		driver.findElement(By.linkText("Learn More")).click();


	}

}
