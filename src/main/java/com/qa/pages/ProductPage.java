package com.qa.pages;

import org.openqa.selenium.support.PageFactory;

import com.qa.BaseTest;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class ProductPage {

	@AndroidFindBy(xpath = "//android.widget.ScrollView[@content-desc=\"test-PRODUCTS\"]"
			+ "/preceding-sibling::android.view.ViewGroup/android.widget.TextView")
	private MobileElement productTitleTxtFld;
	
BaseTest base;
	
	
	public ProductPage() {
		
		base=new BaseTest();
		PageFactory.initElements(new AppiumFieldDecorator(base.getDriver()), this);
	}

	public String getTitle() {

		return base.getAttribute(productTitleTxtFld, "text");

	}

}
