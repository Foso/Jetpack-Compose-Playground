# Contributing

## to Jetpack Compose
If you want to improve Compose, join the Kotlin Slack and the #compose channel or file a bug at https://issuetracker.google.com/issues?q=componentid:612128

## to this project
This project is using [MkDocs](https://www.mkdocs.org/) to generate the pages for Github. 
The markdown files are located in [/mkdocs](https://github.com/Foso/Jetpack-Compose-Playground/tree/master/mkdocs).
The generated files for the github page are in [/docs](https://github.com/Foso/Jetpack-Compose-Playground/tree/master/docs). Do not make changes in this folder, they will be overriden

* Run docs locally

To start the mkdocs server locally, run **mkdocs serve** in a terminal in the project folder.

pip3 install mkdocs-minify-plugin
pip3 install mkdocs-git-revision-date-localized-plugin

* Add/Change docs

The docs are written in markdown files which are all in [/mkdocs](https://github.com/Foso/Jetpack-Compose-Playground/tree/master/mkdocs). To change the navigation sidebar, you need to edit the mkdocs.yml.

When you run **mkdocs build** in a terminal in the project folder, the html files be generated to [/docs](https://github.com/Foso/Jetpack-Compose-Playground/tree/master/docs)


Feel free to change/add files and send a pull request.