package com.example.serviceImpl;

import com.example.dao.NewDao;
import com.example.daoImpl.NewDaoImpl;
import com.example.model.New;
import com.example.service.NewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NewServiceImpl implements NewService {

    @Autowired
    public NewDao daoNew;

    @Override
    public boolean insert(New n){
        return false;
    };

    @Override
    public boolean delete(int id){
        return false;
    };

    @Override
    public boolean edit(New cat){
        return false;
    };

    @Override
    public List<New> getAll(){
        return daoNew.getAll();
    };

    @Override
    public List<New> getListNewByCat(int id){
        return daoNew.getListNewByCat(id);
    };

    @Override
    public New getNewById(int id){
        return daoNew.getNewById(id);
    };

    @Override
    public List<New> getListRecently(int number){
        return daoNew.getListRecently(number);
    }

    @Override
    public void watch(int id) {
        daoNew.watch(id);
    }

    ;
}
