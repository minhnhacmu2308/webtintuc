package com.example.controllers.admin;


import com.example.model.Category;
import com.example.model.Notice;
import com.example.serviceImpl.admin.AdminCategoryServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


@Controller
@RestController
@RequestMapping("/admin")
public class AdminCategoryController {

    @Autowired
    public AdminCategoryServiceImpl adminCategoryService;

    @Autowired
    public Notice notice;

    @PostMapping("/add-category")
    public Notice adminAddCategory(@RequestBody Category cat){
        boolean result = adminCategoryService.insert(cat);
        if(result){
            notice.setSuccess(true);
            notice.setMessage("Add category successfully");
            return notice;
        }else{
            notice.setSuccess(false);
            notice.setMessage("Add category failed");
            return notice;
        }
    }
    @GetMapping("/delete-category/{id}")
    public  Notice adminDeleteCategory(@PathVariable int id){
        boolean result = adminCategoryService.delete(id);
        if(result){
            notice.setSuccess(true);
            notice.setMessage("Delete category successfully");
            return notice;
        }else{
            notice.setSuccess(false);
            notice.setMessage("Delete category failed");
            return notice;
        }
    }
    @PostMapping("/edit-category")
    public Notice adminEditCategory(@RequestBody Category cat){
        boolean result = adminCategoryService.edit(cat);
        if(result){
            notice.setSuccess(true);
            notice.setMessage("Edit category successfully");
            return notice;
        }else{
            notice.setSuccess(false);
            notice.setMessage("Eidt category failed");
            return notice;
        }
    }
}
