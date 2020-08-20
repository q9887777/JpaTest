package com.lzh.service;

import com.lzh.dao.UserDao;
import com.lzh.model.User;

import com.lzh.myAssert.exception.BaseException;
import com.lzh.myAssert.myEnum.ResponseEnum;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;


//    @Override
//    public Page<User> test() throws BaseException {
//        User u = null;
////        u.setName("2");
////        Page<User> xx = userDao.findByAuto(u, PageRequest.of(0,10));
//        ResponseEnum.BAD_NOT_NULL.assertNotNull(u);
//        return ;
//    }

    @Override
    public String test(String xx) throws BaseException {
        User u = null;
        ResponseEnum.BAD_NOT_NULL.assertNotNull(u);
        return "222";
    }


}
