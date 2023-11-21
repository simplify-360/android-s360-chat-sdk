# Android S360 Chat SDK

The Android S360 Chat SDK enables seamless integration of Simplify360's chat functionality into your Android applications. Follow the simple steps below to integrate the library into your project.

## Gradle

Add the following code to your root `build.gradle` file at the end of repositories:

```gradle
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        mavenCentral()
        maven { url 'https://jitpack.io' }
    }
}

#Then, add the dependency in your app module's `build.gradle` file:

dependencies {
    implementation 'com.github.simplify-360:android-s360-chat-sdk:2.3'
}

