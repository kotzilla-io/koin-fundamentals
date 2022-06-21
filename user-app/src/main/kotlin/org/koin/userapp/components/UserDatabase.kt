package org.koin.userapp.components

import org.koin.userapp.data.User

interface UserDatabase {
    fun init()
    fun getUser(userName: String): User?
}