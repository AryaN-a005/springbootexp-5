package com.example.aryan.lab1.controller;
import com.example.aryan.lab1.entity.Post;
import com.example.aryan.lab1.services.PostService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PostController {
    public final PostService postService;

    public PostController(PostService postService) {
        this.postService = postService;
    }
    @GetMapping("/post")
    public Post getPost(){
        return postService.getPost();
    }


}
