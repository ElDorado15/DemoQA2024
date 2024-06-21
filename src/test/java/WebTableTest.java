import com.demoqa.entities.Employee;
import org.testng.annotations.Test;

import java.util.List;

public class WebTableTest extends BaseTest {

    @Test(description = "Web Table Test")
    public void test123(){
  driver.get("https://demoqa.com/webtables");
        Employee employee = randomUtils.generateMockEmployee();
        webTablesPage.addNewEmployees(randomUtils.generateMockEmployee());
        webTablesPage.addNewEmployees(randomUtils.generateMockEmployee());
        webTablesPage.addNewEmployees(randomUtils.generateMockEmployee());

        List<Employee> employees = webTablesPage.getEmployeesFromTable();

        for (Employee employee1 : employees){
            System.out.println(employee1);
        }
    }

}
