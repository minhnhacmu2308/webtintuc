package com.example.controllers.user;

import com.example.model.Notice;
import com.example.model.User;
import com.example.serviceImpl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RestController
public class UserController {

    @Autowired
    public UserServiceImpl userService;

    @PostMapping("/register")
    public Notice register(@RequestBody User user){
        boolean result = userService.insert(user);
        Notice notice = new Notice();
        if(result){
            notice.setSuccess(true);
            notice.setMessage("Register successfully");
            return notice;
        }else{
            notice.setSuccess(false);
            notice.setMessage("Username is exit!");
            return notice;
        }

    }

}
