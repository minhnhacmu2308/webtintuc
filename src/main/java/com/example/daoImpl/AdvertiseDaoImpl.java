package com.example.daoImpl;

import com.example.dao.AdvertiseDao;
import com.example.model.Advertise;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class AdvertiseDaoImpl implements AdvertiseDao {
    public static final String GET_ABVERTISE = "SELECT * FROM `advertising` ";

    @Autowired
    public JdbcTemplate _JdbcTemplate;

    @Override
    public List<Advertise> getAll() {

        List<Advertise> list = new ArrayList<>();
        list = _JdbcTemplate.query(GET_ABVERTISE, new BeanPropertyRowMapper<>(Advertise.class));

        return list;
    }
}
