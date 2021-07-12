package com.example.service.admin;

import com.example.model.New;

import java.util.List;

public interface AdminNewService {

    public boolean insert(New n);

    public boolean delete(int id);

    public boolean edit(New cat);

    public List<New> getAll();
}
