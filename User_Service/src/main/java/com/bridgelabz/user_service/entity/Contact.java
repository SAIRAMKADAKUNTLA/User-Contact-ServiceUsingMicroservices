package com.bridgelabz.user_service.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Contact {

    private Long contactId;
    private String contactName;
    private String phoneNumber;
    private Long userId;
}
