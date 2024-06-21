package com.demoqa.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;
import java.util.stream.Collectors;

public class FoodList {
    WebDriver driver;

    @BeforeTest
    void webSite() {
        System.setProperty("webdriver.chrome.driver", "/Users/evaluck/IdeaProjects/DemoQAWinter24/src/main/resources/drivers/chromedriver");
        ChromeOptions options = new ChromeOptions();
        options.setBinary("//Applications/Google Chrome.app/Contents/MacOS/Google Chrome");
        options.addArguments("--no-sandbox");
        options.addArguments("--disable-dev-shm-usage");
        options.addArguments("--remote-allow-origins=*");

        driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(120));
        driver.manage().window().maximize();
        driver.get("https://dostavka312.kg/");


    }

    @Test
    void listFood() {
        WebElement restaurants = driver.findElement(By.xpath("//div[@class='col-md-6 col-sm-6 col-xs-6']/following-sibling::div[1]"));
        restaurants.click();

        List<WebElement> restList = driver.findElements(By.xpath("//div[@class='col-sm-6']"));
        restList.forEach(rest -> System.out.println(rest.getText() + "\n==================================="));


        restList.stream().filter(elem -> elem.getText().contains("Дияр")).findFirst()
                .ifPresent(elem -> {
                    WebElement clickbut = driver.findElement
                            (By.xpath("//a[@href='https://dostavka312.kg/garnirygpt/diyar']"));
                    clickbut.click();
                    List<WebElement> breakfast = driver.findElements(By.xpath("//*[@id=\"WWMainPage\"]/div[1]"));
                    breakfast.forEach(bf -> System.out.println("Завтраки: "+ bf.getText()+"\n====================="));

                    List<WebElement> salad = driver.findElements(By.xpath("//*[@id=\"WWMainPage\"]/div[2]"));
                    salad.forEach(sal -> System.out.println("Салаты: "+sal.getText()+"\n===================="));

                    List<WebElement> snacks = driver.findElements(By.xpath("//*[@id=\"WWMainPage\"]/div[3]"));
                    snacks.forEach(sn -> System.out.println("Закуски: "+ sn.getText()+"\n===================="));

                    List<WebElement> soups = driver.findElements(By.xpath("//*[@id=\"WWMainPage\"]/div[4]"));
                    soups.forEach(so -> System.out.println("Супы: "+ so.getText() + "\n============"));

                    List<WebElement> EuropeanCuisine = driver.findElements(By.xpath("//*[@id=\"WWMainPage\"]/div[5]"));
                    EuropeanCuisine.forEach(EC -> System.out.println("Европейская кухня: "+ EC.getText() + "\n============"));

                    List<WebElement> EasternCuisine = driver.findElements(By.xpath("//*[@id=\"WWMainPage\"]/div[6]"));
                    EasternCuisine.forEach(ec -> System.out.println("Восточная кухня: "+ ec.getText() + "\n============"));

                    List<WebElement> pastas = driver.findElements(By.xpath("//*[@id=\"WWMainPage\"]/div[7]"));
                    pastas.forEach(pa -> System.out.println("Пасты: "+ pa.getText() + "\n============"));

                    List<WebElement> pizzas = driver.findElements(By.xpath("//*[@id=\"WWMainPage\"]/div[8]"));
                    pizzas.forEach(pi -> System.out.println("Пицца: "+ pi.getText() + "\n============"));

                    List<WebElement> shashlik = driver.findElements(By.xpath("//*[@id=\"WWMainPage\"]/div[9]"));
                    shashlik.forEach(sh -> System.out.println("Шашлык: "+ sh.getText() + "\n============"));

                    List<WebElement> sidedishbreads = driver.findElements(By.xpath("//*[@id=\"WWMainPage\"]/div[10]"));
                    sidedishbreads.forEach(sb -> System.out.println("Гарниры/Хлеб: "+ sb.getText() + "\n============"));

                    List<WebElement> ChinesCuisine = driver.findElements(By.xpath("//*[@id=\"WWMainPage\"]/div[11]"));
                    ChinesCuisine.forEach(cc -> System.out.println("Китайская кухня: "+ cc.getText() + "\n============"));

                    List<WebElement> ChickenDishes = driver.findElements(By.xpath("//*[@id=\"WWMainPage\"]/div[12]"));
                    ChickenDishes.forEach(cd -> System.out.println("Курица: "+ cd.getText() + "\n============"));

                    List<WebElement> FishDishes = driver.findElements(By.xpath("//*[@id=\"WWMainPage\"]/div[13]"));
                    FishDishes.forEach(fd -> System.out.println("Рыба: "+ fd.getText() + "\n============"));

                    List<WebElement> deserts = driver.findElements(By.xpath("//*[@id=\"WWMainPage\"]/div[14]"));
                    deserts.forEach(de -> System.out.println("Десерты: "+ de.getText() + "\n============"));

                    List<WebElement> sauces = driver.findElements(By.xpath("//*[@id=\"WWMainPage\"]/div[15]"));
                    sauces.forEach(sa -> System.out.println("Соусы: "+ sa.getText() + "\n============"));

                    List<WebElement> drinks = driver.findElements(By.xpath("//*[@id=\"WWMainPage\"]/div[16]"));
                    drinks.forEach(dr -> System.out.println("Напитки: "+ dr.getText() + "\n============"));

                    List<WebElement> semifinished = driver.findElements(By.xpath("//*[@id=\"WWMainPage\"]/div[17]"));
                    semifinished.forEach(sf -> System.out.println("Полуфабрикаты: "+ sf.getText() + "\n============"));



                });
    }
}
