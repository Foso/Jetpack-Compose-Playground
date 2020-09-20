# Testing

## Setup
Add the compose testing library to your dependencies in build.gradle

```kotlin
androidTestImplementation("androidx.ui:ui-test:$compose_version")
```

## Testrule


##TestTag

```kotlin
@Composable
fun MyText(){
    Text("HALLO",Modifier.testTag("MyTag"))
}
```

```kotlin
composeTestRule.onNodeWithTag("MyTag").assertIsDisplayed()
```