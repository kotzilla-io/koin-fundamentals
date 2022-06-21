package org.koin.userapp.components

import org.koin.userapp.data.User


class UserInMemoryDatabase : UserDatabase {

    private val users = arrayListOf<User>()

    override fun init() {
        users.clear()
        users.addAll(
            listOf(
                User("arnaud", "123456"),
                User("michael", "234567")
            )
        )
    }

    fun saveUser(user : User){
        users.add(user)
    }

    override fun getUser(userName: String): User? {
        return users.firstOrNull { it.userName == userName }
    }
}