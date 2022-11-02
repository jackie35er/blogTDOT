package com.jackie35er.chattdot.controller.home

import com.jackie35er.chattdot.persistence.domain.Post

class PostDto(
    val title: String,
    val description: String,
    val authorName: String,
) {
    constructor(post: Post) : this(
        post.title,
        post.description,
        post.author.username
    )
}