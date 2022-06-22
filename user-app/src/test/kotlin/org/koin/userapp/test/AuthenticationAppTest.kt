//package org.koin.userapp.test
//
//import junit.framework.Assert.assertEquals
//import junit.framework.Assert.assertTrue
//import org.junit.Before
//import org.junit.Rule
//import org.junit.Test
//import org.koin.test.KoinTest
//import org.koin.test.KoinTestRule
//import org.koin.test.get
//import org.koin.test.inject
//import org.koin.test.mock.MockProviderRule
//import org.koin.test.mock.declareMock
//import org.koin.userapp.components.UserAuthenticator
//import org.koin.userapp.components.UserInMemoryDatabase
//import org.koin.userapp.data.User
//import org.koin.userapp.di.userAppModule
//import org.koin.userapp.view.LoginPresenter
//import org.mockito.BDDMockito.times
//import org.mockito.Mockito
//
//
//class AuthenticationAppTest : KoinTest {
//
//    private val userDatabase: UserInMemoryDatabase by inject()
//    private val userAuthenticator: UserAuthenticator by inject()
//    private val loginPresenter: LoginPresenter by inject()
//
//    @get:Rule
//    val koinTestRule = KoinTestRule.create { modules(userAppModule) }
//
//    @get:Rule
//    val mockProvider = MockProviderRule.create { clazz -> Mockito.mock(clazz.java) }
//
//    @Before
//    fun init() {
//        userDatabase.init()
//    }
//
//    @Test
//    fun `authenticate new user`() {
//        val newUser = User("john", "654321")
//        userDatabase.saveUser(newUser)
//
//        assertTrue("new user is logged", userAuthenticator.authenticate(newUser))
//    }
//
//    @Test
//    fun `authenticate with presenter`() {
//        val newUser = User("john", "654321")
//        userDatabase.saveUser(newUser)
//        val message = loginPresenter.authenticate(newUser.userName, newUser.password)
//        val authenticated = userAuthenticator.authenticate(newUser)
//
//        assertTrue(authenticated)
//        assertEquals("authentication for '${newUser.userName}': $authenticated", message)
//    }
//
//    @Test
//    fun `authenticate new user with mock`() {
//
//        declareMock<UserAuthenticator>()
//
//        val newUser = User("john", "654321")
//        userAuthenticator.authenticate(newUser)
//
//        Mockito.verify(get<UserAuthenticator>(), times(1)).authenticate(newUser)
//    }
//}