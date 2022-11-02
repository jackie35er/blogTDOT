package com.jackie35er.chattdot.service

import com.jackie35er.chattdot.controller.user.CreateUserService
import com.jackie35er.chattdot.persistence.UserRepository
import com.jackie35er.chattdot.persistence.domain.User
import org.springframework.stereotype.Service

@Service
internal class CreateUserServiceImpl(
    val userRepository: UserRepository,
) : CreateUserService {


    override fun createUser(user: User) {
        userRepository.save(user)
    }
}