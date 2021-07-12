package com.example.dao;


import com.example.model.User;

import javax.swing.plaf.PanelUI;
import java.util.List;

public interface UserDao {

    public boolean insert(User user);

    public boolean delete(int id);

    public boolean edit(User cat);

    public List<User> getAll();

    public  String md5(String password);

    public boolean checkAccountExit(String username);



}
