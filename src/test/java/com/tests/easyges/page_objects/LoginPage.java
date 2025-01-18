package com.tests.easyges.page_objects;

import com.tests.easyges.base.BasePage;
import com.tests.easyges.hooks.Setup;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage extends BasePage {

	/* Retrieve Web Element */
	@FindBy(how = How.ID, using = "username")
	private static WebElement username;

	@FindBy(how = How.ID, using = "password")
	private static WebElement passwordField;

	@FindBy(how = How.XPATH, using = "//button[@type='submit']")
	private static WebElement btnLogin;

	@FindBy(how = How.XPATH, using = "//h6[normalize-space()='Dashboard']")
	private static WebElement toolbarItemUser;

	public LoginPage() {
		super(Setup.getDriver());
	}

	public static WebElement getUsername() {
		waitForElementToBeVisible(username);
		return username;
	}

	public static WebElement getPasswordField() {
		waitForElementToBeVisible(passwordField);
		return passwordField;
	}

	public static WebElement getBtnLogin() {
		waitForElementToBeClickable(btnLogin);
		return btnLogin;
	}

	public boolean getUserNameAddress() {
		return find(toolbarItemUser, 1000);
	}

}
