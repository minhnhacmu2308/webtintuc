package com.example.serviceImpl;

import com.example.dao.CommentDao;
import com.example.model.Comment;
import com.example.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CommentServiceImpl implements CommentService {

    @Autowired
    public CommentDao commentDao;

    @Override
    public boolean comment(Comment comment) {
        return commentDao.comment(comment);
    }
}
