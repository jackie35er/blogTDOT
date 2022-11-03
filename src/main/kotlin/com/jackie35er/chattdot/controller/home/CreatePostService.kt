package com.jackie35er.chattdot.controller.home

import com.jackie35er.chattdot.controller.home.domain.CreatePostDto

interface CreatePostService {
    fun createPost(post: CreatePostDto, username: String)

}