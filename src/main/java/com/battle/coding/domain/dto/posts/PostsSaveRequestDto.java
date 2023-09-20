package com.battle.coding.domain.dto.posts;

import com.battle.coding.domain.member.Role;
import com.battle.coding.domain.posts.Posts;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Builder
@NoArgsConstructor
public class PostsSaveRequestDto {

    private String title;
    private String content;

    public PostsSaveRequestDto(String title, String content) {
        this.title = title;
        this.content = content;
    }

    public Posts toEntity() {
        return Posts.builder()
                .title(title)
                .content(content)
                .build();
    }

}
