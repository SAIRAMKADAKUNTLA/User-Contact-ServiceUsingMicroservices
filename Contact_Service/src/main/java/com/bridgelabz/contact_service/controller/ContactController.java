package com.bridgelabz.contact_service.controller;

import com.bridgelabz.contact_service.entity.Contact;
import com.bridgelabz.contact_service.service.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
@RequestMapping("contact")
public class ContactController {

    @Autowired
    private ContactService contactService;


    @GetMapping("/user/{userId}")
    public List<Contact> getContacts(@PathVariable("userId") Long userId){
        return contactService.getContactsOfUser(userId);
    }
}
