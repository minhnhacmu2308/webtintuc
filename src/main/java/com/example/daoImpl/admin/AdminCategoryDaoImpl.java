package com.example.daoImpl.admin;

import com.example.dao.admin.AdminCategoryDao;
import com.example.model.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class AdminCategoryDaoImpl implements AdminCategoryDao {

    public static final String ADD_CATEGORY = "INSERT INTO `category`(`name`) VALUES (?)";
    public static final String DELETE_CATEGORY = "DELETE FROM `category` WHERE id = ?";
    public static final String EDIT_CATEGORY = "UPDATE `category` SET `name`= ? WHERE id = ?";
    public static final String GET_ALL = "select * from category";

    @Autowired
    public JdbcTemplate _jdbcTemplate;


    @Override
    public boolean insert(Category cat) {
        int result  = _jdbcTemplate.update(ADD_CATEGORY , cat.getName());
        if(result == 1){
            return true;
        }
        return false;
    }

    @Override
    public boolean delete(int id) {
        int result  = _jdbcTemplate.update(DELETE_CATEGORY , id);
        if(result == 1){
            return true;
        }
        return false;
    }

    @Override
    public boolean edit(Category cat) {
        int result  = _jdbcTemplate.update(EDIT_CATEGORY , cat.getName(),cat.getId());
        if(result == 1){
            return true;
        }
        return false;
    }

    @Override
    public List<Category> getAll() {
        List<Category> list = new ArrayList<Category>();
        list = _jdbcTemplate.query(GET_ALL, new BeanPropertyRowMapper<>(Category.class));
        return list;
    }
}
