#!/bin/bash

PATH=/opt/jdk1.8.0_65/bin:$PATH
export PATH


host_list = "gaspar13@pr5-06 gaspar13@pr5-04"
j = 0
for h in $host_list
do
   ssh $h '
    /.home/student1/gaspar13/public_html/dprojekt
   javac *.java
   java LinkerTester base i 2'
   let " i = i+1 "
done

