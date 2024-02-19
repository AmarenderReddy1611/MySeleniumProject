package com.qa.banking.Pages;

import com.qa.banking.Base.TestBase;
import org.openqa.selenium.support.PageFactory;

public class OpenNewAccountPage extends TestBase {
    public OpenNewAccountPage(){
        PageFactory.initElements(driver,this);
    }
}
