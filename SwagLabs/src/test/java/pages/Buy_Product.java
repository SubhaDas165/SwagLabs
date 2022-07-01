package pages;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.Reporter;

import excelUtility.ExcelReader;

public class Buy_Product {
	WebDriver driver;
	ExcelReader er;
	public Buy_Product(WebDriver driver) throws Exception {
		// TODO Auto-generated constructor stub
		this.driver=driver;
		
	}
	public void buy_Product() {
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
				
		driver.findElement(By.id("login-button")).click();
		driver.findElement(By.id("item_4_title_link")).click();
		driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
		driver.findElement(By.className("shopping_cart_link")).click();
        driver.findElement(By.id("checkout")).click();
        driver.findElement(By.id("first-name")).sendKeys("s");
        driver.findElement(By.id("last-name")).sendKeys("d");
        driver.findElement(By.id("postal-code")).sendKeys("123");
        driver.findElement(By.id("continue")).click();
        driver.findElement(By.id("finish")).click();

	}
	

}
