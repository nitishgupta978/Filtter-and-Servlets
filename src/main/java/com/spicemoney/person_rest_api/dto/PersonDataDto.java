package com.spicemoney.person_rest_api.dto;

import lombok.ToString;

import javax.validation.constraints.Min;
import javax.validation.constraints.Pattern;

@ToString
public class PersonDataDto {
    @Pattern(regexp = "^[A-Z]{1}[a-zA-Z\\s]{2,}$",message ="User name Invalid")
    public String fullName;
    @Pattern(regexp = "male|female",message = "Gender should be male or female")
    public String gender;
    @Pattern(regexp = "^[A-Z]{1}[0-9][a-zA-Z\\s]{2,}$",message ="Address name Invalid")
    public String address;
   @Pattern(regexp = "^[A-Z]{1}[a-zA-Z\\s]{2,}$",message ="Company name Invalid")
    public String companyName;
    @Min(value = 1000,message = "Minimum Salary should be more than 1000")
    public double salary;

}
