package com.gqb.mybatissoucecode.service.impl;

import com.gqb.mybatissoucecode.dao.UserMapper;
import com.gqb.mybatissoucecode.entity.User;
import com.gqb.mybatissoucecode.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserServiceImpl implements UserService {

    @Resource
    private UserMapper userMapper;
    @Override
    public User selectUser(String id) {
        /*return userMapper.select(Integer.parseInt(id));*/
        return null;
    }
}
