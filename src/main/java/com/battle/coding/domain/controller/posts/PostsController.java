package com.battle.coding.domain.controller.posts;

import com.battle.coding.domain.dto.posts.PostsResponseDto;
import com.battle.coding.domain.service.posts.PostsService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@RequiredArgsConstructor
@Controller
public class PostsController {

    private final PostsService postsService;


    @GetMapping("/")
    public String index () {
        return "index";
    }
//    @GetMapping("/")
//    public String index (Model model) {
//        model.addAttribute("posts", postsService.findAll());
//        return "index";
//    }

//    @GetMapping("/posts/save")
//    public String postSave() {
//        return "posts-save";
//    }

}
