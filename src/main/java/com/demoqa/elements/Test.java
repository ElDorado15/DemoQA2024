package com.demoqa.elements;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Test {

    @org.testng.annotations.Test
    void test() {
      //WebDriverManager.chromedriver().setup();
       System.setProperty("webdriver.chrome.driver", "/Users/evaluck/IdeaProjects/DemoQAWinter24/src/main/resources/drivers/chromedriver");
        ChromeOptions options = new ChromeOptions();
        options.setBinary("//Applications/Google Chrome.app/Contents/MacOS/Google Chrome");
        options.addArguments("--no-sandbox");
        options.addArguments("--disable-dev-shm-usage");
        options.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(options);
        driver.get("https://demoqa.com/text-box");

    }

    public static void main(String[] args) {
    }
}
