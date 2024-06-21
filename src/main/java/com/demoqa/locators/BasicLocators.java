package com.demoqa.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import java.time.Duration;

public class BasicLocators {
    @Test(description = "Find by ID")
    void findByIDTest() {
        System.setProperty("webdriver.chrome.driver", "/Users/evaluck/IdeaProjects/DemoQAWinter24/src/main/resources/drivers/chromedriver");
        ChromeOptions options = new ChromeOptions();
        options.setBinary("//Applications/Google Chrome.app/Contents/MacOS/Google Chrome");
        options.addArguments("--no-sandbox");
        options.addArguments("--disable-dev-shm-usage");
        options.addArguments("--remote-allow-origins=*");


        WebDriver driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.manage().window().maximize();

       // driver.get("https://demoqa.com/text-box");
       driver.get("https://demoqa.com/links");

//        WebElement fullNameInput = driver.findElement(By.id("userName"));
//        fullNameInput.sendKeys("Eldar Borubaev");
//        WebElement emailFillInput = driver.findElement(By.id("userEmail"));
//        emailFillInput.sendKeys("tomas123@gmail.com");

        /*
       можно вести поиск при помощи ID,
        className,
         links,
          tagName,
           xpath (дает полную ссылку: а. absolute -> пример: /html/body/div[number of div]/div/div и тд/input)
                                      b. поиск в рамках одного тега пример -> //textarea[для атрибутов (используется "@")]
         */
        WebElement linksInput = driver.findElement(By.partialLinkText("Home")); // -> для частичной ссылки
        //WebElement linksInput = driver.findElement(By.linkText("Home")); // -> для полной ссылки
        linksInput.click();
    }
}
