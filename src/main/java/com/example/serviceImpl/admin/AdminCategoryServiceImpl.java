package com.example.serviceImpl.admin;

import com.example.daoImpl.admin.AdminCategoryDaoImpl;
import com.example.model.Category;
import com.example.service.admin.AdminCategoryService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdminCategoryServiceImpl implements AdminCategoryService {

    @Autowired
    public AdminCategoryDaoImpl adminCategoryDao;

    @Override
    public boolean insert(Category cat) {
        return adminCategoryDao.insert(cat);
    }

    @Override
    public boolean delete(int id) {
        return adminCategoryDao.delete(id);
    }

    @Override
    public boolean edit(Category cat) {
        return adminCategoryDao.edit(cat);
    }

    @Override
    public List<Category> getAll() {
        return adminCategoryDao.getAll();
    }
}
