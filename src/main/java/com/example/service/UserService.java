package com.example.service;

import com.example.model.User;

import java.util.List;

public interface UserService {

    public boolean insert(User user);

    public boolean delete(int id);

    public boolean edit(User cat);

    public List<User> getAll();
}
