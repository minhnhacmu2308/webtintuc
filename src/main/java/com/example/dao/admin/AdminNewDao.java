package com.example.dao.admin;

import com.example.model.New;

import java.util.List;

public interface AdminNewDao {

    public boolean insert(New n);

    public boolean delete(int id);

    public boolean edit(New cat);

    public List<New> getAll();

}
