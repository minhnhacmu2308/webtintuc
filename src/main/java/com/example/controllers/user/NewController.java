package com.example.controllers.user;


import com.example.model.New;
import com.example.service.NewService;
import com.example.serviceImpl.NewServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Controller
@RestController
public class NewController {

    @Autowired
    public NewServiceImpl serviceNew;

    @GetMapping("get-list-new")
    public List<New> getAll(){
        List<New> list = serviceNew.getAll();
        return list;
    }

    @GetMapping("get-list-new-by-id/{id}")
    public List<New> getNewByCat(@PathVariable int id){
        List<New> list = serviceNew.getListNewByCat(id);
        return list;
    }

    @GetMapping("get-detail-new-by-id/{id}")
    public New getDetailNewById(@PathVariable int id){
        serviceNew.watch(id);
        New n = serviceNew.getNewById(id);
        return n;
    }

    @GetMapping("get-list-recently")
    public List<New> getListRecently(){
        List<New> list = serviceNew.getListRecently(3);
        return list;
    }
}
