package pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

	public HomePage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(id = "search_form_input_homepage")
	WebElement search_textbox;
	@FindBy(id = "search_button_homepage")
	WebElement search_button;
	@FindBy(className = "search__autocomplete")
	WebElement search_suggest;
	@FindBy(id = "search_button_homepage")
	WebElement check_main_page;
	@FindBy(className = "acp" )
	List<WebElement> select_search_suggest;
	
	public void searchFor(String name)
	{
		search_textbox.sendKeys(name);
	}
	
	public void clickSearch()
	{
		search_button.click();
	}
	
	public void checkSearchSuggest()
	{
		search_suggest.isDisplayed();
	}
	
	public void checkMainPage()
	{
		check_main_page.isDisplayed();
	}
	
	public void clickSuggestKeyword(int suggest_number)
	{
		select_search_suggest.get(suggest_number).click();
	}
	

}
