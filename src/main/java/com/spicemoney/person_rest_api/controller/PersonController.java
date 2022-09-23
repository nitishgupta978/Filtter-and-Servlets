package com.spicemoney.person_rest_api.controller;

import com.spicemoney.person_rest_api.dto.PersonDataDto;
import com.spicemoney.person_rest_api.dto.ResponseDto;
import com.spicemoney.person_rest_api.entity.PersonData;
import com.spicemoney.person_rest_api.service.IPersonService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@Slf4j
@RequestMapping("spice")
public class PersonController {
    @Autowired
    private IPersonService service;
@GetMapping("/get")
    public ResponseEntity<ResponseDto>getPersonData(){
    List<PersonData> personDataList=null;
    personDataList=service.getPersonDataAll();
    ResponseDto responseDto = new ResponseDto("Get Call Successful ",personDataList);
    return new ResponseEntity<>(responseDto, HttpStatus.OK);
}
@PostMapping("/create")
    public ResponseEntity<ResponseDto>createPersonData(@Valid @RequestBody PersonDataDto personDataDto){
    log.debug("Person Dto ",personDataDto.toString());
    PersonData personData=null;
    personData=service.createPersonData(personDataDto);
    ResponseDto responseDto= new ResponseDto("Create Person Data Successfully !",personData);
    return new ResponseEntity<>(responseDto,HttpStatus.OK);

}
}
