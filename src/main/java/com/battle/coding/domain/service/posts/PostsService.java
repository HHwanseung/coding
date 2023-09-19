package com.battle.coding.domain.service.posts;

import com.battle.coding.domain.dto.posts.PostsListResponseDto;
import com.battle.coding.domain.dto.posts.PostsResponseDto;
import com.battle.coding.domain.dto.posts.PostsSaveRequestDto;
import com.battle.coding.domain.dto.posts.PostsUpdateRequestDto;
import com.battle.coding.domain.posts.Posts;
import com.battle.coding.domain.repository.posts.PostsRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@Service
public class PostsService {

    private final PostsRepository postsRepository;

    @Transactional
    public Long save(PostsSaveRequestDto requestDto) {
        return postsRepository.save(requestDto.toEntity()).getId();
    }

    @Transactional
    public Long update(Long id, PostsUpdateRequestDto requestDto){
        Posts posts = postsRepository.findById(id).orElseThrow(() -> new IllegalArgumentException());
        posts.update(requestDto.getTitle(), requestDto.getContent());
        return id;
    }

    @Transactional
    public void delete(Long id) {
        Posts posts = postsRepository.findById(id).orElseThrow(() -> new IllegalArgumentException());
        postsRepository.delete(posts);
    }

    @Transactional
    public PostsResponseDto read(Long id) {
        Posts posts = postsRepository.findById(id).orElseThrow(() -> new IllegalArgumentException());
        return new PostsResponseDto(posts);
    }

    @Transactional
    public List<PostsListResponseDto> findAll(){
        return postsRepository.findAll().stream().map(PostsListResponseDto::new).collect(Collectors.toList());
    }

}
