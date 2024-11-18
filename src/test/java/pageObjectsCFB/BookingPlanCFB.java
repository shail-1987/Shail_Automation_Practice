package pageObjectsCFB;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BookingPlanCFB extends BasePageCFB {

	public BookingPlanCFB(WebDriver driver)
	{
		super(driver);
		
	}
	
	@FindBy(xpath="//*[text()='Return']")
	WebElement return_Button;
	
	@FindBy(xpath="//*[text()='One-way']")
	WebElement select_oneWay;
	
	@FindBy(xpath="//*[text()='1 adult']")
	WebElement traveller_button;
	
	@FindBy(xpath="//div[text()='Adults']//button[@aria-label='Increment']")
	WebElement add_Adult_icon;
	
	@FindBy(xpath="//*[@id='root']/div/header/div")
	WebElement click_Button;
	
	@FindBy(xpath="//*[@class='c_neb-item-close']")
	WebElement cancel_Button;
	
	@FindBy(xpath="//*[@id=\"main-search-form\"]/div/div/div[2]/div/div/div/div/div[2]/div[1]/div/div/div[1]/div/div/input")
	WebElement searchInputTextFrom;
	
	@FindBy(xpath="//div[@class=\"prSa\"]//following-sibling::*//div//div//div[@role=\"img\"]//following-sibling::*")
	WebElement searchInputTextTo;
	
	
	public void clickOnReturn() {
		return_Button.click();
	}
	
	public void clickOnSelectOneWay() {
		select_oneWay.click();
	}
	
	public void clickOnTraveller() {
		traveller_button.click();
	}
	
	public void selectPasenger() {
		add_Adult_icon.click();
		click_Button.click();//random click to close browser popup
	}
	
	public void selectLocation(String from, String to) {
		cancel_Button.click();
		searchInputTextFrom.click();
		searchInputTextFrom.sendKeys(Keys.ARROW_DOWN);
		searchInputTextFrom.sendKeys(Keys.ENTER);
		searchInputTextTo.click();
		searchInputTextTo.sendKeys(Keys.ARROW_DOWN);
		searchInputTextTo.sendKeys(Keys.ENTER);
		
	}
	


}
