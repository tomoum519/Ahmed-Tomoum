package Data;

import org.testng.annotations.DataProvider;

public class SearchDataProvider {
	
	@DataProvider(name="checkSearchSuggest")
	public static Object[][] checkSearchSuggest()
	{
		return new Object[][] {
			{"low"}
		};
	}
	
	@DataProvider(name="checkSpecificResultDisplayed")
	public static Object[][] checkSpecificResultDisplayed()
	{
		return new Object[][] {
			{"iphone"}
		};
	}
	
	@DataProvider(name="checkResultDisplayed")
	public static Object[][] checkResultDisplayed()
	{
		return new Object[][] {
			{"hi"}
		};
	}
	

}
