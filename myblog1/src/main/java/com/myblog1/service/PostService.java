package com.myblog1.service;

import com.myblog1.payload.PostDto;
import com.myblog1.payload.PostResponse;

import java.util.List;

public interface PostService {

    PostDto savePost(PostDto postDto);

    void deletePost(long id);

    PostDto updatePost(long id, PostDto postDto);

    PostDto getPostById(long id);

    PostResponse getPosts(int pageNo, int pageSize, String sortBy, String sortDir);


}
