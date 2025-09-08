package com.example.aryan.lab1.entity;
public class Post {
    private long id;
    private String title;
    private String content;

    public Post() {
    }

    public Post(long id, String title, String content) {
        this.id=id;
        this.title = title;
        this.content = content;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}





