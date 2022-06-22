//package org.koin.userapp.test
//
//import org.junit.Rule
//import org.junit.Test
//import org.koin.test.KoinTest
//import org.koin.test.check.checkModules
//import org.koin.test.mock.MockProviderRule
//import org.koin.userapp.di.userAppModule
//import org.mockito.Mockito
//
//class CheckModulesTest : KoinTest {
//
//    @get:Rule
//    val mockProvider = MockProviderRule.create { clazz -> Mockito.mock(clazz.java) }
//
//    @Test
//    fun checkKoinModules() {
//        checkModules {
//            modules(userAppModule)
//        }
//    }
//}