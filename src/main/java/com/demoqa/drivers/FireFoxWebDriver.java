package com.demoqa.drivers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class FireFoxWebDriver  {
    public static WebDriver loadFirefoxDriver(){
System.setProperty("webdriver.gecko.driver",
        "/Users/evaluck/IdeaProjects/DemoQAWinter24/src/main/resources/drivers/geckodriver");
WebDriver driver = new FirefoxDriver();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
driver.manage().window().maximize();
return driver;
    }
}
