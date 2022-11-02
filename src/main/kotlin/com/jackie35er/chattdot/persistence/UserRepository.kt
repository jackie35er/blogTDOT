package com.jackie35er.chattdot.persistence

import com.jackie35er.chattdot.persistence.domain.User
import org.springframework.data.jpa.repository.JpaRepository

interface UserRepository: JpaRepository<User, Long> {

    fun findByUsername(username: String): User?
}