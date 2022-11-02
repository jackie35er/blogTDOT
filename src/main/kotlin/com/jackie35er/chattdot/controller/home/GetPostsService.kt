package com.jackie35er.chattdot.controller.home

import com.jackie35er.chattdot.persistence.domain.Post

interface GetPostsService {

    fun getPosts(): List<Post>
}