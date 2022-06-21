package org.koin.userapp.view

import org.koin.userapp.components.UserAuthenticator
import org.koin.userapp.data.User


class LoginPresenter(private val userAuthenticator: UserAuthenticator) {

    fun authenticate(userName : String, password : String) : String {
        val authenticated = userAuthenticator.authenticate(User(userName, password))
        return "Presenter - Authentication for '$userName': $authenticated"
    }
}