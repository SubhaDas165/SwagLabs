package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.Reporter;

public class Footer_Page {
WebDriver driver;
	
	public Footer_Page(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}
	public void login_My_Store() {
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();
		System.out.println("SignIn successful");
	}
	public void verify_Facebook_Link() {
		driver.findElement(By.xpath("//*[@id=\"page_wrapper\"]/footer/ul/li[2]/a")).click();
		String ac=driver.getTitle();
		String ex="Swag Labs";

		Assert.assertEquals(ac, ex);
		Reporter.log(ac);
		System.out.println();
		
	}
	public void verify_Twitter_Link() {
		driver.findElement(By.xpath("//*[@id=\"page_wrapper\"]/footer/ul/li[1]/a")).click();
		String ac=driver.getTitle();
		String ex="Swag Labs";

		Assert.assertEquals(ac, ex);
		Reporter.log(ac);
		System.out.println();

	}
	public void verify_Linkdin_Link() {
	    driver.findElement(By.xpath("//*[@id=\"page_wrapper\"]/footer/ul/li[3]/a")).click();
		String ac=driver.getTitle();
		
		String ex="Swag Labs";
	
		Assert.assertEquals(ac, ex);
		Reporter.log(ac);
		System.out.println();

	}
	
	public void verify_Location_Text() {
		String ac=driver.findElement(By.className("footer_copy")).getText();
		String ec="© 2022 Sauce Labs. All Rights Reserved. Terms of Service | Privacy Policy";

		Assert.assertEquals(ac, ec);
		Reporter.log(ac);
		System.out.println();

	}


}
