package testcase;


import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import browserImplementation.Browser_Launch;
import pages.Footer_Page;
import pages.Home_Page;
import pages.Navigation_Page;


public class Verify_HomePage {
	static WebDriver driver=null;
	static Browser_Launch obj;
	static Home_Page hp;
	static Navigation_Page np;

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
		np=new Navigation_Page(driver);
		np.login_My_Store();
		driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
	}
		
	@Test
	public void verify_HomePage() throws Exception {
		
		
		hp =new Home_Page(driver);
		Thread.sleep(2000);
		hp.verify_Filter_AtoZ_Product();
		hp.verify_Filter_ZtoA_Product();
		hp.verify_Filter_LowtoHigh_Product();
		hp.verify_Filter_HighToLow_Product();
		Thread.sleep(2000);
		hp.verify_Title_Product();
		hp.verify_SwagLabs_Backpack_Link();
		hp.verify_SwagLabs_BikeLight_Link();
		hp.verify_SwagLabs_BoldTshirt_Link();
		hp.verify_SwagLabs_Jacket_Link();
		hp.verify_SwagLabs_Onnisei_Link();
		hp.verify_SwagLabs_TshirtRed_Link();
		
	}
		
        @AfterSuite
    	public void afterSuite() {

    		driver.quit();

    	}

	

}
