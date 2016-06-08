#!/bin/bash

PATH=/opt/jdk1.8.0_65/bin:$PATH
export PATH

javac -source 1.7 -target 1.7  *.java
#java LinkerTester base 1 2

