package com.bridgelabz.contact_service.service;

import com.bridgelabz.contact_service.entity.Contact;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ContactServiceImpl implements  ContactService{


    List<Contact>list=List.of(
            new Contact(11L,"Kim","99999",111L),
            new Contact(12L,"David","88888",112L),
            new Contact(13L,"Bruno","77777",113L),
            new Contact(14L,"Mars","66666",114L));


    @Override
    public List<Contact> getContactsOfUser(Long userId) {
        return list.stream().filter(contact -> contact.getUserId().equals(userId)).collect(Collectors.toList());
    }
}
