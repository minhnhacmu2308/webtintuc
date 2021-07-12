package com.example.daoImpl;

import com.example.dao.CategoryDao;
import com.example.model.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@Repository
public class CategoryDaoImpl implements CategoryDao {

    public static final String GET_ALL = "select * from category";

    @Autowired
    public JdbcTemplate _jdbcTemplate;

    @Override
    public boolean insert(Category cat){
        return false;
    };

    @Override
    public boolean delete(int id){
        return false;
    };

    @Override
    public boolean edit(Category cat){
        return false;
    };

    @Override
    public List<Category> getAll(){
        List<Category> list = new ArrayList<Category>();
        list = _jdbcTemplate.query(GET_ALL, new BeanPropertyRowMapper<>(Category.class));
        return list;
    };
}
