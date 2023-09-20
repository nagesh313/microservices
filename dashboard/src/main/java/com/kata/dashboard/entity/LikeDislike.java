package com.kata.dashboard.entity;

import jakarta.persistence.Entity;

import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

@Entity
@Data
public class LikeDislike {
    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    private String id;
    private String commentId;
    private Boolean liked; // true for like, false for dislike

    // Getters and setters (or use Lombok for auto-generation)
}
