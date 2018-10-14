package com.renju.training.jenkins;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.AssertJUnit;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class SampleSeleniumTest {
	
	WebDriver driver;
	
	@BeforeClass
	public void startBrowser() {
		System.setProperty("webdriver.chrome.driver", "F:\\Downloads\\chromedriver_win32\\chromedriver.exe");
		ChromeOptions chromeOptions = new ChromeOptions();
		chromeOptions.addArguments("--start-maximized");
		driver = new ChromeDriver(chromeOptions);
	}
	
	@Test
	public void validateGoogleId() throws Exception {
		System.out.println("Opening Browser");
		driver.get("http://www.google.com");
		System.out.println("Clicking Gmail Link");
		driver.findElement(By.xpath("//*[@id=\"gbw\"]/div/div/div[1]/div[1]/a")).click();
		System.out.println("Clicking Sign In link");
		driver.findElement(By.xpath("/html/body/nav/div/a[2]")).click();
		System.out.println("Entering username");
		driver.findElement(By.xpath("//*[@id=\"identifierId\"]")).sendKeys("renju.jenkins.training");
		System.out.println("Clicking Next button");
		driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/content/span")).click();
		Thread.sleep(5000);
		boolean textFound = driver.getPageSource().contains("Forgot password");
		AssertJUnit.assertTrue(textFound);
	}
	
	@AfterClass
	public void closeBrowser() {
		driver.quit();
	}
}
