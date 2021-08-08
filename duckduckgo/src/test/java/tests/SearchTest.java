package tests;

import java.util.concurrent.TimeUnit;


import org.testng.annotations.Test;


import Data.SearchDataProvider;
import pages.HomePage;
import pages.ResultPage;

public class SearchTest extends TestBase{
	
	//results are displayed when searching for generic keyword
	@Test(dataProvider="checkResultDisplayed", dataProviderClass = SearchDataProvider.class)
	public void checkResultDisplayed(String searchword)
	{
		HomePage home = new HomePage(driver);
		home.searchFor(searchword);
		home.clickSearch();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		ResultPage result = new ResultPage(driver);
		result.checkResultExist();
	}
	
	//results are displayed when searching for specific keyword
	@Test(dataProvider="checkSpecificResultDisplayed", dataProviderClass = SearchDataProvider.class)
	public void checkSpecificResultDisplayed(String searchword) throws InterruptedException
	{
		HomePage home = new HomePage(driver);
		home.searchFor(searchword);
		Thread.sleep(1000);
		home.clickSuggestKeyword(0);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		ResultPage result = new ResultPage(driver);
		result.checkResultExist();
	}
	
	//search suggestions are displayed for valid keywords
	@Test(dataProvider="checkSearchSuggest", dataProviderClass = SearchDataProvider.class)
	public void checkSearchSuggest(String searchword)
	{
		HomePage home = new HomePage(driver);
		home.searchFor(searchword);
		home.checkSearchSuggest();
	}
	
	//no search for empty keyword
	@Test
	public void checkSearchWithOutKeyWord()
	{
		HomePage home = new HomePage(driver);
		home.clickSearch();
		home.checkMainPage();
	}

}
