package com.example.serviceImpl;

import com.example.dao.CategoryDao;
import com.example.daoImpl.CategoryDaoImpl;
import com.example.model.Category;
import com.example.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    CategoryDao categoryDao ;

    @Override
    public boolean insert(Category cat){
        return false;
    };

    @Override
    public boolean delete(int id){
        return false;
    };

    @Override
    public boolean edit(Category cat){
        return false;
    };

    @Override
    public List<Category> getAll(){
        return categoryDao.getAll();
    };
}
