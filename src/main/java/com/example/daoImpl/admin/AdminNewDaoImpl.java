package com.example.daoImpl.admin;

import com.example.dao.admin.AdminNewDao;
import com.example.model.New;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class AdminNewDaoImpl implements AdminNewDao {

    public static final String ADD_NEW = "INSERT INTO `new`(`title`, `desc`,`id_cat`, `image`, `count`) VALUES (?,?,?,?)";

    @Autowired
    public JdbcTemplate _jdbcTemplate;

    @Override
    public boolean insert(New n) {
        int result = _jdbcTemplate.update(ADD_NEW,n.getTitle(),n.getDesc(),n.getIdCat(),n.getImage());
        if(result == 1){
            return true;
        }
        return false;
    }

    @Override
    public boolean delete(int id) {
        return false;
    }

    @Override
    public boolean edit(New cat) {
        return false;
    }

    @Override
    public List<New> getAll() {
        return null;
    }
}
