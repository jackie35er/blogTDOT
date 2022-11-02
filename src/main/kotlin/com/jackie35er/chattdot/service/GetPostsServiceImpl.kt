package com.jackie35er.chattdot.service

import com.jackie35er.chattdot.controller.home.GetPostsService
import com.jackie35er.chattdot.persistence.PostRepository
import com.jackie35er.chattdot.persistence.domain.Post
import org.springframework.stereotype.Service

@Service
internal class GetPostsServiceImpl(
    val postRepository: PostRepository,
) : GetPostsService {

    override fun getPosts(): List<Post> {
        return postRepository.findAll()
    }
}
