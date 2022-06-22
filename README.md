# Dependency Injection with Koin - Fundamentals

This project is part of the Droidcon E-Learning platform - https://courses.droidcon.com/course/dependency-injection-with-koin-fundamentals

## Setup

Just checkout the Git project, import it in Android Studio. Synchronize with Gradle. You should have the `user-app` module ready.

## Git Branches

- main - is the starting point of the project
- solution - the full source code of the project, covering Koin configuration

## Detailed Step Solution

You will find the following topics in the source code:

- Gradle Configuration Setup [build.gradle](./user-app/build.gradle)
- Koin Module Configuration Setup [UserAppModule.kt](./user-app/src/main/kotlin/org/koin/userapp/di/UserAppModule.kt)
- Inject in MainApplication [UserAppModule.kt](./user-app/src/main/kotlin/org/koin/userapp/MainApplication.kt)
- Inject in LoginActivity [LoginActivity.kt](./user-app/src/main/kotlin/org/koin/userapp/view/LoginActivity.kt)
- Verify Koin Configuration Graph [CheckModulesTest.kt](./user-app/src/test/kotlin/org/koin/userapp/test/CheckModulesTest.kt)
- Testing with Koin [AuthenticationAppTest.kt](./user-app/src/test/kotlin/org/koin/userapp/test/AuthenticationAppTest.kt)