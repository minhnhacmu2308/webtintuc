package com.example.service.admin;

import com.example.model.Category;

import java.util.List;

public interface AdminCategoryService {

    public boolean insert(Category cat);

    public boolean delete(int id);

    public boolean edit(Category cat);

    public List<Category> getAll();
}
