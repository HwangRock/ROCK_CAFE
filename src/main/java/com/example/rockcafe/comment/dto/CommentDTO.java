package com.example.rockcafe.comment.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CommentDTO {
    private Long id;
    private String text;
    private String author;
    private LocalDateTime createdAt;
    private Long postId;
    private Long likeCount;
    private Long dislikeCount;
}
