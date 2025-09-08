package com.example.aryan.lab1.services;
import org.springframework.stereotype.Service;
import com.example.aryan.lab1.entity.Post;

@Service
public class PostService {
    public Post getPost;

    public Post getPost(){
    return new Post(2, "nothing","dev");
    }
}



