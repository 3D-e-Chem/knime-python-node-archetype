# Change Log
All notable changes to this project will be documented in this file.
This project adheres to [Semantic Versioning](http://semver.org/).
The file is formatted as described on http://keepachangelog.com/.

## [Unreleased]

## [2.0.0] - 2019-07-03

### Added

* CITATION.cff and .zenodo.json files, for better citation support

### Changed

* Requires KNIME version 4 ([#2](https://github.com/3D-e-Chem/knime-python-node-archetype/issues/2))
* Switched from KNIME SDK to Eclipse + target platform
* Source jars for plugin have been replaced with source reference in MANIFEST.MF

## [1.4.0] - 2018-02-07

Synced with [tycho-knime-node-archetype v1.5.0](https://github.com/3D-e-Chem/tycho-knime-node-archetype/releases/tag/v1.5.0).

### Changed

* Upgraded to v2.0.1 of nl.esciencecenter.e3dchem.python.plugin, which allows for running nodes in either Python version 2 or 3

## [1.3.0] - 2017-03-09

Synced with [tycho-knime-node-archetype v1.4.0](https://github.com/3D-e-Chem/tycho-knime-node-archetype/releases/tag/v1.4.0).

## [1.2.2] - 2017-01-24

### Added

* Instruction to add generated repo to 3D-e-Chem KNIME feature

## [1.2.1] - 2016-07-12

### Changed

* Templatify KNIME test workflow
* Process Travis-CI config file by template engine
* Improved development instructions

## [1.2.0] - 2016-07-11

Initial release

Forked from https://github.com/3D-e-Chem/tycho-knime-node-archetype

### Changed

* Refactored KNIME node to a Python Wrapper node (https://github.com/3D-e-Chem/knime-python-wrapper)
