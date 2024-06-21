package com.demoqa.utils;

import com.demoqa.entities.Employee;
import com.demoqa.entities.PracticeFormEntity;
import com.demoqa.entities.TextBoxEntity;
import com.github.javafaker.Faker;

public class RandomUtils {
 Faker faker = new Faker();

 public TextBoxEntity generateRandomTextBoxEntity(){
     TextBoxEntity textBoxEntity = new TextBoxEntity();
     textBoxEntity.setFullName(faker.name().fullName());
     textBoxEntity.setEmail(faker.internet().emailAddress());
     textBoxEntity.setCurrentAddress(faker.address().fullAddress());
     textBoxEntity.setPermanentAddress(faker.address().secondaryAddress());
     return textBoxEntity;
 }

 public PracticeFormEntity generateRandomTextForPracticeForm(){
     PracticeFormEntity practiceFormEntity = new PracticeFormEntity();
     practiceFormEntity.setFirstName((faker.name().firstName()));
     practiceFormEntity.setLastName(faker.name().lastName());
     practiceFormEntity.setEmail(faker.internet().emailAddress());
     practiceFormEntity.setMobileNumber(faker.number().digits(12));
     practiceFormEntity.setDateOfBirthInput("15 May 2001");
     practiceFormEntity.setSubject("Physics");
     practiceFormEntity.setCurrentAdress(faker.address().fullAddress());
     practiceFormEntity.setState("Uttar Pradesh");
     practiceFormEntity.setCity("Merrut");
     return practiceFormEntity;
 }

 public Employee generateMockEmployee(){

     Employee employee = new Employee();
     employee.setFirstName(faker.name().firstName());
     employee.setLastName(faker.name().lastName());
     employee.setEmail(faker.internet().emailAddress());
     employee.setAge(faker.number().numberBetween(18,100));
     employee.setSalary(faker.number().numberBetween(100000,1000000));
     employee.setDepartment(faker.job().position());
     return employee;
 }
}
