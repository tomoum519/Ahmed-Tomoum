package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ResultPage extends BasePage {

	public ResultPage(WebDriver driver) {
		super(driver);
		
	}

	@FindBy(id = "r1-0")
	WebElement search_result;
	
	
	public void checkResultExist()
	{
		search_result.isDisplayed();
	}
}
