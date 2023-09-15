package com.kata.comment.entity;

import jakarta.persistence.Entity;

import jakarta.persistence.*;

@Entity
public class LikeDislike {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Boolean liked; // true for like, false for dislike

    // Getters and setters (or use Lombok for auto-generation)
}
