import com.demoqa.enums.Endpoints;
import com.demoqa.pages.AlertPage;
import com.demoqa.pages.BasePage;
import com.demoqa.utils.ConfigReader;
import org.testng.annotations.Test;

public class AlertTest extends BaseTest {

    @Test
    public void testAlert() throws InterruptedException {
      // driver.get("https://demoqa.com/alerts");
        browserHelper.open(ConfigReader.getValue("baseURL")+ Endpoints.ALERT.getEndpoint());
        webElementAction.click(alertPage.confirmAlertBtn);
        webElementAction.pause(4);
        alertHelper.acceptAlert();
        webElementAction.pause(4);
    }

}
