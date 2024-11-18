package testCasesCFB;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pageObjectsCFB.BookingPlanCFB;

public class BookingPlanTest_001 {
	public WebDriver driver;
	public WebDriverWait wait; 

	@BeforeClass
	public void setup() {
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://www.in.cheapflights.com/");
		new WebDriverWait(driver,Duration.ofSeconds(10));

	}

	@AfterClass
	public void tearDown() 
	{

	}
	
	@Test
	public void verify_booking_plan() throws InterruptedException 
	{
		BookingPlanCFB obj=new BookingPlanCFB(driver);
		Thread.sleep(5000);
		obj.clickOnReturn();
		Thread.sleep(5000);
		obj.clickOnSelectOneWay();
		obj.clickOnTraveller();
		
		obj.selectPasenger();
		Thread.sleep(5000);
		
		obj.selectLocation("Delhi", "Bombay");

	}

}
