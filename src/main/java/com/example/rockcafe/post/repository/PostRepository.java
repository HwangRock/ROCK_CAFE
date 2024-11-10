package com.example.rockcafe.post.repository;

import com.example.rockcafe.post.entity.Post;
import com.example.rockcafe.user.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface PostRepository extends JpaRepository<Post, Long> {
    Optional<Post> findById(long id);
    void deleteByUserAndId(User user, long id);
}
