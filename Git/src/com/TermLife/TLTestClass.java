package com.TermLife;

import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.confi.Configures;

public class TLTestClass {
	
	WebDriver driver;
	TLPOM TL= new TLPOM(driver);

	@BeforeClass
	public void Openbrowser() throws InterruptedException {
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
	}

	@Test(priority=1)
	public void openURL() throws InterruptedException {
		driver.get(Configures.Termurl);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);	
	}

	@Test(priority=2)
	public void loginPage() throws InterruptedException {
		
		Thread.sleep(2000);
		TLPOM field = new TLPOM(driver);
		field.clickfemale();
		field.fname("ABCD WXYZ");
		field.birthdate("11/11/1990");
		field.MobileNo("9921499993");
		
	}
	
	@Test(priority=3)
	public void CveragePage() {
		//Previous Session Link
		driver.get("https://termlife.policybazaar.com/quotes/dOTIuRju7zbZ6iN3na3rrQ==?utm_medium=home&utm_term=home&utm_content=home_v11&isDefaultCity=false&isProgressiveJourney=true&custId=ut4_5MpoVADHnRf_jUMzOw==&payType=1&page=1");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);	
		
		//driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		TL.Sub();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	@Test(priority=4)
	public void InsuredDeatils() {
		//Previous Session Link
		driver.get("https://lifeinsurance.policybazaar.com/IPruTerm?PaymentFreqency=12&enquiryId=dOTIuRju7zbZ6iN3na3rrQ==&planId=892&tabName=oneTimePlans&ppt=28&payOptionType=Regular&utm_medium=home&utm_term=home&isMobileDefault=true");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);	
		TLPOM TL= new TLPOM(driver);
		
		//Already Saved This Info In Database
		//driver.findElement(By.xpath("//input[@name='FirstName']")).sendKeys("ABCD WXYZ");
		//driver.findElement(By.xpath("//input[@type='email']")).sendKeys("ABCDWXYZ@gmail.com");
		//driver.findElement(By.xpath("//input[@id='AnnualIncome']")).sendKeys("1200000");
		
		//TL.insName("ABCD WXYZ");
		//TL.Email("ABCDWXYZ@gmail.com");
		
		TL.annuIncome("1200000");
		TL.Occupation("Salaried");
		TL.Education("Graduate");
		
		TL.Btton1();

}
	
	@Test(priority=5)
		public void AddressDeatils() throws InterruptedException {
		//Address
		
		Thread.sleep(2000);
		TL.Pincode("411001");
		TL.City("");
		Thread.sleep(5000);
		TL.Que();
		Thread.sleep(2000);
		TL.dose("Both the Doses");
		TL.Btton2();
		Thread.sleep(5000);

				
	}
	@Test(priority=6)
	public void ProceedtoNext() throws InterruptedException {
		
		//Proceed
		TL.pro1();
		Thread.sleep(5000);
		//Check details
		TL.checkdetails();
		Thread.sleep(5000);
		//Pop-up
		TL.Btton3();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		Thread.sleep(5000);
		//payment
		TL.Checkout();
		
	}
       		
	@Test(priority=7)
	public void Payments() throws InterruptedException {
		TLPOM a= new TLPOM(driver);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		Thread.sleep(2000);
     a.entercarno("4485685054725647");
     Thread.sleep(2000);
     a.entercardname("ABCD WXYZ");
     Thread.sleep(2000);
     a.selectmonth("Aug(08)");
     Thread.sleep(2000);
     a.selectyear("2026");
     Thread.sleep(2000);
     a.entercardcvv("494");
     Thread.sleep(2000);
     a.btnsubmit();
    }
}

