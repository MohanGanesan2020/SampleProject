package sampleProjectGit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestCases {
	@Test
	public void LoginTest()
	{
		System.out.println("Welcome");
		System.out.println("Test Case Starts");
		System.setProperty("webdriver.chrome.driver", "C:/Users/user/git/SampleProject/SampleProject/Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Services")).click();
		System.out.println("Clicked on Services Link");
		driver.findElement(By.linkText("Features")).click();
		System.out.println("Clicked on Features Link");
		driver.findElement(By.linkText("Success Stories")).click();
		System.out.println("Clicked on Success Stories Link");
		driver.findElement(By.linkText("Partners")).click();
		System.out.println("Clicked on Partners Link");
		driver.findElement(By.linkText("Blog")).click();
		System.out.println("Clicked on Blog Link");
		driver.findElement(By.linkText("Resources")).click();
		System.out.println("Clicked on Resources Link");
		System.out.println("Test Case Ends");
		
	}

}
