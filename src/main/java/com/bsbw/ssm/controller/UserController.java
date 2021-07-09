package com.bsbw.ssm.controller;

import com.bsbw.ssm.entity.User;
import com.bsbw.ssm.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/getUser")
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("/test")
    public String getDataById(HttpServletRequest request){
        Integer id=1;
        User user = userService.findUserById(id);
        request.setAttribute("user",user);
        return "show";
    }

}
