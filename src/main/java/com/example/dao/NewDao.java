package com.example.dao;

import com.example.model.New;

import java.util.List;

public interface NewDao {
    public boolean insert(New n);

    public boolean delete(int id);

    public boolean edit(New cat);

    public List<New> getAll();

    public List<New> getListNewByCat(int id);

    public New getNewById(int id);

    public List<New> getListRecently(int number);

    public void watch(int id);

    public int getView(int id);

}
