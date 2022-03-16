package com.bridgelabz.contact_service.service;

import com.bridgelabz.contact_service.entity.Contact;

import java.util.List;

public interface ContactService {
    public List<Contact> getContactsOfUser(Long contactId);
}
