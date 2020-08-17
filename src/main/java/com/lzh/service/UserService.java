package com.lzh.service;

import com.lzh.model.User;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

@Service
public interface UserService  {

    public Page<User> test();
}
