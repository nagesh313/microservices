package com.kata.comment.entity;

import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.GenericGenerator;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Entity
@Data
@EntityListeners(AuditingEntityListener.class)
public class Comment {
    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    private String id;
    private String postId;
    @Column(columnDefinition="TEXT", length = 1000)
    private String content;

    @CreatedBy
    private String createdBy;
    @LastModifiedBy
    private String modifiedBy;
    @Column(name = "created_date", nullable = false, updatable = false)
    @CreatedDate
    private long createdDate;
    @Column(name = "modified_date")
    @LastModifiedDate
    private long modifiedDate;
}
