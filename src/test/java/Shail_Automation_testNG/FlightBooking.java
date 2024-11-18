package Shail_Automation_testNG;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FlightBooking 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.in.cheapflights.com/");

		driver.manage().window().maximize();

		driver.findElement(By.xpath("//*[text()='Return']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[text()='One-way']")).click();

		driver.findElement(By.xpath("//*[text()='1 adult']")).click();
		driver.findElement(By.xpath("//div[text()='Adults']//button[@aria-label='Increment']")).click();
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/header/div")).click();

		//From-location-Search===========================================
		driver.findElement(By.xpath("//*[@class='c_neb-item-close']")).click();
		WebElement w=driver.findElement(By.xpath(
				"//*[@id=\"main-search-form\"]/div/div/div[2]/div/div/div/div/div[2]/div[1]/div/div/div[1]/div/div/input"));
				w.sendKeys("Delhi");
				Thread.sleep(3000);
		//Actions act=new Actions(driver);
		//List<WebElement> elm=driver.findElements(By.xpath("//ul[@id='flight-origin-smarty-input-list']//li"));
		w.sendKeys(Keys.ARROW_DOWN);
		w.sendKeys(Keys.ENTER);
		
		
		//From-location-Search=========================================
		WebElement to_loc = driver.findElement(By.xpath("//div[@class=\"prSa\"]//following-sibling::*//div//div//div[@role=\"img\"]//following-sibling::*"));
		to_loc.sendKeys("mumbai");
		Thread.sleep(2000);	
		to_loc.sendKeys(Keys.ARROW_DOWN);
		to_loc.sendKeys(Keys.ENTER);
		

		//Select calendar date=========================================
		Thread.sleep(2000);
		try 
		{
			driver.findElement(By.xpath("//div[@role='button' and @class='JONo-button']")).click();
			while (true) 
			{
				String el1 = driver
						.findElement(By.xpath("//caption[@class='w0lb w0lb-month-name w0lb-mod-align-center']"))
						.getText();
				if (el1.equals("January 2025"))
				{
					break;

				} else 
				{

					driver.findElement(By.xpath("//div[@role='button' and @aria-label='Next month']")).click();
				}
			}

		
		
		List<WebElement> date=driver.findElements(By.xpath("//tr[@class='or3C-week or3C-grid']//td"));
		for(WebElement el:date) 
		{
			if(el.getText().equals("14")) 
			{
				el.click();
		    }
		}
		

			
		}catch(Exception e) 
		{
			System.out.println(e.getMessage());
		}

	
	
		

		// Search=======================================
		driver.findElement(By.xpath("//*[@class='RxNS-button-content']//div//div")).click();
        Thread.sleep(4000);
	 /*WebElement el = driver.findElement(
		By.xpath("//*[@class='RxNS-button-content']//div//div"));
		boolean bg = el.isDisplayed();
		System.out.println(bg);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		// WebElement el=driver.findElement(By.xpath("//input[@id='male']"));
		js.executeScript("arguments[0].click()", el);
		*/

		// next page fight details
		Set<String>win_IDs=driver.getWindowHandles();
		System.out.println(win_IDs);//[DA19273354E6E02EB7AE4AE98CD10E0F, 85E2397A96DD3E59A6AC2EF04A88716A]
		
		List<String> win_IDs_list=new ArrayList(win_IDs);//converting set to ArrayList
		String parent_id=win_IDs_list.get(0);//Parent window
		String child_id=win_IDs_list.get(1);//Child window
		
		
		
		driver.switchTo().window(child_id);
		System.out.println(driver.getTitle());//just for verify
		
		List<WebElement> s=driver.findElements(By.xpath("  //div[@class='vmXl vmXl-mod-variant-large']"));
		System.out.println(s);
		for(WebElement s1:s) 
		{
			System.out.println(s1.getText());
		}
		
		
		List<WebElement> airport = driver.findElements(By.xpath("//*[@class='J0g6-labels-grp']"));
		
		System.out.println(airport);
		for(WebElement s2:airport)
		{
			System.out.println(s2.getText());
		}
		
List<WebElement> amount = driver.findElements(By.xpath("//span[@class='c_f8N-price']"));
		
		System.out.println(amount);
		for(WebElement s3:amount)
		{
			System.out.println(s3.getText());
		}
		
List<WebElement> data = driver.findElements(By.xpath("//div[@class='nrc6-content-section']"));
		
		System.out.println(data);
		for(WebElement s4:data)
		{
			System.out.println(s4.getText());
		}


	}

}
