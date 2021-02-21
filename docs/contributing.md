# Contributing

## to Jetpack Compose
If you want to improve Compose, join the Kotlin Slack and the **#compose** channel or file a bug at https://issuetracker.google.com/issues?q=componentid:612128

## to this project
This project is using [MkDocs](https://www.mkdocs.org/) and the [MkDocs-Material Theme](https://squidfunk.github.io/mkdocs-material/) to generate the pages for Github.
The markdown files are located in [/docs](https://github.com/Foso/Jetpack-Compose-Playground/tree/master/docs).
The generated files for the GitHub page are in [/site](https://github.com/Foso/Jetpack-Compose-Playground/tree/master/.github/workflows/gh-pages.yml#L32). Do not make changes in this folder, they will be overridden.

* Install plugins

    ```
    pip3 install mkdocs-minify-plugin
    pip3 install mkdocs-git-revision-date-localized-plugin
    pip3 install mkdocs-minify-plugin
    pip3 install mkdocs-macros-plugin
    ```

* Run docs locally

    To start the mkdocs server locally, run **mkdocs serve** in a terminal in the project folder.


* Add/Change docs

    The docs are written in markdown files which are all in [/docs](https://github.com/Foso/Jetpack-Compose-Playground/tree/master/docs). To change the navigation sidebar, you need to edit the **mkdocs.yml**.

* Build the docs

    When you run **mkdocs build** in a terminal in the project folder, the html files be generated to [/site](https://github.com/Foso/Jetpack-Compose-Playground/tree/master/docs).

    When deployed, these files are built for GitHub Pages using a [workflow](https://github.com/Foso/Jetpack-Compose-Playground/actions).


Feel free to change/add files and send a pull request.
