package com.battle.coding.domain.repository.posts;

import com.battle.coding.domain.posts.Posts;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostsRepository extends JpaRepository<Posts, Long> {
}
