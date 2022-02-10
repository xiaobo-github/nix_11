#!/bin/sh

#repeat part of path
rp="src/main/java/"
#path to libs
libs="./libs/commons-lang3-3.11.jar"

#compile
echo "Compile..."
javac -sourcepath ${rp} -d build/classes/ -cp ${libs} ${rp}com/alevel/console/Main.java

#run
echo "Start program.."
echo ""
java -cp build/classes:${libs} com.alevel.console.Main


