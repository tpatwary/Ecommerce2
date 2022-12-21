package luma.us.generics;

import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import luma.us.basepage.BasePage;

public class CommonUtilities extends BasePage {
	
	// Actions class click functionality 
	public static void getActionClick(WebElement ele) {
		Actions click = new Actions(driver);
		click.click(ele).build().perform();;
	}
	
	// Click functionality with Java ScriptExecutor
	public static void getJsClick(WebElement ele) {
	JavascriptExecutor executor = (JavascriptExecutor)driver;
	executor.executeScript("arguments[0].click();", ele);
	}
	
	// verification method
	public static void getAssert(String expected, String actual) {
		
		 Assert.assertEquals(expected, actual);
		    System.out.println("Verified text :: "+ actual);
		
	}
	// action class MouseHover method
	public static void MouseHover(WebElement ele) {
		
		Actions act = new Actions(driver);
		act.moveToElement(ele).build().perform();
		
	}

  	// Scroll up & down using JavascriptExecutor
	// This  will scroll down the page by  1000 pixel vertical	
	
    public static void getJsScrollUP_Down(WebElement ele) {
      	JavascriptExecutor jsScrollUP_DOWN = (JavascriptExecutor)driver;
    	jsScrollUP_DOWN.executeScript("window.scrollBy(0,1000)");
    	}
    

  //scroll up a page using Action class
    public static void getScrollUpWithActionClass() {
    	Actions a = new Actions(driver);
    	
    	a.sendKeys(Keys.PAGE_UP).build().perform();
    }
    
    //scroll down a page using Action class
    public static void getScrollDownWithActionClass() {
    	Actions a = new Actions(driver);
    	a.sendKeys(Keys.PAGE_DOWN).build().perform();

    }
}
