package com.lzh.service;

import com.lzh.dao.UserDao;
import com.lzh.model.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;


    @Override
    public Page<User> test() {
        User u = new User();
        u.setName("2");
        Page<User> xx = userDao.findByAuto(u, PageRequest.of(0,10));
        return xx;
    }




}
