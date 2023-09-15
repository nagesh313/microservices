package com.kata.comment.api;

import com.kata.comment.entity.Comment;
import com.kata.comment.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/posts/{postId}/comments")
public class CommentController {

    private final CommentService commentService;

    @Autowired
    public CommentController(CommentService commentService) {
        this.commentService = commentService;
    }

    // Create a new comment on a post
    @PostMapping
    public ResponseEntity<Comment> createComment(@PathVariable Long postId, @RequestBody Comment comment) {
        Comment createdComment = commentService.createComment(postId, comment);
        return new ResponseEntity<>(createdComment, HttpStatus.CREATED);
    }

    // Retrieve all comments on a post
    @GetMapping
    public ResponseEntity<List<Comment>> getAllComments(@PathVariable Long postId) {
        List<Comment> comments = commentService.getAllComments(postId);
        return new ResponseEntity<>(comments, HttpStatus.OK);
    }

    // Retrieve a comment on a post by ID
    @GetMapping("/{commentId}")
    public ResponseEntity<Comment> getCommentById(@PathVariable Long postId, @PathVariable Long commentId) {
        Comment comment = commentService.getCommentById(postId, commentId);
        return new ResponseEntity<>(comment, HttpStatus.OK);
    }

    // Update a comment on a post by ID
    @PutMapping("/{commentId}")
    public ResponseEntity<Comment> updateComment(@PathVariable Long postId, @PathVariable Long commentId, @RequestBody Comment updatedComment) {
        Comment comment = commentService.updateComment(postId, commentId, updatedComment);
        return new ResponseEntity<>(comment, HttpStatus.OK);
    }

    // Delete a comment on a post by ID
    @DeleteMapping("/{commentId}")
    public ResponseEntity<Void> deleteComment(@PathVariable Long postId, @PathVariable Long commentId) {
        commentService.deleteComment(postId, commentId);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}