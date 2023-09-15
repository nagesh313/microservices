package com.kata.comment.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.*;

@Entity
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String content;

    // Getters and setters (or use Lombok for auto-generation)
}
