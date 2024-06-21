package com.demoqa.pages;

import com.demoqa.drivers.DriverManager;
import com.demoqa.entities.Employee;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WebTablesPage extends BasePage {

    @FindBy(id = "addNewRecordButton")
    public WebElement addNewBtn;
    @FindBy(id = "firstName")
    public WebElement firstNameInput;
    @FindBy(id = "lastName")
    public WebElement lastNameInput;
    @FindBy(id = "userEmail")
    public WebElement userEmailInput;
    @FindBy(id = "age")
    public WebElement ageInput;
    @FindBy(id = "salary")
    public WebElement salaryInput;
    @FindBy(id = "department")
    public WebElement departmentInput;
    @FindBy(id = "submit")
    public WebElement submitBtn;


    public WebTablesPage addNewEmployees(Employee employee) {
        webElementAction.click(addNewBtn)
                .sendKeys(firstNameInput, employee.getFirstName())
                .sendKeys(lastNameInput, employee.getLastName())
                .sendKeys(userEmailInput, employee.getEmail())
                .sendKeys(ageInput, String.valueOf(employee.getAge()))
                .sendKeys(salaryInput, String.valueOf(employee.getSalary()))
                .sendKeys(departmentInput, employee.getDepartment())
                .click(submitBtn);
        return this;

    }

    public ArrayList<Employee> getEmployeesFromTable() {
        List<WebElement> rows = DriverManager.getDriver().findElements(By.cssSelector(".ReactTable .rt-tr-group"));

        ArrayList<Employee> employees = new ArrayList<>();
        for (WebElement row : rows) {
            List<WebElement> cells = row.findElements(By.cssSelector(".rt-td"));
            String firstName = cells.get(0).getText();
            String lastName = cells.get(1).getText();
            String ageText = cells.get(2).getText().replaceAll("[^0-9]","");
            String email = cells.get(3).getText();
            String salaryText = cells.get(4).getText().replaceAll("[^0-9 ]","");
            String department = cells.get(5).getText();

            if (firstName.isEmpty() || lastName.isEmpty() || ageText.isEmpty() || email.isEmpty()
                    || salaryText.isEmpty() || department.isEmpty()) {
                continue;
            }
            int age = Integer.parseInt(ageText.trim());
            long salary = Long.parseLong(salaryText.trim());

            employees.add(new Employee(firstName, lastName, email, age, department, salary));

        }


        return employees;

    }
}
