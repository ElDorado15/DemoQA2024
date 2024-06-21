package com.demoqa.drivers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.safari.SafariOptions;

import java.time.Duration;

public class SafariWebDriver {
    public static WebDriver loadSafariDriver (){

        SafariOptions options = new SafariOptions();
        options.setCapability("safari.cleanSession", true);
        WebDriver driver = new SafariDriver(options);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.manage().window().maximize();
        return driver;

    }
}
