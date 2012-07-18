package com.reverside.springtest.service;

import com.reverside.springtest.dto.AddUserParameters;
import com.reverside.springtest.model.User;

import java.util.ArrayList;
import java.util.List;

public class AddUserDataProvider {

    public List<User> addUser(AddUserParameters parameters){
        List<User> users=new ArrayList<User>();
        User user1=new User();
        user1.setUserFirstName(parameters.getUserFirstName());
        user1.setUserFirstName(parameters.getUserLastName());
        user1.setUserAge(parameters.getUserAge());
        user1.setUserPhone(parameters.getUserPhone());
        user1.setUserMailId(parameters.getUserMailId());

        users.add(user1);
        User user2=new User();
        user2.setUserFirstName("Amar");
        user2.setUserFirstName("Barik");
        user2.setUserAge(19);
        user2.setUserPhone(87834634);
        user2.setUserMailId("amar@test.com");
        users.add(user2);

        return users;

    }
}
