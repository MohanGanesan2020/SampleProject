package sampleProjectGit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestCases {
	@Test
	public void LoginTest()
	{
		System.out.println("Welcome");
		System.out.println("Welcome 2");
		System.setProperty("webdriver.chrome.driver", "C:/Users/user/git/SampleProject/SampleProject/Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com");
		driver.manage().window().maximize();
		driver.manage().window().maximize();
		
	}

}
