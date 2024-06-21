import org.testng.annotations.Test;

public class ProgressBarTest extends BaseTest{
    @Test
    public void progressBarTest() throws InterruptedException {
        browserHelper.open("https://demoqa.com/progress-bar");
        webElementAction.click(progressBarPage.startStopButton);

        Thread.sleep(6000);
        webElementAction.click(progressBarPage.startStopButton);
        Thread.sleep(5000);

        System.out.println(progressBarPage.aria_valuenow.getAttribute("aria-valuenow"));


    }

}
