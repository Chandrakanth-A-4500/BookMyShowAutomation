package com.qa.testscript;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TC_BookMyShowSportsReg_01 extends TestBase {
	
	@Test(priority=1)
	public void BookMyShowSportsRegPostive() throws InterruptedException {
		Thread.sleep(5000);
		BookMyShowPagesOR.Cancel().click();
		BookMyShowPagesOR.Bengaluru().click();
		BookMyShowPagesOR.SportsEvent().click();
		Thread.sleep(3000);
		BookMyShowPagesOR.OnlineGames().click();
		Thread.sleep(3000);
		BookMyShowPagesOR.COD().click();
		Thread.sleep(3000);
		BookMyShowPagesOR.Register().click();
		Thread.sleep(3000);
		BookMyShowPagesOR.time().click();
		BookMyShowPagesOR.Continue().click();
		Thread.sleep(3000);
		BookMyShowPagesOR.Add().click();
		BookMyShowPagesOR.Proceed().click();
		Thread.sleep(5000);
		BookMyShowPagesOR.PlayerName().sendKeys("Chandra");
		BookMyShowPagesOR.PrimaryPhoneNo().sendKeys("8892361851");
		BookMyShowPagesOR.PrimaryEmail().sendKeys("achandrakanth4500@gmail.com");
		BookMyShowPagesOR.InGameName().sendKeys("Rogue_X7");
		js.executeScript("arguments[0].scrollIntoView(true);",BookMyShowPagesOR.CheckBox());
		BookMyShowPagesOR.CheckBox().click();
		BookMyShowPagesOR.Submit().click();
		Thread.sleep(5000);
		String title = driver.getTitle();
		Assert.assertEquals(title, "Tournament details | BookMyShow");
		Reporter.log("User has landed on payment page",true);
		
	}
	

}
