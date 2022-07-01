package testcase;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import browserImplementation.Browser_Launch;
import pages.Navigation_Page;
import pages.Page_Header;

public class Verify_Naviagation_Page {
	static WebDriver driver=null;
	static Browser_Launch obj;
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
//		driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
	}
    @Test
	public void verify_Navigation() throws Exception {
		np=new Navigation_Page(driver);
		np.login_My_Store();
		Thread.sleep(3000);
		np.verify_All_Item_Link();
		np.verify_About_Link();
	}
	@AfterSuite
	public void afterSuite() {

		driver.quit();

	}

}
