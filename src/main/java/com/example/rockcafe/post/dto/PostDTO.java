package com.example.rockcafe.post.dto;

import com.example.rockcafe.user.entity.User;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class PostDTO {
    private Long id;
    private String title;
    private String content;
    private LocalDateTime createdAt;
    private String category;
    private Long likeCount;
    private Long dislikeCount;
    private String author;
    private Long commentCount;
}
