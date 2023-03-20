package com.njs.scootyrental.database;

import com.njs.scootyrental.exceptions.InvalidUserException;
import com.njs.scootyrental.model.User;

import java.util.List;

public class UserManager {
    private List<User> userRepo;
    public void createUser(User user) throws InvalidUserException {
        if(user.checkforValidUser())
        {
            userRepo.add(user);
            System.out.println("User Created Succesfully");
        }

    }


}
