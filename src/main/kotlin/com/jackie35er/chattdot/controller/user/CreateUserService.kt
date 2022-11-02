package com.jackie35er.chattdot.controller.user

import com.jackie35er.chattdot.persistence.domain.User

interface CreateUserService {

    fun createUser(user: User)
}