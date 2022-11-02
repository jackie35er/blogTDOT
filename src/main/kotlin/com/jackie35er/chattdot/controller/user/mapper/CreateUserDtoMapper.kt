package com.jackie35er.chattdot.controller.user.mapper

import com.jackie35er.chattdot.controller.user.CreateUserDto
import com.jackie35er.chattdot.persistence.domain.User
import org.springframework.security.crypto.password.PasswordEncoder
import org.springframework.stereotype.Service

@Service
class CreateUserDtoMapper(
    val passwordEncoder: PasswordEncoder
) {
    fun mapToUser(createUserDto: CreateUserDto): User {
        return User(
            id = 0,
            username = createUserDto.username,
            password = passwordEncoder.encode(createUserDto.password),
            role = createUserDto.role,
            email = createUserDto.email,
            profilePictureBase64 = createUserDto.profilePictureBase64,
        )
    }
}