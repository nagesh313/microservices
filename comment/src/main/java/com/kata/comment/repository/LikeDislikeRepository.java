package com.kata.comment.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.kata.comment.entity.*;

@Repository
public interface LikeDislikeRepository extends JpaRepository<LikeDislike, Long> {
}
