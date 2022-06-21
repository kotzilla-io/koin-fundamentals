package org.koin.userapp.components

import org.koin.userapp.data.User

class UserAuthenticator(private val userDatabase: UserDatabase) {

    fun authenticate(user: User): Boolean {
        val foundUser = userDatabase.getUser(user.userName)
        return foundUser?.let { it.password == user.password } ?: false
    }
}