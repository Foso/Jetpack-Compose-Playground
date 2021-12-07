# Compose Confusion
Because of similar naming of the Compose libraries, there is a some confusion between the different "variants" of Compose. Here is a quick overview that tries to give clarification:

## Compose Runtime

The [Compose Runtime](https://developer.android.com/jetpack/androidx/releases/compose-runtime) is a library for manipulating and managing trees of data.
This library can be used to manage UI tree nodes, but it's a general purpose library, so it can be used with any kind of data.

It is developed as a Kotlin Multiplatform Library, which means that it could be ported to every target that Kotlin Multiplatform supports. 
Openly developed targets are Android, JVM and Web.
[Square](https://www.reddit.com/r/androiddev/comments/r77o7d/comment/hmyqbta/?utm_source=share&utm_medium=web2x&context=3
) is running an internal version of it on iOS. 

This library contains basic things like  @Composable, remember, mutableState, effects.

## Compose Compiler Plugin
The Compose Compiler Plugin is a Kotlin Compiler Plugin that transforms all the **@Composable** functions and adds the needed calls to the **Compose Runtime**

## Compose UI
[Compose UI](https://developer.android.com/jetpack/androidx/releases/compose-ui) is a set of UI libraries for Android using **Compose Runtime/Compose Compiler Plugin**


# Jetpack Compose
Jetpack Compose is a UI Toolkit for Android developed by Google.
It is using **Compose Runtime/Compose Compiler Plugin** and **Compose UI**

# Compose for Web
[Compose for Web](https://compose-web.ui.pages.jetbrains.team/) is a UI Toolkit for Web developed by JetBrains written in Kotlin/JS.
It is using the **Compose Runtime** and the **Compose Compiler Plugin**. It does not use Compose UI, because it uses Compose Wrappers for the HTML DOM UI Elements.


# Compose for Desktop
**Compose for Desktop** is a UI Toolkit developed by JetBrains. It runs on the JVM and it is using  **Compose Runtime**, **Compose Compiler Plugin** and a Compose UI version for desktop which is using Skia to target Windows, macOS, Linux. Additional it provides components for desktop specific apps like scrollbars or mouse support and Swing interop.

# Compose Multiplatform
[Compose Multiplatform](https://www.jetbrains.com/lp/compose-mpp/) is a Kotlin multiplatform project which is developed by JetBrains.
It uses Jetpack Compose, Compose for Web and Compose for Desktop
