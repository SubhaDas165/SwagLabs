package testcase;


import java.util.List;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import browserImplementation.Browser_Launch;
import configUtility.ObjectReader;
import pages.Buy_Product;
import takeScreenShot.ScreenShot;


public class Verify_Buy_Product {
	static WebDriver driver=null;
	static Browser_Launch obj;
	static Buy_Product bp;
	static ScreenShot ss;
	@BeforeSuite
	  public void beforeSuite() throws Exception {
		Scanner sc=new Scanner(System.in);
		obj=new Browser_Launch();
		System.out.println("Enter The Browser");
		System.out.println("For Chrome Browser press 1");
		System.out.println("For Microsoft Edge Browser press 2");
		System.out.println("For FireFox Browser press 3");
		int k=sc.nextInt();
		if(k==1) {
			driver=obj.launch_Chrome();
			System.out.println("Thank you for choosing Chrome Browser");
		}
		if(k==2) {
			driver=obj.launch_Edge();
			System.out.println("Thank you for choosing Microsoft Edge");

		}
		if(k==3) {
			driver=obj.launch_FireFox();
			System.out.println("Thank you for choosing FireFox Browser");

		}
	}
	@Test
	public void buy_Product() throws Exception {
		System.out.println("Test1 method");
		driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
		bp=new Buy_Product(driver);
		bp.buy_Product();
		ss =new ScreenShot(driver);
		ss.getScreenShot("SuccessfullyBuy");
		
	}

	@AfterSuite
	public void afterSuite() {

		driver.quit();

	}



}
