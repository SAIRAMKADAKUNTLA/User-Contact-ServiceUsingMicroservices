package com.bridgelabz.user_service.service;

import com.bridgelabz.user_service.entity.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements  UserService{

    List<User>list=List.of(
            new User(111L,"Sairam","Hyderabad"),
            new User(112L,"John","Mumbai"),
            new User(113L,"Jimmy","Kolkata"),
            new User(114L,"Jake","Chennai"));

    public User getById(Long userId){
        return list.stream().filter(user -> user.getUserId().equals(userId)).findAny().orElse(null);
    }

}
