package org.pageexec;

import java.io.IOException;

import org.baseutils.BaseClass;
import org.openqa.selenium.WebElement;
import org.pagerepo.BookHotelRepo;
import org.testng.annotations.Test;

public class BookHotel extends BaseClass{
	
	@Test
	public void bookHotel() throws InterruptedException, IOException
	{
		BookHotelRepo bh=new BookHotelRepo();
		bh.getFname().sendKeys(readStr("Sheet2",1,0));
		bh.getLname().sendKeys(readStr("Sheet2",1,1));
		bh.getAddress().sendKeys(readStr("Sheet2",1,2));
		bh.getCnum().sendKeys(readStr("Sheet2",1,3));
		WebElement ctype = bh.getCtype();
		dropDown(ctype, "Master Card");
		WebElement emonth = bh.getEmonth();
		dropDown(emonth, "June");
		WebElement eyear = bh.getEyear();
		dropDown(eyear, "2022");
		bh.getCvvnum().sendKeys(readStr("Sheet2",1,4));
		bh.getBbooknow().click();
		Thread.sleep(6000);
		WebElement ordernum = bh.getOrdernum();
		String attribute = ordernum.getAttribute("value");
		System.out.println(attribute);
		write(attribute);
	}
}
