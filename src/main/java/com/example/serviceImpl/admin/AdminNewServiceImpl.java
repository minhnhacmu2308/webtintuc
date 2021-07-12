package com.example.serviceImpl.admin;

import com.example.daoImpl.admin.AdminNewDaoImpl;
import com.example.model.New;
import com.example.service.admin.AdminNewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdminNewServiceImpl implements AdminNewService {

    @Autowired
    public AdminNewDaoImpl adminNewDao;

    @Override
    public boolean insert(New n) {
        return adminNewDao.insert(n);
    }

    @Override
    public boolean delete(int id) {
        return false;
    }

    @Override
    public boolean edit(New cat) {
        return false;
    }

    @Override
    public List<New> getAll() {
        return null;
    }
}
