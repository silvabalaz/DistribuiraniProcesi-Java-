#!/bin/bash

PATH=/opt/jdk1.8.0_65/bin:$PATH
export PATH

javac *.java
java NameServer

