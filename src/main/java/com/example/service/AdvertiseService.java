package com.example.service;

import com.example.model.Advertise;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface AdvertiseService {
    public List<Advertise> getAll();
}
