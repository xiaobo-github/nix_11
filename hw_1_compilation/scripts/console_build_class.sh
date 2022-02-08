#!/bin/sh

#go to main directory
cd ..

#repeat part of path
#console_source_path="java/console/src/main/java/"
#path to libs
#libs="java/console/libs/commons-lang3-3.11.jar"


#compile
echo "Compile..."
javac -sourcepath java/console/src/main/java/ -d build/classes/ -cp ./java/console/libs/commons-lang3-3.11.jar java/console/src/main/java/com/alevel/console/Main.java


#run
echo "Start program.."
echo ""

java -cp build/classes:./java/console/libs/commons-lang3-3.11.jar:. com.alevel.console.Main
