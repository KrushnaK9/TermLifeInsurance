package com.TermLife;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class TLPOM {
	public TLPOM(WebDriver driver){
		PageFactory.initElements(driver, this);
		
		
	}
	//LoginPage
	@FindBy(xpath="(//i[@class='radio'])[2]" )private WebElement button;
	@FindBy(xpath="//input[@id='nameAdd']" )private WebElement fname;
	@FindBy(xpath="//input[@name='dob']" )private WebElement DOB;
	@FindBy(xpath="//input[@name='mobileNo']" )private WebElement mobile;
	
	//Coverage Page
	/*@FindBy(xpath="//span[@class='proceed ng-star-inserted']" )private WebElement viewfreeQute;
	@FindBy(xpath="//div[@class='model-body ng-tns-c71-4 housewive DomesticUi']" )private WebElement Que1;
	@FindBy(xpath="//li[@class='child0 ng-star-inserted']" )private WebElement company;
	@FindBy(xpath="(//button[@type='button'])[1]" )private WebElement plans;*/
	
	
	@FindBy(xpath="//button[@type='submit']" )private WebElement submitpop;
	
	
	@FindBy(xpath="//input[@name='FirstName']" )private WebElement Insname;
	@FindBy(xpath="//input[@type='email']" )private WebElement mail;
	@FindBy(xpath="//input[@id='AnnualIncome']" )private WebElement income;
	@FindBy(xpath="//select[@id='Occupation']" )private WebElement occup;
	@FindBy(xpath="//select[@id='Education']" )private WebElement edu;
	
	@FindBy(xpath="(//button[@type='button'])[2]" )private WebElement bttn1;

	//AddressDeatils
	@FindBy(xpath="//input[@id='Pincode']" )private WebElement pincode;
	@FindBy(xpath="//input[@id='City']" )private WebElement city;
	@FindBy(xpath="(//span[@class='label'])[1]" )private WebElement YN;
	@FindBy(xpath="//select[@id='VaccinatedDoses']" )private WebElement dosees;
	@FindBy(xpath="//button[@id='btnsaveProceed']" )private WebElement bttn2;
	
	//Proceed
	@FindBy(xpath="//button[@id='btnsaveProceed']" )private WebElement p1;
	@FindBy(xpath="//button[@id='btnsaveProceed']" )private WebElement Cd;
	@FindBy(xpath="//button[@id='btnPopupClose']" )private WebElement bttn3;
	@FindBy(xpath="//button[contains(text(),'Checkout')]" )private WebElement check;
	
	//Payment
	@FindBy(xpath="//input[@id='creditCardNo']") private WebElement cardno;
	@FindBy(xpath="//input[@id='creditCardName']") private WebElement cardname;
	@FindBy(xpath="//select[@id='creditMonth']") private WebElement creditmonth;
	@FindBy(xpath="//select[@id='creditYear']") private WebElement credityear;
	@FindBy(xpath="//input[@id='creditCvv']") private WebElement cardcvv;
	@FindBy(xpath="//button[@id='creditpaynow']") private WebElement paybtn;
	
	//LoginPage
	public void clickfemale() {
		button.click();
	}
	public void fname(String name) {
		fname.sendKeys(name);
	}
	public void birthdate(String date) {
		DOB.sendKeys(date);
	}
	public void MobileNo(String NUM) {
		mobile.sendKeys(NUM);
	}
/*	public void Quteclick() {
		viewfreeQute.click();
	}
	public void que1() {
		Que1.isDisplayed();
	}
	public void Insurer() {
		company.click();
	}
	public void viewplans() {
		plans.click();
	}*/
	
	public void Sub() {
		submitpop.click();
	}
	//InsuredDeatils
	public void insName(String name) {
		Insname.sendKeys(name);
	}
	public void Email(String mailid) {
		mail.sendKeys(mailid);
	}
	public void annuIncome(String inc) {
		income.sendKeys(inc);
	}
	public void Occupation(String oc) {
		Select s = new Select(occup);
		s.selectByVisibleText(oc);
	}
	public void Education(String Educ) {
		Select s1 = new Select(edu);
		s1.selectByVisibleText(Educ);
	}
	public void Btton1() {
		bttn1.click();
	}
	//AddressDeatils
	public void Pincode(String pc) {
		pincode.sendKeys(pc);
	}
	public void City(String cty) {
		city.sendKeys(cty);
	}
	public void Que() {
		YN.click();
	}
	public void dose(String dos) {
		Select s9 = new Select(dosees);
		s9.selectByVisibleText(dos);
	}
	public void Btton2() {
		bttn2.click();
		}
	//Proceed
	
	public void pro1() {
		p1.click();
		}
	public void checkdetails() {
		Cd.click();
		}
	public void Btton3() {
		bttn3.click();
		}
	public void Checkout() {
		check.click();
		}
	//Payment
	public void entercarno(String cnumber) 
	{
		cardno.sendKeys(cnumber);
	}
	public void entercardname(String cname)
	{
		cardname.sendKeys(cname);
	}
	public void selectmonth(String cmonth)
	{
		Select s=new Select(creditmonth);
		s.selectByVisibleText(cmonth);
	}
	public void selectyear(String cyear)
	{
		Select s1=new Select(credityear);
	     s1.selectByVisibleText(cyear);
	}
	public void entercardcvv(String cvv)
	{
		cardcvv.sendKeys(cvv);
	}
	
	public void btnsubmit()
	{
		paybtn.click();
	}
	
}
