package com.spicemoney.person_rest_api.entity;

import com.spicemoney.person_rest_api.dto.PersonDataDto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@Table(name = "person_details")
@NoArgsConstructor
@AllArgsConstructor
public class PersonData {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "employeeId")
    private int employeeId;
    private String fullName;

    private String address;

    private String companyName;
    private double salary;
    public PersonData(PersonDataDto personDataDto){
        this.fullName=personDataDto.fullName;
        this.address=personDataDto.address;
        this.salary=personDataDto.salary;
        this.companyName=personDataDto.companyName;

    }


}
