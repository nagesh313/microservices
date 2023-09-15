package com.kata.comment.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.kata.comment.repository.*;

@Service
public class LikeDislikeService {
    private final LikeDislikeRepository likeDislikeRepository;

    @Autowired
    public LikeDislikeService(LikeDislikeRepository likeDislikeRepository) {
        this.likeDislikeRepository = likeDislikeRepository;
    }

    
    public void like(Long postId, Long commentId) {

    }

    
    public void dislike(Long postId, Long commentId) {

    }

    // Implement the methods for LikeDislikeService
}

