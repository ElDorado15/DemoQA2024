package com.demoqa.entities;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@EqualsAndHashCode
@Builder

public class Employee {

private String firstName;
private String lastName;
private String email;
private int age;
private String department;
private long salary;


}
