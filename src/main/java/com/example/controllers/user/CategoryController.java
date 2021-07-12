package com.example.controllers.user;

import com.example.model.Category;
import com.example.serviceImpl.CategoryServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Controller
@RestController

public class CategoryController {
    @Autowired
    public CategoryServiceImpl categoryService;

    @GetMapping("/get-list-category")
    public List<Category> getListCategory(){
        List<Category> list = categoryService.getAll();
        return list;
    }
}
