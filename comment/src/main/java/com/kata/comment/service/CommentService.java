package com.kata.comment.service;

import com.kata.comment.entity.Comment;
import com.kata.comment.repository.CommentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CommentService {
    private final CommentRepository commentRepository;

    @Autowired
    public CommentService(CommentRepository commentRepository) {
        this.commentRepository = commentRepository;
    }


    public Comment createComment(String postId, Comment comment) {
        comment.setPostId(postId);
        return commentRepository.save(comment);
    }


    public List<Comment> getAllCommentsByPostId(String postId) {
        return commentRepository.findAllByPostId(postId);
    }


    public Optional<Comment> getCommentById(String commentId) {
        return commentRepository.findById(commentId);
    }


    public Comment updateComment(String commentId, String postId, Comment updatedComment) {
        updatedComment.setId(commentId);
        updatedComment.setPostId(postId);
        return commentRepository.save(updatedComment);
    }


    public void deleteComment(String commentId) {
        commentRepository.deleteById(commentId);
    }
}
