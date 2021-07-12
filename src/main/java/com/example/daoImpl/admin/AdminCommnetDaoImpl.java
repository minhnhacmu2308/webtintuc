package com.example.daoImpl.admin;

import com.example.dao.admin.AdminCommentDao;
import com.example.model.Comment;
import org.springframework.stereotype.Repository;

@Repository
public class AdminCommnetDaoImpl implements AdminCommentDao {
    @Override
    public boolean comment(Comment comment) {
        return false;
    }
}
