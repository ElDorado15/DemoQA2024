import com.demoqa.drivers.DriverManager;
import com.demoqa.helper.AlertHelper;
import com.demoqa.helper.BrowserHelper;
import com.demoqa.helper.WebElementAction;
import com.demoqa.pages.*;
import com.demoqa.utils.RandomUtils;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;

public class BaseTest {
    protected WebDriver driver;
    protected TextBoxPage textBoxPage;
    protected RandomUtils randomUtils;
    protected AlertPage alertPage;
    protected WebElementAction webElementAction;
    protected AlertHelper alertHelper;
    protected BrowserHelper browserHelper;
    protected PracticeFormPage practiceFormPage;

    protected ButtonsPage buttonsPage;
    protected MenuPage menuPage;
    protected ProgressBarPage progressBarPage;
    protected WebTablesPage webTablesPage;

    @BeforeClass(alwaysRun = true)
    public void setUp() {
        driver = DriverManager.getDriver();
        textBoxPage = new TextBoxPage();
        randomUtils = new RandomUtils();
        alertPage = new AlertPage();
        webElementAction = new WebElementAction();
        alertHelper = new AlertHelper(driver);
        browserHelper = new BrowserHelper(driver);
        practiceFormPage = new PracticeFormPage();
        buttonsPage = new ButtonsPage();
        menuPage = new MenuPage();
        progressBarPage = new ProgressBarPage();
        webTablesPage = new WebTablesPage();


    }

    @AfterTest(alwaysRun = true)
    public void tearDown() {
        DriverManager.closeDriver();
    }

}
