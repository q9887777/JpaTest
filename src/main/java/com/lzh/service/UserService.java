package com.lzh.service;

import com.lzh.model.User;
import com.lzh.myAssert.exception.BaseException;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

@Service
public interface UserService  {

//    public Page<User> test() throws BaseException;
    public String test(String xx) throws BaseException;
}
