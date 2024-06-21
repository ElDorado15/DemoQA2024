import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class BrowserHelperTest extends BaseTest {

    @Test
    public void test123() throws InterruptedException {
        driver.navigate().to("https://demoqa.com/browser-windows");
//        driver.findElement(By.xpath("//span[text()='Alerts']")).click();
//        Thread.sleep(2000);
//        browserHelper.goBack();
//        Thread.sleep(2000);
//        browserHelper.goForward();
//        Thread.sleep(2000);
//        browserHelper.refreshThePage();
        Thread.sleep(1000);
        driver.findElement(By.id("tabButton")).click();
        Thread.sleep(1000);
        browserHelper.switchToWindows(0);
        Thread.sleep(1000);
        driver.findElement(By.id("tabButton")).click();
        Thread.sleep(1000);
        browserHelper.switchToWindows(0);
        Thread.sleep(1000);
        driver.findElement(By.id("tabButton")).click();
        Thread.sleep(1000);
        browserHelper.switchToWindows(0);
        Thread.sleep(1000);
        driver.findElement(By.id("tabButton")).click();
        Thread.sleep(1000);
        browserHelper.switchToWindows(0);
        Thread.sleep(1000);
        driver.findElement(By.id("tabButton")).click();
        Thread.sleep(1000);
        browserHelper.switchToWindows(1);
        Thread.sleep(1000);

        browserHelper.switchToParentAndCloseChild();
        Thread.sleep(5000);


    }


}
