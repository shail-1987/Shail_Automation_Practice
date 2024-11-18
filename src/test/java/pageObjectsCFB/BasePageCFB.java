package pageObjectsCFB;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class BasePageCFB {
	WebDriver driver;
	
	public BasePageCFB(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}


}
