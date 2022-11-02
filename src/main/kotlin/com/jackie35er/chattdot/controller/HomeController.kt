package com.jackie35er.chattdot.controller

import com.jackie35er.chattdot.persistence.PostRepository
import com.jackie35er.chattdot.persistence.domain.Post
import org.intellij.lang.annotations.RegExp
import org.springframework.security.access.prepost.PreAuthorize
import org.springframework.web.bind.annotation.CrossOrigin
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController
import java.security.Principal

@RestController
class HomeController(
    val postRepository: PostRepository
) {

    @GetMapping("/")
    fun home(principal: Principal): String {
        return principal.name
    }

    @GetMapping("/posts")
    fun getPosts(): List<Post> {
        return postRepository.findAll().sortedBy(Post::id)
    }

}