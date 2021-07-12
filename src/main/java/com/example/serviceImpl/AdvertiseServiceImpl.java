package com.example.serviceImpl;

import com.example.daoImpl.AdvertiseDaoImpl;
import com.example.model.Advertise;
import com.example.service.AdvertiseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdvertiseServiceImpl implements AdvertiseService {

    @Autowired
    public AdvertiseDaoImpl advertiseDao;

    @Override
    public List<Advertise> getAll() {
        return advertiseDao.getAll();
    }
}
