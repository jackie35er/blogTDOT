package com.jackie35er.chattdot.controller.user

import com.jackie35er.chattdot.controller.user.mapper.CreateUserDtoMapper
import com.jackie35er.chattdot.security.service.TokenService
import org.slf4j.LoggerFactory
import org.springframework.security.core.Authentication
import org.springframework.security.crypto.password.PasswordEncoder
import org.springframework.web.bind.annotation.CrossOrigin
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController

@RestController
class UserController(
    private val tokenService: TokenService,
    private val createUserService: CreateUserService,
    private val createUserDtoMapper: CreateUserDtoMapper,
) {

    private val LOG = LoggerFactory.getLogger(UserController::class.java)

    @PostMapping("/token")
    fun token(authentication: Authentication): String {
        LOG.debug("Token requested for user: ${authentication.name}")
        val token = tokenService.generateToken(authentication)
        LOG.debug("Token generated: $token")
        return token
    }

    @PostMapping("/register", consumes = ["application/json"])
    fun createUser(@RequestBody createUserDto: CreateUserDto)  {
        LOG.debug("Create user attempt: $createUserDto")
        val user = createUserDtoMapper.mapToUser(createUserDto)
        createUserService.createUser(user)
        LOG.debug("User created: $user")
    }
}