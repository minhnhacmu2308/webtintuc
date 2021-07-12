package com.example.controllers.user;


import com.example.model.Comment;
import com.example.model.Notice;
import com.example.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RestController
public class CommentController {

    @Autowired
    public CommentService commentService;

    @Autowired
    public Notice notice;

    @PostMapping ("post-comment")
    public Notice postComment(@RequestBody Comment comment){
        boolean result = commentService.comment(comment);

        if(result){
            notice.setSuccess(true);
            notice.setMessage("Commnet successfully");
            return notice;
        }else{
            notice.setSuccess(false);
            notice.setMessage("Commnet failed");
            return notice;
        }
    }
}
