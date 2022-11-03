package com.jackie35er.chattdot.service

import com.jackie35er.chattdot.controller.home.CreatePostService
import com.jackie35er.chattdot.controller.home.domain.CreatePostDto
import com.jackie35er.chattdot.persistence.PostRepository
import com.jackie35er.chattdot.persistence.UserRepository
import com.jackie35er.chattdot.persistence.domain.Post
import org.springframework.stereotype.Service

@Service
internal class CreatePostServiceImpl(
    val postRepository: PostRepository,
    val userRepository: UserRepository,
): CreatePostService {

    override fun createPost(post: CreatePostDto, username: String) {
        val user = userRepository.findByUsername(username) ?: throw IllegalArgumentException("User not found")

        val post = Post(
            id = 0,
            title = post.title,
            description = post.description,
            author = user
        )

        postRepository.save(post)
    }
}