package com.jackie35er.chattdot.controller.home

import com.jackie35er.chattdot.controller.home.domain.CreatePostDto
import com.jackie35er.chattdot.persistence.domain.Post
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController
import java.security.Principal

@RestController
class HomeController(
    val getPostsService: GetPostsService,
    val createPostService: CreatePostService,
) {

    @GetMapping("/")
    fun home(principal: Principal): String {
        return principal.name
    }

    @GetMapping("/posts")
    fun getPosts(): List<PostDto> {
        return getPostsService.getPosts().sortedByDescending { it.id }.map { PostDto(it) }
    }

    @PostMapping("/posts")
    fun createPost(@RequestBody createPostDto: CreatePostDto, principal: Principal) {
        createPostService.createPost(createPostDto, principal.name)
    }

}