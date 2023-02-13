package org.cat.springbootmybatis.service.impl;

import org.cat.springbootmybatis.domain.entity.User;
import org.cat.springbootmybatis.mapper.UserMapper;
import org.cat.springbootmybatis.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author cat
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper mapper;

    @Override
    public List<User> list() {
        return mapper.list();
    }

    @Override
    public List<User> list(String name) {
        return mapper.list(name);
    }
}
