# Compiler Plugin

Compose works by transforming all Kotlin functions that are annotated with **@Composable** and adding code for the Compose Runtime.
To do that it uses a Kotlin Compiler Plugin.


For instance, this Composable: 
```kotlin
@Composable
fun Hello(name: String) {
    Text(name)
}
```


will be transformed and compiled to Jvm ByteCode. Below you can see the decompiled code as Java code

```java
@Metadata(
        mv = {1, 5, 1},
        k = 2,
        xi = 48,
        d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a\u0015\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0007¢\u0006\u0002\u0010\u0004¨\u0006\u0005"},
        d2 = {"Hello", "", "name", "", "(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V", "app_debug"}
)
public final class GreetingKt {
    @Composable
    public static final void Hello(@NotNull final String name, @Nullable Composer $composer, final int $changed) {
        Intrinsics.checkNotNullParameter(name, "name");
        $composer = $composer.startRestartGroup(274849561);
        ComposerKt.sourceInformation($composer, "C(Hello)7@166L10:Greeting.kt#tlkiwl");
        int $dirty = $changed;
        if (($changed & 14) == 0) {
            $dirty = $changed | ($composer.changed(name) ? 4 : 2);
        }

        if (($dirty & 11 ^ 2) == 0 && $composer.getSkipping()) {
            $composer.skipToGroupEnd();
        } else {
            TextKt.Text-fLXpl1I(name, (Modifier)null, 0L, 0L, (FontStyle)null, (FontWeight)null, (FontFamily)null, 0L, (TextDecoration)null, (TextAlign)null, 0L, 0, false, 0, (Function1)null, (TextStyle)null, $composer, 14 & $dirty, 0, 65534);
        }

        ScopeUpdateScope var4 = $composer.endRestartGroup();
        if (var4 != null) {
            var4.updateScope((Function2)(new Function2() {
                public final void invoke(@Nullable Composer $composer, int $force) {
                    GreetingKt.Hello(name, $composer, $changed | 1);
                }
            }));
        }

    }
}
```


## Where can i find the source code
https://android.googlesource.com/platform/frameworks/support/+/refs/heads/androidx-master-dev/compose/compiler/compiler-hosted/


## See also:
* Leland Richardson(@intelligibabble) started a series about the Compose Compiler https://www.youtube.com/watch?v=bg0R9-AUXQM
* [Under the hood of Jetpack Compose — part 2 of 2](https://medium.com/androiddevelopers/under-the-hood-of-jetpack-compose-part-2-of-2-37b2c20c6cdd)
* [A Hitchhiker's Guide to Compose Compiler: Composers, Compiler Plugins, and Snapshots](https://www.droidcon.com/2022/06/28/ha-hitchhikers-guide-to-compose-compiler-composers-compiler-plugins-and-snapshots/)

