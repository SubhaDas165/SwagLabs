package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.Reporter;

public class Home_Page {
	WebDriver driver;
	
	public Home_Page(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}
	public void verify_Title_Product() {
		String ac=driver.findElement(By.className("title")).getText();
		String ec="PRODUCTS";
		Assert.assertEquals(ac, ec);
		Reporter.log("Expected Value is matching "+ac );
	}
	public void verify_Filter_AtoZ_Product() {
		WebElement testDropDown1 = driver.findElement(By.className("product_sort_container"));  
		Select dropdown1 = new Select(testDropDown1);
		dropdown1.selectByVisibleText("Name (A to Z)");
		driver.findElement(By.partialLinkText("Sauce Labs Backpack")).click();
		String ac1=driver.findElement(By.xpath("//*[@id=\"inventory_item_container\"]/div/div/div[2]/div[1]")).getText();
		int text1=ac1.charAt(0);
		driver.navigate().back();
		
		driver.findElement(By.partialLinkText("Sauce Labs Bike Light")).click();
		String ac2=driver.findElement(By.xpath("//*[@id=\"inventory_item_container\"]/div/div/div[2]/div[1]")).getText();
		int text2=ac2.charAt(0);
		driver.navigate().back();

		driver.findElement(By.partialLinkText("Sauce Labs Bolt T-Shirt")).click();
		String ac3=driver.findElement(By.xpath("//*[@id=\"inventory_item_container\"]/div/div/div[2]/div[1]")).getText();
		int text3=ac3.charAt(0);
		driver.navigate().back();

		driver.findElement(By.partialLinkText("Sauce Labs Fleece Jacket")).click();
		String ac4=driver.findElement(By.xpath("//*[@id=\"inventory_item_container\"]/div/div/div[2]/div[1]")).getText();
		int text4=ac4.charAt(0);
		driver.navigate().back();

		driver.findElement(By.partialLinkText("Sauce Labs Onesie")).click();
		String ac5=driver.findElement(By.xpath("//*[@id=\"inventory_item_container\"]/div/div/div[2]/div[1]")).getText();
		int text5=ac5.charAt(0);
		driver.navigate().back();

		driver.findElement(By.partialLinkText("Test.allTheThings() T-Shirt (Red)")).click();
		String ac6=driver.findElement(By.xpath("//*[@id=\"inventory_item_container\"]/div/div/div[2]/div[1]")).getText();
		int text6=ac6.charAt(0);
		driver.navigate().back();

		if(text1<=text2&&text1<=text3&&text1<=text4&&text1<=text5&&text1<=text6) {
			Reporter.log("A to Z product has been verified based on character");
		}

	}
	public void verify_Filter_ZtoA_Product() {
		WebElement testDropDown1 = driver.findElement(By.className("product_sort_container"));  
		Select dropdown1 = new Select(testDropDown1);
		dropdown1.selectByVisibleText("Name (Z to A)");
		driver.findElement(By.partialLinkText("Sauce Labs Backpack")).click();
		String ac1=driver.findElement(By.xpath("//*[@id=\"inventory_item_container\"]/div/div/div[2]/div[1]")).getText();
		int text1=ac1.charAt(0);
		driver.navigate().back();
		
		driver.findElement(By.partialLinkText("Sauce Labs Bike Light")).click();
		String ac2=driver.findElement(By.xpath("//*[@id=\"inventory_item_container\"]/div/div/div[2]/div[1]")).getText();
		int text2=ac2.charAt(0);
		driver.navigate().back();

		driver.findElement(By.partialLinkText("Sauce Labs Bolt T-Shirt")).click();
		String ac3=driver.findElement(By.xpath("//*[@id=\"inventory_item_container\"]/div/div/div[2]/div[1]")).getText();
		int text3=ac3.charAt(0);
		driver.navigate().back();

		driver.findElement(By.partialLinkText("Sauce Labs Fleece Jacket")).click();
		String ac4=driver.findElement(By.xpath("//*[@id=\"inventory_item_container\"]/div/div/div[2]/div[1]")).getText();
		int text4=ac4.charAt(0);
		driver.navigate().back();

		driver.findElement(By.partialLinkText("Sauce Labs Onesie")).click();
		String ac5=driver.findElement(By.xpath("//*[@id=\"inventory_item_container\"]/div/div/div[2]/div[1]")).getText();
		int text5=ac5.charAt(0);
		driver.navigate().back();

		driver.findElement(By.partialLinkText("Test.allTheThings() T-Shirt (Red)")).click();
		String ac6=driver.findElement(By.xpath("//*[@id=\"inventory_item_container\"]/div/div/div[2]/div[1]")).getText();
		int text6=ac6.charAt(0);
		driver.navigate().back();

		if(text6>=text5&&text5>=text4&&text4>=text3&&text3>=text2&&text2>=text1) {
			Reporter.log("z to A product has been verified based on character");
		}

	}
	public void verify_Filter_LowtoHigh_Product() {
		WebElement testDropDown1 = driver.findElement(By.className("product_sort_container"));  
		Select dropdown1 = new Select(testDropDown1);
		dropdown1.selectByVisibleText("Price (low to high)");
		driver.findElement(By.partialLinkText("Sauce Labs Backpack")).click();
		String ac1=driver.findElement(By.className("inventory_details_price")).getText();
		int price5=0;
		for (int i = 1; i < ac1.length(); i++) {
			
			int a=ac1.charAt(i)-48;
			if(a!=-2) {
			price5=price5*10+a;
			}
		}
//		System.out.println(price5);
		driver.navigate().back();
		
		driver.findElement(By.partialLinkText("Sauce Labs Bike Light")).click();
		String ac2=driver.findElement(By.className("inventory_details_price")).getText();
		int price2=0;
		for (int i = 1; i < ac2.length(); i++) {
			
			int a=ac2.charAt(i)-48;
			if(a!=-2) {
			price2=price2*10+a;
			}
		}
//		System.out.println(price2);
		driver.navigate().back();

		driver.findElement(By.partialLinkText("Sauce Labs Bolt T-Shirt")).click();
		String ac3=driver.findElement(By.className("inventory_details_price")).getText();
		int price3=0;
		for (int i = 1; i < ac3.length(); i++) {
			
			int a=ac3.charAt(i)-48;
			if(a!=-2) {
			price3=price3*10+a;
			}
		}
//		System.out.println(price3);
		driver.navigate().back();

		driver.findElement(By.partialLinkText("Sauce Labs Fleece Jacket")).click();
		String ac4=driver.findElement(By.className("inventory_details_price")).getText();
		int price6=0;
		for (int i = 1; i < ac4.length(); i++) {
			
			int a=ac4.charAt(i)-48;
			if(a!=-2) {
			price6=price6*10+a;
			}
		}
//		System.out.println(price6);
		driver.navigate().back();

		driver.findElement(By.partialLinkText("Sauce Labs Onesie")).click();
		String ac5=driver.findElement(By.className("inventory_details_price")).getText();
		int price1=0;
		for (int i = 1; i < ac5.length(); i++) {
			
			int a=ac5.charAt(i)-48;
			if(a!=-2) {
			price1=price1*10+a;
			}
		}
//		System.out.println(price1);
		driver.navigate().back();

		driver.findElement(By.partialLinkText("Test.allTheThings() T-Shirt (Red)")).click();
		String ac6=driver.findElement(By.className("inventory_details_price")).getText();
		int price4=0;
		for (int i = 1; i < ac6.length(); i++) {
			
			int a=ac6.charAt(i)-48;
			if(a!=-2) {
			price4=price4*10+a;
			}
		}
//		System.out.println(price4);
		driver.navigate().back();

		if(price1<=price2&&price2<=price3&&price3<=price4&&price4<=price5&&price5<=price6) {
			Reporter.log("Low to High product has been verified based on price");
			Reporter.log(price1+" < "+price2+" < "+price3+" < "+price4+" < "+price5+" < "+price6);
		}
		System.out.println(price1+" < "+price2+" < "+price3+" < "+price4+" < "+price5+" < "+price6);
		

	}
	public void verify_Filter_HighToLow_Product() {
		WebElement testDropDown1 = driver.findElement(By.className("product_sort_container"));  
		Select dropdown1 = new Select(testDropDown1);
		dropdown1.selectByVisibleText("Price (low to high)");
		driver.findElement(By.partialLinkText("Sauce Labs Backpack")).click();
		String ac1=driver.findElement(By.className("inventory_details_price")).getText();
		int price5=0;
		for (int i = 1; i < ac1.length(); i++) {
			
			int a=ac1.charAt(i)-48;
			if(a!=-2) {
			price5=price5*10+a;
			}
		}
//		System.out.println(price5);
		driver.navigate().back();
		
		driver.findElement(By.partialLinkText("Sauce Labs Bike Light")).click();
		String ac2=driver.findElement(By.className("inventory_details_price")).getText();
		int price2=0;
		for (int i = 1; i < ac2.length(); i++) {
			
			int a=ac2.charAt(i)-48;
			if(a!=-2) {
			price2=price2*10+a;
			}
		}
//		System.out.println(price2);
		driver.navigate().back();

		driver.findElement(By.partialLinkText("Sauce Labs Bolt T-Shirt")).click();
		String ac3=driver.findElement(By.className("inventory_details_price")).getText();
		int price3=0;
		for (int i = 1; i < ac3.length(); i++) {
			
			int a=ac3.charAt(i)-48;
			if(a!=-2) {
			price3=price3*10+a;
			}
		}
//		System.out.println(price3);
		driver.navigate().back();

		driver.findElement(By.partialLinkText("Sauce Labs Fleece Jacket")).click();
		String ac4=driver.findElement(By.className("inventory_details_price")).getText();
		int price6=0;
		for (int i = 1; i < ac4.length(); i++) {
			
			int a=ac4.charAt(i)-48;
			if(a!=-2) {
			price6=price6*10+a;
			}
		}
//		System.out.println(price6);
		driver.navigate().back();

		driver.findElement(By.partialLinkText("Sauce Labs Onesie")).click();
		String ac5=driver.findElement(By.className("inventory_details_price")).getText();
		int price1=0;
		for (int i = 1; i < ac5.length(); i++) {
			
			int a=ac5.charAt(i)-48;
			if(a!=-2) {
			price1=price1*10+a;
			}
		}
//		System.out.println(price1);
		driver.navigate().back();

		driver.findElement(By.partialLinkText("Test.allTheThings() T-Shirt (Red)")).click();
		String ac6=driver.findElement(By.className("inventory_details_price")).getText();
		int price4=0;
		for (int i = 1; i < ac6.length(); i++) {
			
			int a=ac6.charAt(i)-48;
			if(a!=-2) {
			price4=price4*10+a;
			}
		}
//		System.out.println(price4);
		driver.navigate().back();

		if(price6>=price5&&price5>=price4&&price4>=price3&&price3>=price2&&price2>=price1) {
			Reporter.log("Low to High product has been verified based on price");
			Reporter.log(price6+" > "+price5+" > "+price4+" > "+price3+" > "+price2+" > "+price1);
		}
		System.out.println(price6+" > "+price5+" > "+price4+" > "+price3+" > "+price2+" > "+price1);
		


	}
	
	public void verify_SwagLabs_Backpack_Link() {
		driver.findElement(By.partialLinkText("Sauce Labs Backpack")).click();
		String ac=driver.findElement(By.xpath("//*[@id=\"inventory_item_container\"]/div/div/div[2]/div[1]")).getText();
		String ec="Sauce Labs Backpack";

		Assert.assertEquals(ac, ec);
		Reporter.log("Expected Value is matching "+ac );
		driver.navigate().back();
	}

	public void verify_SwagLabs_BikeLight_Link() {
		driver.findElement(By.partialLinkText("Sauce Labs Bike Light")).click();
		String ac=driver.findElement(By.xpath("//*[@id=\"inventory_item_container\"]/div/div/div[2]/div[1]")).getText();
		String ec="Sauce Labs Bike Light";

		Assert.assertEquals(ac, ec);
		Reporter.log("Expected Value is matching "+ac );
		driver.navigate().back();
	}
	public void verify_SwagLabs_BoldTshirt_Link() {
		driver.findElement(By.partialLinkText("Sauce Labs Bolt T-Shirt")).click();
		String ac=driver.findElement(By.xpath("//*[@id=\"inventory_item_container\"]/div/div/div[2]/div[1]")).getText();
		String ec="Sauce Labs Bolt T-Shirt";

		Assert.assertEquals(ac, ec);
		Reporter.log("Expected Value is matching "+ac );
		driver.navigate().back();
	}
	public void verify_SwagLabs_Jacket_Link() {
		driver.findElement(By.partialLinkText("Sauce Labs Fleece Jacket")).click();
		String ac=driver.findElement(By.xpath("//*[@id=\"inventory_item_container\"]/div/div/div[2]/div[1]")).getText();
		String ec="Sauce Labs Fleece Jacket";

		Assert.assertEquals(ac, ec);
		Reporter.log("Expected Value is matching "+ac );
		driver.navigate().back();
	}
	public void verify_SwagLabs_Onnisei_Link() {
		driver.findElement(By.partialLinkText("Sauce Labs Onesie")).click();
		String ac=driver.findElement(By.xpath("//*[@id=\"inventory_item_container\"]/div/div/div[2]/div[1]")).getText();
		String ec="Sauce Labs Onesie";

		Assert.assertEquals(ac, ec);
		Reporter.log("Expected Value is matching "+ac );
		driver.navigate().back();
	}
	public void verify_SwagLabs_TshirtRed_Link() {
		driver.findElement(By.partialLinkText("Test.allTheThings() T-Shirt (Red)")).click();
		String ac=driver.findElement(By.xpath("//*[@id=\"inventory_item_container\"]/div/div/div[2]/div[1]")).getText();
		String ec="Test.allTheThings() T-Shirt (Red)";

		Assert.assertEquals(ac, ec);
		Reporter.log("Expected Value is matching "+ac );
		driver.navigate().back();
	}
	
}	
