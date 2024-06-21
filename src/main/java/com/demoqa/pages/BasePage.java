package com.demoqa.pages;

import com.demoqa.drivers.DriverManager;
import com.demoqa.helper.DropdownHelper;
import com.demoqa.helper.WebElementAction;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage {
    public BasePage(){
        PageFactory.initElements(DriverManager.getDriver(), this);
    }

    WebElementAction webElementAction = new WebElementAction();
    DropdownHelper dropdownHelper = new DropdownHelper(DriverManager.getDriver());
}
