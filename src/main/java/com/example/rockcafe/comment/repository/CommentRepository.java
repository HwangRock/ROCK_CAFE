package com.example.rockcafe.comment.repository;

import com.example.rockcafe.comment.entity.Comment;
import com.example.rockcafe.user.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CommentRepository extends JpaRepository<Comment, Long> {
    Optional<Comment> findById(Long id);
    void deleteByUserAndId(User user, Long id);
}
