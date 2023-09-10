package com.automation.pages;
//syntax- package <package name>

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.Color;

public class LoginPage extends PageBase{
   //syntax of class - public class <class name>
    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public void validateTitle(){
        String title=driver.getTitle();
        //validate the title

        if(title.contentEquals("OrangeHRM")){
            System.out.println("title Match");
        }else{
            System.out.println("Title Does Not match");
        }
    }

    public static void main(String[] args) {
        System.out.println(System.getProperty("user.dir"));
    }
}
