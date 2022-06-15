package generic;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class WebDriverCommonLib extends BaseTest{
	
	
	public String getTheTitleOfTheWebPage()
	{
		String titleOfTheWebPage = driver.getTitle();
		return titleOfTheWebPage;
	}
	
	public void verifyThePageTitle(String expectedTitle, String pageName)
	{
		String actualTitle= driver.getTitle();
		
		if(expectedTitle.equals(actualTitle))
		{
			System.out.println(pageName+"is not verifies");
		}
		
		else
		{
			System.out.println(pageName+"is not verified");
		}
	}
	
	
	//mouse actions
	
	public void mouseHover(WebElement target)
	{
		Actions act=new Actions(driver);
		act.moveToElement(target).perform();
	}
	

	public void rightClickact(WebElement target)
	{
		Actions act=new Actions(driver);
		act.moveToElement(target).perform();
		
	}
	
	
}
