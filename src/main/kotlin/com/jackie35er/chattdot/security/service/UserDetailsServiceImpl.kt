package com.jackie35er.chattdot.security.service

import com.jackie35er.chattdot.persistence.UserRepository
import com.jackie35er.chattdot.security.service.domain.SecruityUser
import org.springframework.security.core.userdetails.UserDetails
import org.springframework.security.core.userdetails.UserDetailsService
import org.springframework.security.core.userdetails.UsernameNotFoundException
import org.springframework.stereotype.Service

@Service
class UserDetailsServiceImpl(
    val userRepository: UserRepository
): UserDetailsService {
    override fun loadUserByUsername(username: String): UserDetails {
        val user = userRepository.findByUsername(username) ?: throw UsernameNotFoundException("User not found")

        return SecruityUser(user)
    }
}