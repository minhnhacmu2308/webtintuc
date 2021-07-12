package com.example.serviceImpl;

import com.example.dao.UserDao;
import com.example.model.User;
import com.example.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    public UserDao userDao;

    @Override
    public boolean insert(User user){
        return userDao.insert(user);
    };
    @Override
    public boolean delete(int id){
        return false;
    };
    @Override
    public boolean edit(User cat){
        return false;
    };
    @Override
    public List<User> getAll(){
        return null;
    };
}
