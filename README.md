<h1 align="center">Jetpack Compose Playground</h1>

[![jCenter](https://img.shields.io/badge/MIT-green.svg)](https://github.com/Foso/Jetpack-Compose-Playground/blob/master/LICENSE)
[![PRs Welcome](https://img.shields.io/badge/PRs-welcome-brightgreen.svg?style=flat-square)](http://makeapullrequest.com)
[![All Contributors](https://img.shields.io/badge/all_contributors-1-range.svg?style=flat-square)](#contributors)
  <a href="https://twitter.com/intent/tweet?text=Hey, check out Jetpack-Compose-Playground https://github.com/Foso/Jetpack-Compose-Playground via @jklingenberg_ #Android 
"><img src="https://img.shields.io/twitter/url/https/github.com/angular-medellin/meetup.svg?style=social" alt="Tweet"></a>

> A Jetpack Compose Example App

 <p align="left">
    <img src ="https://github.com/Foso/Jetpack-Compose-Playground/blob/master/docs/screenshots/MainPage.png" height=500 />
     <img src ="https://github.com/Foso/Jetpack-Compose-Playground/blob/master/docs/screenshots/counterdemo.png" height=500 />
     <img src ="https://github.com/Foso/Jetpack-Compose-Playground/blob/master/docs/screenshots/TextDemo.png" height=500 />

</p>

## Introduction 🙋‍♂️
This is an example project that is using an early alpha version of Jetpack Compose https://android.googlesource.com/platform/frameworks/support/+/refs/heads/androidx-master-dev/compose/

> :information_source: Please be aware that Compose is still experimental and should not be used in a production application. 


### Show some :heart: and star the repo to support the project

[![GitHub stars](https://img.shields.io/github/stars/Foso/Jetpack-Compose-Playground.svg?style=social&label=Star)](https://github.com/Foso/Jetpack-Compose-Playground) [![GitHub forks](https://img.shields.io/github/forks/Foso/Jetpack-Compose-Playground.svg?style=social&label=Fork)](https://github.com/Foso/Jetpack-Compose-Playground/fork) [![GitHub watchers](https://img.shields.io/github/watchers/Foso/Jetpack-Compose-Playground.svg?style=social&label=Watch)](https://github.com/Foso/Jetpack-Compose-Playground) [![Twitter Follow](https://img.shields.io/twitter/follow/jklingenberg_.svg?style=social)](https://twitter.com/jensklingenberg_)

## 📙 Docs
Documentation avaible at:https://github.com/Foso/Jetpack-Compose-Playground/wiki

# 🏠 Architecture

## 🛠️ Built With
### Kotlin
[![jCenter](https://img.shields.io/badge/Kotlin-1.3.40-green.svg)]()


### Project Structure
* <kbd>androidx_prebuilts</kbd> - This folder contains the Compose Libraries 1.0.0-alpha01 and the Compiler Plugin 1.0.0-alpha01
I compiled this versions from the AndroidX git repo. Because Compose is still in early alpha stage, Google doesn't offer any binaries online. In the AndroidX repo, Compose is used with a special Kotlin compiler "1.3.30-compose-20190503", but i figured out, it is also working with the Kotlin compiler v1.3.40-eap-21. 

* <kbd>app</kbd> - Base android project directory
* <kbd>compose</kbd> - a android library module that is using the compose libraries. It contains my example/test functions and 
the demo classes i copied out of the AndroidX repo (https://android.googlesource.com/platform/frameworks/support/+/androidx-master-dev/ui/material/integration-tests/) 
Inside the MyComposeApp() you can change the demo page that should be opened

# What is Jetpack Compose 
[![](http://img.youtube.com/vi/VsStyq4Lzxo/0.jpg)](http://www.youtube.com/watch?v=VsStyq4Lzxo "")
Declarative UI Patterns (Google I/O'19)

Links:
* [Compose Readme](https://android.googlesource.com/platform/frameworks/support/+/refs/heads/androidx-master-dev/compose/)

* [Compose from first Principles ](http://intelligiblebabble.com/compose-from-first-principles/)



## ✍️ Feedback

If you want to improve Compose, join the [Kotlin Slack](https://slack.kotlinlang.org) and the #compose channel or file a bug at https://issuetracker.google.com/issues?q=componentid:612128


## 📜 License

This project is licensed under the MIT License - see the [LICENSE.md](https://github.com/Foso/Jetpack-Compose-Playground/blob/master/LICENSE) file for details

### Find this project useful ? :heart:
* Support it by clicking the :star: button on the upper right of this page. :v:


## Known Issues
- Elevation is not working 
Because DrawShadow is not implemented https://android.googlesource.com/platform/frameworks/support/+/refs/heads/androidx-master-dev/ui/material/src/main/java/androidx/ui/material/surface/DrawShadow.kt

License
-------

 ```
MIT License

Copyright (c) 2019 Jens Klingenberg

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.
```


## Acknowledgments
Projects that helped me understand how to setup the project:
* [Mishkun/try-compose
](https://github.com/Mishkun/try-compose)
