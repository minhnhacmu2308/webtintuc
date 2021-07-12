package com.example.daoImpl;


import com.example.dao.CommentDao;
import com.example.model.Comment;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class CommentDaoImpl implements CommentDao {

    public static final String POST_COMMENT = "INSERT INTO `comment`( `user_id`, `post_id`, `comment`) VALUES (?,?,?)";

    @Autowired
    public JdbcTemplate _jdbcTemplate;

    @Override
    public boolean comment(Comment comment) {

        int result = _jdbcTemplate.update(POST_COMMENT, comment.getUserId(),comment.getNewId(),comment.getComment());
        if(result == 1){
            return true;
        }
        return false;
    }
}
