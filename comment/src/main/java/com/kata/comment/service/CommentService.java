package com.kata.comment.service;

import com.kata.comment.entity.Comment;
import com.kata.comment.repository.CommentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommentService{
    private final CommentRepository commentRepository;

    @Autowired
    public CommentService(CommentRepository commentRepository) {
        this.commentRepository = commentRepository;
    }

    
    public Comment createComment(Long postId, Comment comment) {
        return null;
    }

    
    public List<Comment> getAllComments(Long postId) {
        return null;
    }

    
    public Comment getCommentById(Long commentId, Long id) {
        return null;
    }

    
    public Comment updateComment(Long commentId, Long id, Comment updatedComment) {
        return null;
    }

    
    public void deleteComment(Long commentId, Long id) {

    }

    // Implement the methods for CommentService
}
