package luma.us.pagefactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import luma.us.basepage.BasePage;
import luma.us.generics.CommonUtilities;
import luma.us.generics.WaitHelper;

public class LoginLuma_PF2 extends BasePage {

	// How I can initialize pagefactory concept?

	public LoginLuma_PF2() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "(//a[contains(text(),'Sign In')])[1]")
	@CacheLookup
	private WebElement clickSignInBTN;

	public WebElement GetClickSignInBTN() {
		return clickSignInBTN;

	}

	// ------
	@FindBy(xpath = "//input[@id = 'email']")
	@CacheLookup
	private WebElement EnterEmail;

	public WebElement GetEnterEmail() {
		return EnterEmail;

	}

	// --------
	@FindBy(xpath = "(//input[@id = 'pass'])[1]")
	@CacheLookup
	private WebElement EnterPassword;

	public WebElement GetEnterPassword() {
		return EnterPassword;

	}

	// ------
	@FindBy(xpath = "(//span[contains(text(),'Sign In')])[1]")
	@CacheLookup
	private WebElement clickLogInBTN;

	public WebElement GetClickLogInBTN() {
		return clickLogInBTN;

	}
	
	// ------landing page verification
		@FindBy(xpath = "(//*[text()='Welcome, Tanvir PAtwary!'])[1]")
		@CacheLookup
		private WebElement verifylandingLoginpagetext;

		public WebElement GetverifylandingLoginpagetext() {
			return verifylandingLoginpagetext;

		}
		// ------Mouse hover to men
				@FindBy(xpath = "//span[contains(text(),'Men')]")
				@CacheLookup
				private WebElement MouseHoverToMen;

				public WebElement GetMouseHoverToMen() {
					return MouseHoverToMen;

				}
//				// ------Mouse hover Men to > Top
//				@FindBy(xpath = "(//*[contains(text(),'Tops')])[2]")
//				@CacheLookup
//				private WebElement MouseHoverToTop;
//
//				public WebElement GetMouseHoverToTop() {
//					return MouseHoverToTop;
//
//				}
//				// ------Click_Jacket
//				@FindBy(xpath = "(//*[contains(text(),'Jackets')])[2]")
//				@CacheLookup
//				private WebElement Click_Jacket;
//
//				public WebElement GetClick_Jacket() {
//					return Click_Jacket;
//
//				}
//				
//				
//				
//				// ------Verify the jacket name on the Jupiter All-Weather Trainer list
//				@FindBy(xpath = "//*[contains(text(),'Jupiter All-Weather Trainer')]")
//				@CacheLookup
//				private WebElement Verify_specific_Jacket_Name;
//
//				public WebElement GetVerify_specific_Jacket_Name() {
//					return Verify_specific_Jacket_Name;
//
//				}
//				
//				
//				
//				
//				// ------User should select/click specific itesms
//				@FindBy(xpath = "( //*[contains(text(),'Jupiter All-Weather Trainer')])[1]")
//				@CacheLookup
//				private WebElement ClickItems;
//
//				public WebElement GetClickItems() {
//					return ClickItems;
//
//				}
//				
//				//--------User should be able to select  specific size ex: M
//				//M and Blue and {int} then click on the add to cart
//				
//				@FindBy(xpath = "(//*[@class='swatch-option text'])[2]")
//				@CacheLookup
//				private WebElement SelectSize;
//
//				public WebElement GetSelectSize() {
//					return SelectSize;
//
//				}
//				
//				//--------User should be able to select  specific Color ex: Blue
//				
//				
//				@FindBy(xpath = "(//*[@class='swatch-option color'])[1]")
//				@CacheLookup
//				private WebElement SelectColor;
//
//				public WebElement GetSelectColor() {
//					return SelectColor;
//
//				}
//				
//				
//	//--------User should be able add the items to carts
//				
//				
//				@FindBy(xpath = "(//*[text()='Add to Cart'])")
//				@CacheLookup
//				private WebElement addtoCart;
//
//				public WebElement GetaddtoCart() {
//					return addtoCart;
//
//				}
//				
//				
////--------User should be able click on the Shopping Cart  to Proceed to Checkout
//				
//				
//				@FindBy(xpath = "//*[text()='shopping cart']")
//				@CacheLookup
//				private WebElement Shopping_CartTo_Proceed_Checkout;
//
//				public WebElement GetShopping_CartTo_Proceed_Checkout() {
//					return Shopping_CartTo_Proceed_Checkout;
//
//				}
//				
////--------User should be able add Quantity 
//				
//				
//				@FindBy(xpath = "//*[@class='input-text qty']")
//				@CacheLookup
//				private WebElement add_QT;
//
//				public WebElement Getadd_QT() {
//					return add_QT;
//
//				}
//				
//				
////--------User should be able to click  updte shopping cart
//				
//				
//				@FindBy(xpath = "//*[text()='Update Shopping Cart']")
//				@CacheLookup
//				private WebElement Update_Shopping_Cart;
//
//				public WebElement GetUpdate_Shopping_Cart() {
//					return Update_Shopping_Cart;
//
//				}
//				
////--------User should be able click on  Proceed to Checkout
//				
//				
//				@FindBy(xpath = "(//*[text()='Proceed to Checkout'])[2]")
//				@CacheLookup
//				private WebElement Click_Proceed_Checkout;
//
//				public WebElement GetClick_Proceed_Checkout() {
//					return Click_Proceed_Checkout;
//
//				}
//				
//				// or User should be able click on actionShowcart Btn
//				//*[@class='action showcart']
//				
//				@FindBy(xpath = "(//*[text()='My Cart'])[1]")
//				@CacheLookup
//				private WebElement ClickactionShowcart;
//
//				public WebElement GetClickactionShowcart() {
//					return ClickactionShowcart;
//
//				}
//				
//				
//				
////--------User should be able click New address to add shipping address
//				
//				@FindBy(xpath = "//*[text()='New Address']")
//				@CacheLookup
//				private WebElement Click_NewAddress;
//
//				public WebElement GetClick_NewAddress() {
//					return Click_NewAddress;
//
//				}
				
				
//----------------------------------
	// -- old way---  Log in Functionality method
	/*
	 * public void getLogin() { GetClickSignInBTN().click();
	 * GetEnterEmail().sendKeys(prop.getProperty("Email"));
	 * GetEnterPassword().sendKeys(prop.getProperty("Password"));
	 * GetClickLogInBTN().click();
	 * 
	 * }
	 */

	public void getLogin() {
		log.info("User able to click on SignIn Button");
		WaitHelper.seleniumWait(GetClickSignInBTN(), 30);
		CommonUtilities.getActionClick(GetClickSignInBTN());
		
		log.info("User able to enter Email address");
		WaitHelper.seleniumWait(GetEnterEmail(), 30);
		GetEnterEmail().sendKeys(prop.getProperty("Email"));
		
		log.info("User able to enter Password");
		WaitHelper.seleniumWait(GetEnterPassword(), 30);
		GetEnterPassword().sendKeys(prop.getProperty("Password"));
		
		log.info("User able to click on LogIn Button");
		WaitHelper.seleniumWait(GetClickLogInBTN(), 30);
		CommonUtilities.getActionClick(GetClickLogInBTN());
		
//		log.info("verifylandingLoginpagetext");
//		WaitHelper.seleniumWait(verifylandingLoginpagetext, 30);
		

	}
}
