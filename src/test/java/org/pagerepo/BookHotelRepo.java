package org.pagerepo;

import org.baseutils.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookHotelRepo {
	
	public BookHotelRepo()
	{
		PageFactory.initElements(BaseClass.driver,this);
	}
	
	
	@FindBy(id="first_name")
	private WebElement fname;
	@FindBy(id="last_name")
	private WebElement lname;
	@FindBy(id="address")
	private WebElement address;
	@FindBy(id="cc_num")
	private WebElement cnum;
	@FindBy(id="cc_type")
	private WebElement ctype;
	@FindBy(id="cc_exp_month")
	private WebElement emonth;
	@FindBy(id="cc_exp_year")
	private WebElement eyear;
	@FindBy(id="cc_cvv")
	private WebElement cvvnum;
	@FindBy(id="book_now")
	private WebElement bbooknow;
	public WebElement getFname() {
		return fname;
	}
	public WebElement getLname() {
		return lname;
	}
	public WebElement getAddress() {
		return address;
	}
	public WebElement getCnum() {
		return cnum;
	}
	public WebElement getCtype() {
		return ctype;
	}
	public WebElement getEmonth() {
		return emonth;
	}
	public WebElement getEyear() {
		return eyear;
	}
	public WebElement getCvvnum() {
		return cvvnum;
	}
	public WebElement getBbooknow() {
		return bbooknow;
	}
	
	@FindBy(id="order_no")
	private WebElement orderno;
	
	public WebElement getOrdernum()
	{
		return orderno;
	}
}
