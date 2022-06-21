package org.koin.userapp.view

import androidx.lifecycle.ViewModel
import org.koin.userapp.components.UserAuthenticator
import org.koin.userapp.data.User

class LoginViewModel(private val userAuthenticator: UserAuthenticator) : ViewModel() {

    fun authenticate(userName : String, password : String) : String {
        val authenticated = userAuthenticator.authenticate(User(userName, password))
        return "ViewModel - Authentication for '$userName': $authenticated"
    }
}