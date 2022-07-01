package testcase;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import java.util.*;
import java.util.concurrent.TimeUnit;

import browserImplementation.Browser_Launch;
import pages.Buy_Product;
import pages.Login_Page;

public class Verify_LoginPage {
	static WebDriver driver=null;
	static Browser_Launch obj;
	static Login_Page lp;
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
		driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
	}
	@Test
	public void verify_Login_Page() throws Exception {
		lp=new Login_Page(driver);
		lp.verify_Login_Button();
		lp.verify_Accepted_UserName();
		lp.verify_UserName();
		lp.verify_Accepted_PasswordText();
		lp.verify_PasswordText();
	}

	@AfterSuite
	public void afterSuite() {

		driver.quit();

	}



}
