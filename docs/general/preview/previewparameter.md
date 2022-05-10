# PreviewParameter

You can use **@PreviewParameter** to provide sample data for your Composables.
Let's say you have the following Composable and you want to generate a preview.

```kotlin
data class User(val name :String,val age:Int)

@Composable
fun UserInfo(user:User) {
    Text(user.name+ " "+user.age)
}
```

Because UserInfo needs a User you can't directly use @Preview.
One way is to wrap your Composable in a Composable that provides a User

```kotlin
@Preview
@Composable
fun UserPreview() {
    UserInfo(user = User("Jens", 31))
}
```

An other way is to use @PreviewParameter on the parameter. With PreviewParameter you can set a class
which will provide values for the needed User

```kotlin
@Preview
@Composable
fun UserInfo(@PreviewParameter(SampleUserProvider::class) user:User) {
    Text(user.name+ " "+user.age)
}
```
### Create PreviewParameterProvider

**SampleUserProvider::class** will be the class which provides a User.
To create a PreviewParameterProvider you need to implement the interface PreviewParameterProvider.
The interface has two properties.

**values** is a sequence of your sample data.

```kotlin
class SampleUserProvider: PreviewParameterProvider<User> {
    override val values = sequenceOf(User("Jens",31),User("Jim",44))
}
```

### Use PreviewParameterProvider
You can annotate your parameter with @PreviewParameter and the class which provides the sample data.

```kotlin
@Preview
@Composable
fun UserInfo(@PreviewParameter(SampleUserProvider::class) user:User) {
    Text(user.name+ " "+user.age)
}
```

Now Android Studio will generate a preview of the Composable for every value that your provider provides.

<p align="center">
  <img src ="../../../images/general/preview/previewParam1.png"  height=100 width=300 />
</p>

You can limit the amount of previews by settings a limit to PreviewParameter.

```kotlin
@PreviewParameter(SampleUserProvider::class,1)
```
