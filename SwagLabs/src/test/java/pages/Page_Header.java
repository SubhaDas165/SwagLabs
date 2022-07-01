package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.Reporter;

public class Page_Header {
WebDriver driver;
	
	public Page_Header(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}
	public void login_My_Store() {
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();
		System.out.println("SignIn successful");
	}
	public void verify_3Slace() {
		driver.findElement(By.className("bm-burger-button")).click();
		String ac=driver.findElement(By.id("inventory_sidebar_link")).getText();
	
		String ec="";
		Assert.assertEquals(ac, ec);
		Reporter.log(ac);
	}
	public void verify_Cart() {
		driver.findElement(By.className("shopping_cart_link")).click();
		String ac=driver.findElement(By.className("title")).getText();
		String ex="YOUR CART";
		Assert.assertEquals(ac, ex);
		Reporter.log(ac);
		driver.navigate().back();
	}
	
}
