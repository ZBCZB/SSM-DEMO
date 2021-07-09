package com.bsbw.ssm.dao;

import com.bsbw.ssm.entity.User;

public interface UserDao {
    User selectByPrimaryKey(Integer id);
}
