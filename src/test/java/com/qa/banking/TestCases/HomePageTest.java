package com.qa.banking.TestCases;

import com.qa.banking.Base.TestBase;
import com.qa.banking.Pages.HomePage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HomePageTest extends TestBase {

    HomePage homepage;
     public HomePageTest() {
         super();
     }
     @BeforeMethod
     public void setup(){
         initialization();
         homepage = new HomePage();
     }
     @Test(priority = 1)
    public void verifyAccountsOverview(){
         homepage.verifyAccountsOverviewPage();
     }


}
