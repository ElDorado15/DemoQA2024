package com.demoqa.drivers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

import static com.demoqa.utils.ConfigReader.getValue;

public class ChromeWebDriver {
    public static WebDriver loadChromeDriver (){
        System.setProperty("webdriver.chrome.driver", "/Users/evaluck/IdeaProjects/DemoQAWinter24/src/main/resources/drivers/chromedriver");
        ChromeOptions options = new ChromeOptions();
        options.setBinary("//Applications/Google Chrome.app/Contents/MacOS/Google Chrome");
        options.addArguments("--no-sandbox");
        options.addArguments("--disable-dev-shm-usage");
        options.addArguments("--remote-allow-origins=*");
        if (Boolean.parseBoolean(getValue("headless"))){
            options.addArguments("--headless");
        }


        WebDriver driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.manage().window().maximize();
        return driver;

    }
}