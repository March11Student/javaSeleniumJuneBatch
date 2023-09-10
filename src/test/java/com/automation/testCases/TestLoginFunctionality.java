package com.automation.testCases;

import com.automation.pages.LoginPage;
import com.automation.pages.TestBaseClass;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class TestLoginFunctionality extends TestBaseClass {

    @Test
    public void validatePageTitle(){
        LoginPage loginPage=new LoginPage(driver);
        loginPage.validateTitle();

    }


}
