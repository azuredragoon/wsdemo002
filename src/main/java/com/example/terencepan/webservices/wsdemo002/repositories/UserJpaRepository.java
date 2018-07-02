package com.example.terencepan.webservices.wsdemo002.repositories;

import com.example.terencepan.webservices.wsdemo002.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserJpaRepository extends JpaRepository<User, Long> {


    User findByFirstName(String firstName);

    User findByLastName(String firstName);


    User findById(String partyId);

    User findByPartyCode(String partyCode);
}
