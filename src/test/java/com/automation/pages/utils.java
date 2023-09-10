package com.automation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.Color;

public class utils extends PageBase{

    public utils(WebDriver driver) {
        super(driver);
    }

    public void getWebElementColor(){
        String path="abcxyz";
        WebElement element=driver.findElement(By.xpath(path));
        String colorString=element.getCssValue("color");
        String colorHexa= Color.fromString(colorString).asHex();
    }
    public void getBackGroundColor(){
        String path="abcxyz";
        WebElement element=driver.findElement(By.xpath(path));
        String colorString=element.getCssValue("background-color");
        String colorHexa= Color.fromString(colorString).asHex();
    }

    public void getFontSize(){
        String path="abcxyz";
        WebElement element=driver.findElement(By.xpath(path));
        String text=element.getCssValue("font-size");
    }

    public void getInnerText(){
        String path="abcxyz";
        WebElement element=driver.findElement(By.xpath(path));
        String text=element.getText();
    }

    public void getAttributeValue(){
        String path="abcxyz";
        String attribute="name";
        WebElement element=driver.findElement(By.xpath(path));
        String attributeAsString=element.getAttribute(attribute);
    }
}
