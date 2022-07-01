package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.Reporter;

public class Navigation_Page {
WebDriver driver;
	
	public Navigation_Page(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}
	public void login_My_Store() {
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();
		System.out.println("SignIn successful");
	}
	public void verify_All_Item_Link() {
		driver.findElement(By.className("bm-burger-button")).click();
//		driver.findElement(By.id("inventory_sidebar_link")).click();
		driver.findElement(By.partialLinkText("Sauce Labs Bike Light")).click();
	
	}
	public void verify_About_Link() {
		driver.findElement(By.className("bm-burger-button")).click();
		
		driver.findElement(By.linkText("About")).click();
		String ac=driver.getTitle();
		String ec="Cross Browser Testing, Selenium Testing, Mobile Testing | Sauce Labs";
		Assert.assertEquals(ac, ec);
		Reporter.log(ac);
		
	
	}
	public void verify_Logout_Link() {
		driver.findElement(By.className("bm-burger-button")).click();
		
		driver.findElement(By.linkText("About")).click();
		String ac=driver.getTitle();
		String ec="Cross Browser Testing, Selenium Testing, Mobile Testing | Sauce Labs";
		Assert.assertEquals(ac, ec);
		Reporter.log(ac);
		
	
	}
	public void verify_ResetAppState_Link() {
		driver.findElement(By.className("bm-burger-button")).click();
		
		driver.findElement(By.linkText("About")).click();
		String ac=driver.getTitle();
		String ec="Cross Browser Testing, Selenium Testing, Mobile Testing | Sauce Labs";
		Assert.assertEquals(ac, ec);
		Reporter.log(ac);
		
	
	}

}
