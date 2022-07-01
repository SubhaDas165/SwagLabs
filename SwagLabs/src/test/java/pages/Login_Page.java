package pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.Reporter;

import excelUtility.ExcelReader;

public class Login_Page {
	WebDriver driver;
	ExcelReader er;
	public Login_Page(WebDriver driver) throws Exception {
		// TODO Auto-generated constructor stub
		this.driver=driver;
		String path="C:\\Users\\SUBHA DAS\\eclipse-workspace\\SwagLabs\\Data Source\\Registration Data.xlsx";
		er=new ExcelReader(path);
		
	}
	public void verify_Login_Button() {
		int row=er.getRowCount(0);
		for (int i = 0; i < row; i++) {
			driver.findElement(By.id("user-name")).sendKeys(er.getData(0, row, 0));
			driver.findElement(By.id("password")).sendKeys(er.getData(0, row, 1));
			driver.findElement(By.id("login-button")).click();
			String ac=driver.findElement(By.className("title")).getText();
			String ec="PRODUCTS";
			Assert.assertEquals(ac, ec);
			Reporter.log(ac);
			Reporter.log(er.getData(0, row, 0));
			Reporter.log(er.getData(0, row, 1));
			
			driver.navigate().back();
		}
		
		
	}
	public void verify_Accepted_UserName() {
		String ac=driver.findElement(By.xpath("//*[@id=\"login_credentials\"]/h4")).getText();
		String ec="Accepted usernames are:";
		Assert.assertEquals(ac, ec);
		Reporter.log(ac);
		
	}
	public void verify_UserName() {
		String ac1=driver.findElement(By.xpath("//*[@id=\"login_credentials\"]/text()[1]")).getText();
		String ec1="standard_user";
		Assert.assertEquals(ac1, ec1);
		Reporter.log(ac1);
		System.out.println();
		String ac2=driver.findElement(By.xpath("//*[@id=\"login_credentials\"]/text()[2]")).getText();
		String ec2="locked_out_user";
		Assert.assertEquals(ac2, ec2);
		Reporter.log(ac2);
		System.out.println();
		String ac3=driver.findElement(By.xpath("//*[@id=\"login_credentials\"]/text()[3]")).getText();
		String ec3="problem_user";
		Assert.assertEquals(ac3, ec3);
		Reporter.log(ac3);
		System.out.println();
		String ac4=driver.findElement(By.xpath("//*[@id=\"login_credentials\"]/text()[4]")).getText();
		String ec4="performance_glitch_user";
		Assert.assertEquals(ac4, ec4);
		Reporter.log(ac4);
		System.out.println();
		
	}
	public void verify_Accepted_PasswordText() {
		String ac=driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div/div[2]/h4")).getText();
		String ec="Password for all users:";
		Assert.assertEquals(ac, ec);
		Reporter.log(ac);
		
	}
	public void verify_PasswordText() {
		String ac=driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div/div[2]/text()")).getText();
		String ec="secret_sauce";
		Assert.assertEquals(ac, ec);
		Reporter.log(ac);
		
	}

}
