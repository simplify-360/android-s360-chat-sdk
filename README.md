# Android S360 Chat SDK

The Android S360 Chat SDK enables seamless integration of Simplify360's chat functionality into your Android applications. Follow the simple steps below to integrate the library into your project.

## Gradle

Add the following code to your root `settings.gradle` file at the end of repositories:

```markdown
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        mavenCentral()
        maven { url 'https://jitpack.io' }
    }
}
```

Then, add the dependency in your app module's `build.gradle` file:

```markdown
dependencies {
    implementation 'com.github.simplify-360:android-s360-chat-sdk:2.3'
}
```
Add this code to your `xml` file

```markdown
<com.android.s360_chat_sdk.S360ChatWidget
      android:id="@+id/s360ChatWidget"
      android:layout_width="match_parent"
      android:layout_height="match_parent"/>
```

Add this code to `activity` file

for `kotlin`
```markdown
import com.android.s360_chat_sdk.S360ChatWidget



  val s360Chat: S360ChatWidget = findViewById(R.id.s360ChatWidget)
  s360Chat.loadUrl("url-from-s360-dashboard")
```
for `java`

```markdown
import com.android.s360_chat_sdk.S360ChatWidget



 S360ChatWidget s360Chat = findViewById(R.id.s360ChatWidget);
  s360Chat.loadUrl("url-from-s360-dashboard");
```

## Maven

Add the following repository and dependency to your pom.xml file:

```markdown
<repositories>
    <repository>
        <id>jitpack.io</id>
        <url>https://jitpack.io</url>
    </repository>
</repositories>

<dependencies>
    <dependency>
        <groupId>com.github.simplify-360</groupId>
        <artifactId>android-s360-chat-sdk</artifactId>
        <version>2.3</version>
    </dependency>
</dependencies>

```

## SBT (Scala Build Tool)

Add the following to your build.sbt file:


```markdown
resolvers += "jitpack" at "https://jitpack.io"

libraryDependencies += "com.github.simplify-360" % "android-s360-chat-sdk" % "2.3"

```

## Leiningen

Add the following to your project.clj file:

```markdown
:repositories [["jitpack" "https://jitpack.io"]]

:dependencies [[com.github.simplify-360/android-s360-chat-sdk "2.3"]]

```

