package com.jackie35er.chattdot.persistence

import com.jackie35er.chattdot.persistence.domain.Post
import org.springframework.data.jpa.repository.JpaRepository

interface PostRepository: JpaRepository<Post, Long> {


}