package com.jackie35er.chattdot.controller.home

import com.jackie35er.chattdot.persistence.domain.Post
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController
import java.security.Principal

@RestController
class HomeController(
    val getPostsService: GetPostsService,
) {

    @GetMapping("/")
    fun home(principal: Principal): String {
        return principal.name
    }

    @GetMapping("/posts")
    fun getPosts(): List<PostDto> {
        return getPostsService.getPosts().map { PostDto(it) }
    }

}