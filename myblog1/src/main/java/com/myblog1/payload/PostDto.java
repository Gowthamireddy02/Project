package com.myblog1.payload;

import lombok.Data;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;


public class PostDto {
    private long id;
    @NotEmpty
    @Size(min=2, message="post title should be at least 2 characters")
    private String title;
    @NotEmpty
    @Size(min=4, message="post description should be at least 4 characters")
    private String description;
    @NotEmpty
    @Size(min=5, message="post content should be at least 5 characters")
    private String content;

    public long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public String getContent() {
        return content;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setContent(String content) {
        this.content = content;
    }

}
