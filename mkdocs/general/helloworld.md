# Hello World Compose

### Setup the project
First setup your [Project Setup](getting_started.md)


### Write a simple Compose function

A basic Compose View is using a normal Kotlin function which is annotated with @Composable


```kotlin
@Composable
fun HelloWorld() {
   Text("Hello World!")
}
```

### Use a Compose function as a view in your android app

 To use the HelloWorld() function in your App you have to use the setContent() extension function inside a onCreate() in an Activity.


```kotlin

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
                HelloWorld()
        }
    }
}
```
