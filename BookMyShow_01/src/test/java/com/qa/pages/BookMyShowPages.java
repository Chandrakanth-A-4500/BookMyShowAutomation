package com.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookMyShowPages {
	
	WebDriver driver;
	
	@FindBy(xpath="//header/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/a[5]")
	WebElement SportsEvent;
	
	public WebElement SportsEvent() {
		return SportsEvent;
	}
	
	@FindBy(xpath="//body/div[@id='super-wrapper']/div[@id='super-container']/div[2]/div[4]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]")
	WebElement OnlineGames;
	
	public WebElement OnlineGames() {
		return OnlineGames;
	}
	
	@FindBy(xpath="//div[contains(text(),'Call of Duty Battle Royale In Aid Of Sightsavers')]")
	WebElement COD;
	
	public WebElement COD() {
		return COD;
	}
	
	@FindBy(xpath="//button[contains(text(),'Register')]")
	WebElement Register;
	
	public WebElement Register() {
		return Register;
	}
	
	@FindBy(xpath="//li[contains(text(),'3:00 PM')]")
	WebElement time;
	
	public WebElement time() {
		return time;
	}
	
	@FindBy(xpath="//button[contains(text(),'Continue')]")
	WebElement Continue;
	
	public WebElement Continue() {
		return Continue;
	}
	
	@FindBy(xpath="//div[contains(text(),'Add')]")
	WebElement Add;
	
	public WebElement Add() {
		return Add;
	}
	
	@FindBy(xpath="//button[contains(text(),'Proceed')]")
	WebElement Proceed;
	
	public WebElement Proceed() {
		return Proceed;
	}
	
	@FindBy(xpath="//input[@name='player_name']")
	WebElement PlayerName;
	
	public WebElement PlayerName() {
		return PlayerName;
	}
	
	@FindBy(xpath="//input[@name='primary_phoneNo']")
	WebElement PrimaryPhoneNo;
	
	public WebElement PrimaryPhoneNo() {
		return PrimaryPhoneNo;
	}
	
	@FindBy(xpath="//input[@name='primary_email']")
	WebElement PrimaryEmail;
	
	public WebElement PrimaryEmail() {
		return PrimaryEmail;
	}
	
	@FindBy(xpath="//input[@name='ingame_name']")
	WebElement InGameName;
	
	public WebElement InGameName() {
		return InGameName;
	}
	
	@FindBy(xpath="//input[@type='checkbox']")
	WebElement CheckBox;
	
	public WebElement CheckBox() {
		return CheckBox;
	}
	
	@FindBy(xpath="//button[contains(text(),'Submit')]")
	WebElement Submit;
	
	public WebElement Submit() {
		return Submit;
	}
	
	@FindBy(xpath="//body/div[@id='modal-root']/div[1]/div[1]/div[1]/div[2]/ul[1]/li[3]/div[1]/div[1]/img[1]")
	WebElement Bengaluru;
	
	public WebElement Bengaluru() {
		return Bengaluru;
	}
	
	@FindBy(xpath="//button[@id='wzrk-cancel']")
	WebElement Cancel;
	
	public WebElement Cancel() {
		return Cancel;
	}
	
	@FindBy(css="#input-error")
	WebElement ErrorMsg1;
	
	public WebElement ErrorMsg1() {
		return ErrorMsg1;
	}
	
	@FindBy(xpath="/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[4]/div[1]/button[1]")
	WebElement CancelButton;
	
	public WebElement CancelButton() {
		return CancelButton;
	}
	
	public BookMyShowPages(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

}
