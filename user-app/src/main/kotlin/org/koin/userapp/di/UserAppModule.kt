package org.koin.userapp.di

import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.bind
import org.koin.dsl.module
import org.koin.userapp.components.UserAuthenticator
import org.koin.userapp.components.UserDatabase
import org.koin.userapp.components.UserInMemoryDatabase
import org.koin.userapp.view.LoginPresenter
import org.koin.userapp.view.LoginViewModel


val userAppModule = module {
    single { UserInMemoryDatabase() } bind UserDatabase::class
    single { UserAuthenticator(get()) }

    factory { LoginPresenter(get()) }
    viewModel { LoginViewModel(get()) }
}