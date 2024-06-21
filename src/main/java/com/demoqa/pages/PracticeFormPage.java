package com.demoqa.pages;

import com.demoqa.drivers.DriverManager;
import com.demoqa.entities.PracticeFormEntity;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class PracticeFormPage extends BasePage {
    @FindBy(id = "firstName")
    public WebElement firstNameInput;
    @FindBy(id = "lastName")
    public WebElement lastNameInput;
    @FindBy(id = "userEmail")
    public WebElement emailInput;
    @FindBy(xpath = "//*[@id=\"genterWrapper\"]/div[2]/div[1]/label")
    public WebElement genderBtn;

    @FindBy(id = "userNumber")
    public WebElement numberInput;
    @FindBy(id = "subjectsInput")
    public WebElement subjectInput;
    @FindBy(xpath = "//*[@id=\"hobbiesWrapper\"]/div[2]/div[1]/label")
    public WebElement hobbiesBtn;
    @FindBy(id = "currentAddress")
    public WebElement currentAddressInput;
    @FindBy(id = "react-select-3-input")
    public WebElement stateInput;

    @FindBy(id = "react-select-4-input")
    public WebElement cityInput;

    @FindBy(id = "submit")
    public WebElement submitBtn;

    @FindBy(id = "dateOfBirthInput")
    public WebElement dateOfBirthInput;

    @FindBy(id = "dateOfBirth-label")
    public WebElement dateOfBirthText;


    public PracticeFormPage fillAllPage(PracticeFormEntity practiceFormEntity) {
        webElementAction.sendKeys(firstNameInput, practiceFormEntity.getFirstName())
                .sendKeys(lastNameInput, practiceFormEntity.getLastName())
                .sendKeys(emailInput, practiceFormEntity.getEmail())
                .click(genderBtn)
                .sendKeys(numberInput, practiceFormEntity.getMobileNumber())
                .click(dateOfBirthInput);

        selectDayMonthYear(practiceFormEntity.getDateOfBirthInput());

        webElementAction.click(dateOfBirthText)
                .sendKeysWithEnter(subjectInput, practiceFormEntity.getSubject())
                .click(hobbiesBtn)
                .sendKeys(currentAddressInput, practiceFormEntity.getCurrentAdress())
                .sendKeysWithEnter(stateInput, practiceFormEntity.getState())
                .sendKeysWithEnter(cityInput, practiceFormEntity.getCity())
                .click(submitBtn);
        return this;

    }

    public PracticeFormPage selectDayMonthYear(String dateMonthYear) {
        String[] dataMonthYearParts = dateMonthYear.split(" ");
        String data = dataMonthYearParts[0];
        String month = dataMonthYearParts[1];
        String year = dataMonthYearParts[2];

//        webElementAction.click(dateOfBirthInput);

        WebDriverWait wait = new WebDriverWait(DriverManager.getDriver(), Duration.ofSeconds(15));
        WebElement monthDropDown = wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("react-datepicker__month-select")));
        WebElement yearDropDown = wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("react-datepicker__year-select")));

        dropdownHelper.selectByVisibleText(monthDropDown, month)
                .selectByVisibleText(yearDropDown, year);

        WebElement day = wait.until(ExpectedConditions
                .visibilityOfElementLocated(
                        By.xpath
                                ("//div[contains(@class,'react-datepicker__day') and not (contains(@class, 'react-datepicker__day--outside-month')) and text()='" + data + "']"))


        );
        webElementAction.click(day);
        return this;
    }


}
