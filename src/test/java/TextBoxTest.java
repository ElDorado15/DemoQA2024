import com.demoqa.entities.TextBoxEntity;
import org.testng.annotations.Test;

public class TextBoxTest extends BaseTest {


@Test
    public void textBoxTest() throws InterruptedException {
    driver.get("https://demoqa.com/text-box");
//    //textBoxPage.fillUpTextBoxForm("El Dorado", "eldorado@gmail.com", "Baker Street", "Manas Street");
//    TextBoxEntity textBoxEntity = new TextBoxEntity();
   ;
    TextBoxEntity textBoxEntity = randomUtils.generateRandomTextBoxEntity();
  textBoxPage.fillUpTextBoxForm(textBoxEntity);
  Thread.sleep(5000);
}
}
