package com.example.rockcafe.post.entity;

import com.example.rockcafe.user.entity.User;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor

public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(nullable = false)
    private String title;

    @Column(nullable=false)
    private String content;

    @Column(nullable=false)
    private LocalDateTime createdAt;

    @Column(nullable=false)
    private String category;

    @Column(nullable=false)
    private Long likeCount;

    @Column(nullable=false)
    private Long dislikeCount;

    @Column(nullable=false)
    private LocalDateTime updatedAt;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="user_id",nullable = false)
    private User author;

    @Column(nullable=false)
    private Long commentCount;
}
