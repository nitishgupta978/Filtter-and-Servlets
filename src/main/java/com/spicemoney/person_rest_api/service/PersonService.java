package com.spicemoney.person_rest_api.service;

import com.spicemoney.person_rest_api.dto.PersonDataDto;
import com.spicemoney.person_rest_api.entity.PersonData;
import com.spicemoney.person_rest_api.repository.PersonRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class PersonService implements IPersonService {
    @Autowired
    private PersonRepository personRepository;
    @Override
    public List<PersonData> getPersonDataAll() {
        return personRepository.findAll();
    }

//    @Override
//    public PersonData getPersonDataById(int employeeId) {
//        return personRepository.findById(employeeId).get();
//    }

    @Override
    public PersonData createPersonData(PersonDataDto personDataDto) {
        PersonData perData=null;
        perData=new PersonData(personDataDto);
        log.debug("Person Data"+perData.toString());
        return personRepository.save(perData);
    }
}
