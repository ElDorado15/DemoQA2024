package com.demoqa.entities;
import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@ToString
@EqualsAndHashCode
@NoArgsConstructor
public class PracticeFormEntity {
    private String firstName;
    private String lastName;
    private String email;
    private String mobileNumber;
    private String subject;
    private String currentAdress;
    private String state;
    private String city;
    private String dateOfBirthInput;



}
