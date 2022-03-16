package com.bridgelabz.user_service.controller;

import com.bridgelabz.user_service.entity.User;
import com.bridgelabz.user_service.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;
    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/{userId}")
    public User getById(@PathVariable("userId") Long userId){
       User user=userService.getById(userId);

       List contacts=restTemplate.getForObject("http://CONTACT-SERVICE/contact/user/"+user.getUserId(),List.class);
       user.setContactList(contacts);
       return user;

    }

}
