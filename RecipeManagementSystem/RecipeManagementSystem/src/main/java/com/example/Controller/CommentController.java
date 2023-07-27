package com.example.Controller;

import com.example.Entity.Comment;
import com.example.Service.AuthenticationTokenService;
import com.example.Service.CommentService;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Validated
public class CommentController {
    @Autowired
    CommentService commentService;

    @Autowired
    AuthenticationTokenService authenticationTokenService;

    @PostMapping("comment")
    public String addComment(@RequestBody @Valid Comment comment){
        return commentService.addComment(comment);
    }






}
