#!/bin/sh


#repeat part of path
sp="src/main/java/"
#path to libs
libs="./libs/commons-lang3-3.11.jar"


#compile
echo "Compile..."
javac -sourcepath ${sp} -d build/classes/ -cp ${libs} ${sp}com/alevel/console/Main.java


#run
echo "Start program.."
echo ""

java -cp build/classes:${libs} com.alevel.console.Main
