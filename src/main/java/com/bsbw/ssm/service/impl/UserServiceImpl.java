package com.bsbw.ssm.service.impl;

import com.bsbw.ssm.dao.UserDao;
import com.bsbw.ssm.entity.User;
import com.bsbw.ssm.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public User findUserById(Integer id) {
        return userDao.selectByPrimaryKey(id);
    }
}
