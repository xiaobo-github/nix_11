#!/bin/sh

#repeat part of path
rp="src/main/java/"
lp="./libs/"
#path to libs
lclVersion="3.11"
lcl="commons-lang3-${lclVersion}.jar"
lfjVersion="1.9"
lfj="commons-text-${lfjVersion}.jar"
libs=${lp}${lcl}":"${lp}${lfj}

echo ${libs}

#compile
echo "Compile from console..."
javac -sourcepath ${rp} -d build/classes/ -cp ${libs} ${rp}com/alevel/console/Main.java

#run
echo "Program run..."
echo ""
java -cp build/classes:${libs} com.alevel.console.Main

