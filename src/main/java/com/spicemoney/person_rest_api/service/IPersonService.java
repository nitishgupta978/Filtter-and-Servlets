package com.spicemoney.person_rest_api.service;

import com.spicemoney.person_rest_api.dto.PersonDataDto;
import com.spicemoney.person_rest_api.entity.PersonData;

import java.util.List;

public interface IPersonService {
    List<PersonData>getPersonDataAll();
//    PersonData getPersonDataById(int employeeId);
PersonData createPersonData(PersonDataDto personDataDto);
}
