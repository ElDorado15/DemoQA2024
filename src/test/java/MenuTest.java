import com.demoqa.enums.Endpoints;
import com.demoqa.utils.ConfigReader;
import org.testng.annotations.Test;

import static com.demoqa.enums.Endpoints.MENU;

public class MenuTest extends BaseTest{
    @Test(description = "Verify method move to element is working")
     public void moveToElementTest() throws InterruptedException {
        browserHelper.open(ConfigReader.getValue("baseURL")+ MENU.getEndpoint());
        webElementAction.moveToElement(menuPage.mainItem2);
        Thread.sleep(5000);

    }
}
