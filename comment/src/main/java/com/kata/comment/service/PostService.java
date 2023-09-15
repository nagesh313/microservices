package com.kata.comment.service;

import com.kata.comment.entity.Post;
import com.kata.comment.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostService {
    private final PostRepository postRepository;

    @Autowired
    public PostService(PostRepository postRepository) {
        this.postRepository = postRepository;
    }

    
    public Post createPost(Post post) {
        return null;
    }

    
    public List<Post> getAllPosts() {
        return null;
    }

    
    public Post getPostById(Long postId) {
        return null;
    }

    
    public Post updatePost(Long postId, Post updatedPost) {
        return null;
    }

    
    public void deletePost(Long postId) {

    }

    // Implement the methods for PostService
}
