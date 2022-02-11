#!/bin/sh

#repeat part of path
rp="src/main/java/"
lp="./libs/"
jp="build/jar/"
#path to libs
lclVersion="3.11"
lcl="commons-lang3-${lclVersion}.jar"
lctVersion="1.9"
lct="commons-text-${lctVersion}.jar"
libs=${lp}${lcl}":"${lp}${lct}
programName="Main.jar"

#compile
echo "Compile from console..."
javac -sourcepath ${rp} -d build/classes/ -cp ${libs} ${rp}com/alevel/console/Main.java

#create jar
echo "Create jar..."
mkdir -p build/jar/
jar cfm ${jp}${programName} MANIFEST.MF -C build/classes/ .
cp libs/${lcl} build/jar
cp libs/${lct} build/jar

#run
echo "Program run..."
echo ""
java -jar ${jp}${programName}

