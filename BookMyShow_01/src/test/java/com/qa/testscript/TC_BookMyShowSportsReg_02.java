package com.qa.testscript;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TC_BookMyShowSportsReg_02 extends TestBase{
	
	@Test
	public void BookMyShowSportsRegNegative() throws InterruptedException {
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
		BookMyShowPagesOR.PlayerName().click();
		BookMyShowPagesOR.PrimaryPhoneNo().sendKeys("8892361851");
		Thread.sleep(3000);
		String ErrorMsg1 = BookMyShowPagesOR.ErrorMsg1().getText();
		Assert.assertEquals(ErrorMsg1, "");
		Reporter.log("Error message displayed",true);
	}

}
