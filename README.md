# Knime Python node archetype

[![Build Status](https://travis-ci.org/3D-e-Chem/knime-python-node-archetype.svg?branch=master)](https://travis-ci.org/3D-e-Chem/knime-python-node-archetype)
[ ![Download](https://api.bintray.com/packages/nlesc/knime-python-node-archetype/knime-python-node-archetype/images/download.svg) ](https://bintray.com/nlesc/knime-python-node-archetype/knime-python-node-archetype/_latestVersion)

Generates [Knime](http://www.knime.org) workflow node skeleton repository with sample code.
The node executes a Python script which is included in the skeleton.
The script uses dictionary for dialog options and [Pandas](http://pandas.pydata.org/) DataFrames as input and output.

This archetype was made because the instructions to create Knime nodes at https://tech.knime.org/developer-guide, requires interaction with Eclipse wizards. We wanted a way to start and perform node development from the command line and headless.
Knime nodes are Eclipse plugins. The [Tycho](https://eclipse.org/tycho/) Maven plugin is used to build and handle dependencies of Eclipse plugins, so we use Tycho for Knime node building.

The [Maven archetype](https://maven.apache.org/guides/introduction/introduction-to-archetypes.html) will generate a multi-module project with the following structure:

* / - parent Maven project
* /plugin/ - code for Knime node
* /tests/ - tests of Knime node
* /feature/ - eclipse feature
* /p2/ - eclipse update site

The Knime node will execute a Python script called `/plugin/src/<package>/<python script file name>.py`.

See https://github.com/3D-e-Chem/knime-python-wrapper for more information how the Python Wrapper node works.

## Requirements

* Java >=1.8
* Maven >=3.0

## Generate

1. Execute
```
mvn archetype:generate -DarchetypeGroupId=nl.esciencecenter \
-DarchetypeArtifactId=knime-python-node-archetype \
-DarchetypeVersion=1.2.1 \
-DarchetypeRepository=https://dl.bintray.com/nlesc/knime-python-node-archetype
```
2. Enter the groupId
3. Enter the artifactId
4. Enter the name of the package under which your code will be created
5. Enter the version of your project
6. Enter the Github organization name or Github username
7. Enter the Github repository name
8. Enter the Knime node name
9. Enter the Python script file name (must be given without .py extension)
10. Enter the required Python package name
11. Confirm
12. Change directory to generated code.
13. Fill in all placeholders (`[Enter ... here.]`) in

    * plugin/META-INF/MANIFEST.MF
    * plugin/src/**/*.xml
    * feature/feature.xml
    * p2/category.xml


Further instructions about generated project can be found in it's README.md file.

## New release

1. Adjust version in pom.xml
2. Update CHANGELOG.md & README.md
3. Commit & push
4. Create Github release
5. Deploy to Bintray, see Deploy chapter below

### Deploy

To deploy current version to Bintray.

1. Add bintray API key to [~/.m2/settings.xml](https://maven.apache.org/settings.html)

```
<server>
    <id>bintray-nlesc-knime-python-node-archetype</id>
    <username>************</username>
    <password>********************************</password>
</server>
```

2. Run `mvn deploy`

## Attribution

The https://github.com/3D-e-Chem/tycho-knime-node-archetype was used as a starting point of this archetype.
