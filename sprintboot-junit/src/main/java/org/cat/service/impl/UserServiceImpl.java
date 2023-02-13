package org.cat.service.impl;

import org.cat.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Override
    public void addUser() {
        System.out.println("add user success!");
    }
}
