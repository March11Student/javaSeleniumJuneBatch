package com.automation.pages;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;

public class TestBaseClass {
    public WebDriver driver;

    @BeforeSuite
    public void beforeSuite(){
        System.out.println("it is before suite");
    }

    @BeforeClass
    public void beforeClass(){
        System.out.println("it Is before class");
    }

    @BeforeMethod
    public void beforeMethod(){
        System.out.println("it is before method");
    }

    @AfterMethod
    public void afterMethod(){
        System.out.println("it is after method");
    }

    @AfterClass
    public void afterClass(){
        System.out.println("it is after class");
    }

    @AfterSuite
    public void afterSuite(){
        System.out.println("it is after suite");
    }
}
