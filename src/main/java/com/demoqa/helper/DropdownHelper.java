package com.demoqa.helper;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class DropdownHelper {
    WebDriver driver;

    public DropdownHelper(WebDriver driver){
        this.driver= driver;
    }

    public DropdownHelper selectByVisibleText(WebElement element, String value){
        Select select = new Select(element);
        return this;

    }
}
