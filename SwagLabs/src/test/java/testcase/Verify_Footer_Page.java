package testcase;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import browserImplementation.Browser_Launch;
import pages.Buy_Product;
import pages.Footer_Page;
import pages.Home_Page;
import pages.Login_Page;

public class Verify_Footer_Page {
	static WebDriver driver=null;
	static Browser_Launch obj;
	static Footer_Page fp;
	

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
	public void verify_Footer_Page() throws Exception {
		
		driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
		fp=new Footer_Page(driver);
		fp.login_My_Store();
		fp.verify_Facebook_Link();
		fp.verify_Twitter_Link();
		fp.verify_Linkdin_Link();
		
		fp.verify_Location_Text();

	}
	@AfterSuite
	public void afterSuite() {

		driver.quit();

	}
		
	
}
