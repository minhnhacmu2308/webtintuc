package com.example.service;

import com.example.model.Category;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface CategoryService {

    public boolean insert(Category cat);

    public boolean delete(int id);

    public boolean edit(Category cat);

    public List<Category> getAll();
}
