#!/bin/bash

PATH=/opt/jdk1.8.0_65/bin:$PATH
export PATH
i=$1
N=$2
h=$3
ssh $h << EOF
	   cd /.home/student1/gaspar13/public_html/dprojekt
	   java LinkerTester base $i $N	
EOF
$SHELL


