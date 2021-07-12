package com.example.daoImpl;

import com.example.dao.NewDao;
import com.example.model.New;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import org.springframework.stereotype.Repository;


import java.util.ArrayList;
import java.util.List;

@Repository
public class NewDaoImpl implements NewDao {

    public static final  String GET_ALL = "select * from new";
    public static final String GET_LIST_NEW_BY_CAT = "select * from new where id_cat = ? ";
    public static final String GET_NEW_BY_ID = "select * from new where id = ?";
    public static final String GET_RECENTLY_POST = "SELECT * FROM new ORDER BY create_time desc LIMIT ? ";
    public static final String WATCH = "UPDATE `new` SET `count`= ? WHERE id = ?";
    public static final String GET_VIEW_CURRENTLY =  "SELECT count FROM `new` WHERE id = ?";


    @Autowired
    public JdbcTemplate _jdbcTemplate;


    @Override
    public boolean insert(New n){
        return false;
    };
    @Override
    public boolean delete(int id){
        return false;
    };

    @Override
    public boolean edit(New cat){
        return false;
    };

    @Override
    public List<New> getAll(){
        List<New> list = new ArrayList<New>();
        list = _jdbcTemplate.query(GET_ALL, new BeanPropertyRowMapper<>(New.class));
        return list;
    };
    @Override
    public List<New> getListNewByCat(int id){
        List<New> list = new ArrayList<New>();
        list = _jdbcTemplate.query(GET_LIST_NEW_BY_CAT, new BeanPropertyRowMapper<>(New.class) , new Object[] {id});
        return list;
    };

    @Override
    public New getNewById(int id){
        return  _jdbcTemplate.queryForObject(GET_NEW_BY_ID, new BeanPropertyRowMapper<>(New.class) , new Object[] {id});
    };
    @Override
    public List<New> getListRecently(int number){
        return  _jdbcTemplate.query(GET_RECENTLY_POST, new BeanPropertyRowMapper<>(New.class) , new Object[] {number});
    }

    @Override
    public void watch(int id) {
        int viewCurrent = getView(id);
        int viewUpdate = viewCurrent  +  1;
        _jdbcTemplate.update(WATCH, new Object[] {viewUpdate,id});
    }

    @Override
    public int getView(int id) {
        return _jdbcTemplate.queryForObject(GET_VIEW_CURRENTLY, new Object[] {id}, Integer.class);
    }

    ;

}
