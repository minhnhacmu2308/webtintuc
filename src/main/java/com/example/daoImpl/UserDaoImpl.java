package com.example.daoImpl;

import com.example.dao.UserDao;


import com.example.model.User;
import org.springframework.beans.factory.annotation.Autowired;



import org.springframework.jdbc.core.JdbcTemplate;

import org.springframework.stereotype.Repository;


import java.math.BigInteger;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.List;

@Repository
public class UserDaoImpl implements UserDao {
    public static final String REGISTER = "INSERT INTO `user`(`username`, `password`, `email`) VALUES (?,?,?)";
    public static final String CHECKEXIT = "SELECT count(*) FROM user where username = ? ";


    @Autowired
    public JdbcTemplate _jdbcTemplate;

    @Override
    public boolean delete(int id){
        return false;
    };

    @Override
    public boolean edit(User cat){
        return false;
    };

    @Override
    public List<User> getAll(){
        return null;
    };
    @Override
    public  String md5(String password){
        String result = "";
        MessageDigest digest;
        try {
            digest = MessageDigest.getInstance("MD5");
            digest.update(password.getBytes());
            BigInteger bigInteger = new BigInteger(1,digest.digest());
            result = bigInteger.toString(16);
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        return result;
    };
    @Override
    public boolean checkAccountExit(String username){

        int result = _jdbcTemplate.queryForObject(CHECKEXIT, new Object[] {username},Integer.class);
        if (result == 1){
            return true;
        }
        return false;
    };
    @Override
    public boolean insert(User user){

        boolean checkExit = checkAccountExit(user.getUsername());

        if(checkExit == true){
            return false;
        }else{
            String passwordMd5 = md5(user.getPassword());
            int result = _jdbcTemplate.update(REGISTER, user.getUsername(),passwordMd5,user.getEmail());
            if(result == 1){
                return true;
            }
        }
        return false;
    };
}
