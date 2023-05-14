package org.pageexec;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;

import org.baseutils.BaseClass;
import org.openqa.selenium.WebElement;
import org.pagerepo.SearchHotelRepo;
import org.testng.annotations.Test;

public class SearchHotel extends BaseClass{
	
	
	@Test
	public void searchHotel() throws InterruptedException, FileNotFoundException, IOException
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		SearchHotelRepo sh=new SearchHotelRepo();
		WebElement location = sh.getLocation();
		dropDown(location,readStr("Sheet1",2, 0));
		WebElement hotels = sh.getHotels();
		dropDown(hotels, readStr("Sheet1",2, 1));
		WebElement roomtype = sh.getRoomtype();
		dropDown(roomtype, readStr("Sheet1",3, 2));
		WebElement numofrooms = sh.getNumofrooms();
		dropDown(numofrooms,readStr("Sheet1",2, 3));
		sh.getCheckin().clear();
		
		WebElement checkin = sh.getCheckin();
		checkin.sendKeys(readStr("Sheet1",2,4));	
		
		sh.getCheckout().clear();
		WebElement checkout = sh.getCheckout();
		checkout.sendKeys(readStr("Sheet1",2,5));
		WebElement adultroom = sh.getAdultroom();
		dropDown(adultroom, readStr("Sheet1",2, 6));
		WebElement childroom = sh.getChildroom();
		dropDown(childroom,readStr("Sheet1",2, 7));
		sh.getSearch().click();
		
	}

	@Test
	public void selectHotel()
	{
		SearchHotelRepo sh=new SearchHotelRepo();
		sh.getSelchotel().click();
		sh.getBcontinue().click();
	}
}
