package com.demoqa.drivers;

import com.demoqa.utils.ConfigReader;
import org.openqa.selenium.WebDriver;

public class DriverManager {
    private static WebDriver driver;

    public static WebDriver getDriver(){
        if (driver==null){
            switch (ConfigReader.getValue("browser").toLowerCase()){
                case "chrome":
                    driver = ChromeWebDriver.loadChromeDriver();
                    break;
                case "safari":
                    driver=SafariWebDriver.loadSafariDriver();
                    break;
                case "firefox":
                    driver = FireFoxWebDriver.loadFirefoxDriver();


                default:
                    throw new IllegalArgumentException("Wrong Driver name");
            }
        }
        return driver;
    }
    public static void closeDriver (){
        try{
            if (driver != null){
                driver.close();
                driver.quit();
                driver = null; // используется для запуска последующего теста (для повтора действий)
            }
        } catch (Exception e){
          System.err.println("error while closing driver");
        }
    }
}
