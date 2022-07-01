package testcase;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import browserImplementation.Browser_Launch;
import pages.Login_Page;
import pages.Page_Header;

public class Verify_Page_Header {
	static WebDriver driver=null;
	static Browser_Launch obj;
	static Page_Header ph;
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
		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
	}
    @Test
	public void verify_Page_Header() throws Exception {
		ph=new Page_Header(driver);
		Thread.sleep(3000);
		ph.login_My_Store();
		Thread.sleep(3000);
		ph.verify_Cart();
		Thread.sleep(3000);
		ph.verify_3Slace();
		
	}
	@AfterSuite
	public void afterSuite() {

		driver.quit();

	}
}
