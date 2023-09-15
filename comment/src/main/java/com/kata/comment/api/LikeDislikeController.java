package com.kata.comment.api;

import com.kata.comment.service.LikeDislikeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/likes")
public class LikeDislikeController {

    private final LikeDislikeService likeDislikeService;

    @Autowired
    public LikeDislikeController(LikeDislikeService likeDislikeService) {
        this.likeDislikeService = likeDislikeService;
    }

    // Like a post or comment
    @PostMapping("/like")
    public ResponseEntity<Void> likePostOrComment(@RequestParam Long postId, @RequestParam Long commentId) {
        likeDislikeService.like(postId, commentId);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    // Dislike a post or comment
    @PostMapping("/dislike")
    public ResponseEntity<Void> dislikePostOrComment(@RequestParam Long postId, @RequestParam Long commentId) {
        likeDislikeService.dislike(postId, commentId);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
