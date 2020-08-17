package com.lzh.dao;

import com.lzh.basedao.support.MyRepository;
import com.lzh.model.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDao extends MyRepository<User, String> {
}
