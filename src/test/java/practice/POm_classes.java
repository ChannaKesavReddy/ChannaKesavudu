package practice;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class POm_classes {
//Declaration
	@FindBy(xpath="//input[@id='username']")private WebElement untextbox;
	@FindBy(xpath="(//input[@type='password'])[1]")private WebElement pwdtextbox;
	@FindBy(xpath="//a[@id='loginButton']")private WebElement loginBtn;
//Initialization
	public POm_classes() {
		
	}
//Implementation
	public WebElement getUntextbox() {
		return untextbox;
	}
	public WebElement getPwdtextbox() {
		return pwdtextbox;
	}
	public WebElement getLoginBtn() {
		return loginBtn;
	}
	
}
