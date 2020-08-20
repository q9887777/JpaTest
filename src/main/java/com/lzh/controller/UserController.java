package com.lzh.controller;

import com.lzh.model.User;
import com.lzh.myAssert.exception.BaseException;
import com.lzh.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/test")
    @ResponseBody
    public String test() throws BaseException {
        try {
            String xx = userService.test("22");
        } catch (BaseException e){
            System.out.println(e.getiResponseEnum().getCode() + "---msg：" + e.getMessage());
            System.out.println(e.toString());
        }
        return "2";
    }

}
