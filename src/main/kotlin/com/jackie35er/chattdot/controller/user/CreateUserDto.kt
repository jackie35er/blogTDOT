package com.jackie35er.chattdot.controller.user

data class CreateUserDto(
    val username: String,
    val password: String,
    val role: String,
    val email: String,
    val profilePictureBase64: String,
)
