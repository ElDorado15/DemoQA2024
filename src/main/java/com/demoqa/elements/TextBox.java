package com.demoqa.elements;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.time.Duration;

public class TextBox {
    WebDriver driver;

    @BeforeTest(description = "open google and driver")
    void textBoxTest() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/evaluck/IdeaProjects/DemoQAWinter24/src/main/resources/drivers/chromedriver");
        ChromeOptions options = new ChromeOptions();
        options.setBinary("//Applications/Google Chrome.app/Contents/MacOS/Google Chrome");
        options.addArguments("--no-sandbox");
        options.addArguments("--disable-dev-shm-usage");
        options.addArguments("--remote-allow-origins=*");

        driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(120));
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/text-box");
    }

String name;
    String email;

   String curadd;
   String peradd;
    String ntc ;
    String etc;
    String catc ;
    String patc ;
  @Test
    void fillElements() throws InterruptedException {



        WebElement fN = driver.findElement(By.id("userName"));
        fN.sendKeys("El dorado");
        name = fN.getText();


        WebElement ea = driver.findElement(By.id("userEmail"));
        ea.sendKeys("elddorado15@gmail.com");
        email = ea.getText();

        WebElement ca = driver.findElement(By.id("currentAddress"));
        ca.sendKeys("Mossovet");
        curadd = ca.getText();

        WebElement pa = driver.findElement(By.id("permanentAddress"));
        pa.sendKeys("Gold square");
        peradd = pa.getText();

        WebElement sb = driver.findElement(By.xpath("//div[@class='text-right col-md-2 col-sm-12']"));
        sb.click();

        Thread.sleep(20000);


       WebElement nameToCompare = driver.findElement(By.xpath("//*[@id='name']"));
        System.out.println(nameToCompare.getText());
        ntc = nameToCompare.getText();



       WebElement emailToCompare = driver.findElement(By.xpath("//div[@class='border col-md-12 col-sm-12']/*[position()=2]"));
        System.out.println(emailToCompare.getText());
        etc = emailToCompare.getText();


        WebElement curaddToCompare = driver.findElement(By.xpath("//div[@class='border col-md-12 col-sm-12']/*[position()=3]"));
        System.out.println(curaddToCompare.getText());
        catc = curaddToCompare.getText();


        WebElement peraddToCompare = driver.findElement(By.xpath("//div[@class='border col-md-12 col-sm-12']/*[position()=4]"));
        System.out.println(peraddToCompare.getText());
        patc = peraddToCompare.getText();




    }
   @Test
    void testName (){
       Assert.assertEquals(name, ntc);
       Assert.assertEquals(email, etc );
       Assert.assertEquals(name, catc);
       Assert.assertEquals(name, patc);
    }

    @AfterTest
    void closeDriver() {
        driver.close();
        driver.quit();
    }




}

