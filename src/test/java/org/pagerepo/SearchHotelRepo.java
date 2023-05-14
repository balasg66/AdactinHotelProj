package org.pagerepo;

import org.baseutils.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class SearchHotelRepo {
	
	public SearchHotelRepo()
	{
		PageFactory.initElements(BaseClass.driver, this);
	}

	@FindBy(id="location")
	private WebElement location;
	
	@FindBy(id="hotels")
	private WebElement hotels;
	
	@FindBy(id="room_type")
	private WebElement roomtype;
	
	@FindBy(id="room_nos")
	private WebElement numofrooms;
	
	@FindBy(id="datepick_in")
	private WebElement checkin;
	
	@FindBy(id="datepick_out")
	private WebElement checkout;
	
	@FindBy(id="adult_room")
	private WebElement adultroom;
	
	@FindBy(id="child_room")
	private WebElement childroom;
	
	@FindBy(id="Submit")
	private WebElement search;
	
	

	public WebElement getHotels() {
		return hotels;
	}

	public WebElement getRoomtype() {
		return roomtype;
	}

	public WebElement getNumofrooms() {
		return numofrooms;
	}

	public WebElement getCheckin() {
		return checkin;
	}

	public WebElement getCheckout() {
		return checkout;
	}

	public WebElement getAdultroom() {
		return adultroom;
	}

	public WebElement getChildroom() {
		return childroom;
	}

	public WebElement getSearch() {
		return search;
	}

	public WebElement getLocation() {
		return location;
	}
	
	
	
	@FindBy(id="radiobutton_0")
	private WebElement selchotel;
	
	@FindBy(id="continue")
	private WebElement bcontinue;
	
	public WebElement getSelchotel()
	{
		return selchotel;
	}
	public WebElement getBcontinue()
	{
		return bcontinue;
	}
		
}
