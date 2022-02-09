#!/bin/sh

#go to main directory
#cd ..

#repeat part of path
#console_source_path="src/main/java/"
#path to libs
#libs="libs/commons-lang3-3.11.jar"


#compile
echo "Compile..."
javac -sourcepath src/main/java/ -d build/classes/ -cp ./libs/commons-lang3-3.11.jar src/main/java/com/alevel/console/Main.java


#run
echo "Start program.."
echo ""

java -cp build/classes:./libs/commons-lang3-3.11.jar com.alevel.console.Main
