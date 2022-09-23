package com.spicemoney.person_rest_api.repository;

import com.spicemoney.person_rest_api.entity.PersonData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepository extends JpaRepository<PersonData,Integer> {
}
