package com.kata.post.service;

import com.kata.post.entity.Post;
import com.kata.post.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PostService {
    private final PostRepository postRepository;

    @Autowired
    public PostService(PostRepository postRepository) {
        this.postRepository = postRepository;
    }


    public Post createPost(Post post) {
        return postRepository.save(post);
    }


    public List<Post> getAllPosts() {
        return postRepository.findAll();
    }


    public Optional<Post> getPostById(String postId) {
        return postRepository.findById(postId);
    }


    public Post updatePost(String postId, Post updatedPost) {
        updatedPost.setId(postId);
        return postRepository.save(updatedPost);
    }


    public void deletePost(String postId) {
        postRepository.deleteById(postId);
    }

}
