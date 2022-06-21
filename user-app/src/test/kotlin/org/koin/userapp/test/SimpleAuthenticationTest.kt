package org.koin.userapp.test

import junit.framework.Assert.assertTrue
import org.junit.Test
import org.koin.userapp.components.UserAuthenticator
import org.koin.userapp.components.UserInMemoryDatabase
import org.koin.userapp.data.User
import org.koin.userapp.view.LoginPresenter

class SimpleAuthenticationTest {

    @Test
    fun `test authentication components`() {
        val userInMemoryDatabase = UserInMemoryDatabase()
        userInMemoryDatabase.init()

        val userAuthenticator = UserAuthenticator(userInMemoryDatabase)

        val user = User("arnaud", "123456")

        assertTrue("user is authenticated",userAuthenticator.authenticate(user))
    }
    @Test
    fun `test authentication presenter`() {
        val userInMemoryDatabase = UserInMemoryDatabase()
        userInMemoryDatabase.init()

        val userAuthenticator = UserAuthenticator(userInMemoryDatabase)

        val presenter = LoginPresenter(userAuthenticator)
        val message = presenter.authenticate("arnaud","123456")

        println("message: $message")
        assertTrue("message contains true",message.contains("true"))
    }
}