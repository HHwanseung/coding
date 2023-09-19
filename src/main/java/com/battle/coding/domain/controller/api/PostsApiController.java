package com.battle.coding.domain.controller.api;

import com.battle.coding.domain.dto.posts.PostsListResponseDto;
import com.battle.coding.domain.dto.posts.PostsResponseDto;
import com.battle.coding.domain.dto.posts.PostsSaveRequestDto;
import com.battle.coding.domain.dto.posts.PostsUpdateRequestDto;
import com.battle.coding.domain.service.posts.PostsService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
public class PostsApiController {

    private final PostsService postsService;

    @PostMapping("/api/posts")
    public Long save(@RequestBody PostsSaveRequestDto requestDto) {
        return postsService.save(requestDto);
    }

    @PutMapping("/api/posts/{id}")
    public Long update(Long id, @RequestBody PostsUpdateRequestDto requestDto) {
        return postsService.update(id, requestDto);
    }

    @DeleteMapping("/api/posts{id}")
    public Long delete(@PathVariable Long id) {
        postsService.delete(id);
        return id;
    }

    @GetMapping("/api/posts/{id}")
    public PostsResponseDto read(@PathVariable Long id) {
        return postsService.read(id);
    }

    @GetMapping("/api/posts/list")
    public List<PostsListResponseDto> findAll() {
        return postsService.findAll();
    }
}
