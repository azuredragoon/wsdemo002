package com.example.terencepan.webservices.wsdemo002.controllers;

import com.example.terencepan.webservices.wsdemo002.entities.User;
import com.example.terencepan.webservices.wsdemo002.repositories.UserJpaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    public UserJpaRepository userJpaRepository;

    @GetMapping(value = "/all")
    public List<User> findAll(){
        return userJpaRepository.findAll();
    }

    @GetMapping(value = "/{firstName}")
    public User findByFirstName(@PathVariable final String firstName){
        return userJpaRepository.findByFirstName(firstName);
    }
    @GetMapping(value = "/{lastName}")
    public User findByLastName(@PathVariable final String lastName){
        return userJpaRepository.findByLastName(lastName);
    }
    @GetMapping(value = "/{partyId}")
    public User findByPartyCode(@PathVariable final String partyCode){
        return userJpaRepository.findByPartyCode(partyCode);
    }
    @GetMapping(value = "/{partyNumber}")
    public User findById(@PathVariable final String partyId){
        return userJpaRepository.findById(partyId);
    }

    @PostMapping(value = "/load")
    public User load(@RequestBody final User user){
        userJpaRepository.save(user);
        return userJpaRepository.findByPartyCode(user.getPartyCode());
    }
}
