import org.testng.Assert;
import org.testng.annotations.Test;

public class ButtonsTest extends BaseTest {
    @Test(description = "Verify double click button is working correctly")
    public void doubleClickTest() {
        browserHelper.open("https://demoqa.com/buttons");
        webElementAction.doubleClick(buttonsPage.doubleClickBtn);
        Assert.assertEquals(buttonsPage.doubleClickMessage.getText(), "You have done a double click");
    }

    @Test(description = "Verify right click button is working properly")
    public void rightClickTest() {
        browserHelper.open("https://demoqa.com/buttons");
        webElementAction.rightClick(buttonsPage.rightClickBtn);
        Assert.assertEquals(buttonsPage.rightClickMessage.getText(), "You have done a right click");
    }


}
