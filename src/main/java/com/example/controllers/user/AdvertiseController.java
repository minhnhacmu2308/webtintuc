package com.example.controllers.user;

import com.example.model.Advertise;
import com.example.service.AdvertiseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Controller
@RestController
public class AdvertiseController {

    @Autowired
    public AdvertiseService advertiseService;

    @GetMapping("get-advertising")
    public List<Advertise> getAll(){
        List<Advertise> list = advertiseService.getAll();
        return list;
    }
}
