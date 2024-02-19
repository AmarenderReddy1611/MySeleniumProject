package com.qa.banking.Pages;

import com.qa.banking.Base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends TestBase {

    //PageFactory or Object Repository

    @FindBy(name = "username")
    WebElement username;
    @FindBy(name = "password")
    WebElement password;
    @FindBy(xpath = "//input[@value='Log In']")
    WebElement loginBtn;
    @FindBy(xpath="//a[text()='Register']")
    WebElement RegisterBtn;
    @FindBy(xpath="//img[@title='ParaBank']")
    WebElement logo;
    @FindBy(xpath="//a[text()='Forgot login info?']")
    WebElement forgotLoginInfoButton;



    //initializing page objects
    public LoginPage(){
        PageFactory.initElements(driver,this);
    }
    //methods or actions
    public String validatePageTitle(){
        return driver.getTitle();
    }
    public boolean validatePageLogo(){
      return  logo.isDisplayed();
    }
    public HomePage login(String un, String pwd){
        username.sendKeys(un);
        password.sendKeys(pwd);
        loginBtn.click();

        return new HomePage();
    }

    public LoginInfoPage verifyLoginInfoLink(){
       if(forgotLoginInfoButton.isDisplayed()==true){
           forgotLoginInfoButton.click();
       }
       return new LoginInfoPage();
    }
    public void clickonResgisterlink(){
        RegisterBtn.click();

    }

}
