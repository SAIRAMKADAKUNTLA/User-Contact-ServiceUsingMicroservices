package com.bridgelabz.user_service.entity;


import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
public class User {
    private Long userId;
    private String name;
    private String city;

    public User(Long userId, String name, String city) {
        this.userId = userId;
        this.name = name;
        this.city = city;
    }

    List<Contact> contactList=new ArrayList<Contact>();
    public User(Long userId, String name, String city,List<Contact> contactList) {
        this.userId = userId;
        this.name = name;
        this.city = city;
        this.contactList=contactList;
    }
}
