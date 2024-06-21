package com.demoqa.helper;

import com.demoqa.drivers.DriverManager;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;

import javax.swing.*;
import java.time.Duration;
import java.util.Random;
import java.util.concurrent.TimeUnit;

public class WebElementAction {

   public Actions actions = new Actions(DriverManager.getDriver());



    public WebElementAction click(WebElement element){
       // waitElementClickAble(element);
        scrollToElement(element);
        element.click();
        return this;
    }

    public WebElementAction sendKeys (WebElement element, String txt){
        waitElementToBeVisible(element);
        scrollToElement(element);
        element.sendKeys(txt);
        return this;
    }
    public WebElementAction sendKeysWithEnter(WebElement element, String txt){
waitElementToBeVisible(element);
element.sendKeys(txt);
element.sendKeys(Keys.ENTER);
return this;
    }
    public WebElementAction waitElementClickAble(WebElement element){
        new WebDriverWait(DriverManager.getDriver(), Duration.ofSeconds(15)).
                until(ExpectedConditions.elementToBeClickable(element));
        return this;
    }

    public WebElementAction waitElementToBeVisible(WebElement element){
        new WebDriverWait(DriverManager.getDriver(), Duration.ofSeconds(15))
                .until(ExpectedConditions.visibilityOf(element));
        return this;
    }

    public WebElementAction scrollToElement(WebElement element){
        JavascriptExecutor js = (JavascriptExecutor) DriverManager.getDriver();
        js.executeScript("arguments[0].scrollIntoView(true);",element);
        return this;
    }

    public WebElementAction jsClick (WebElement element){
        JavascriptExecutor js = (JavascriptExecutor) DriverManager.getDriver();
js.executeScript("argument[0].click()",element);
return this;
    }

    public WebElementAction highLightElement(WebElement element){
        JavascriptExecutor js = (JavascriptExecutor) DriverManager.getDriver();
js.executeScript("arguments[0].style.border='3px solid red'", element);
return this;
    }

    public WebElementAction jsSendKeys (WebElement element, String txt){
        JavascriptExecutor js = (JavascriptExecutor) DriverManager.getDriver();
js.executeScript("arguments[0].value='" + txt + "';", element);
return this;
    }

    public WebElementAction doubleClick (WebElement element){
        waitElementToBeVisible(element);
        waitElementClickAble(element);
        actions.doubleClick(element).perform();
        return this;
    }

    public WebElementAction rightClick(WebElement element){
        waitElementToBeVisible(element);
        waitElementClickAble(element);
        actions.contextClick(element).perform();
        return this;

    }

    public WebElementAction moveToElement (WebElement element){
        waitElementToBeVisible(element);
        actions.moveToElement(element).perform();
        return this;
    }

    public void pause (Integer seconds){
        try{
            TimeUnit.SECONDS.sleep(seconds);
        } catch (InterruptedException e){
            e.printStackTrace();
        }
    }

    }
