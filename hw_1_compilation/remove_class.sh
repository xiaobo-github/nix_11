#!/bin/sh

#go to main directory
cd ..

find . -name "*.class" -type f -print0 | xargs -0 /bin/rm -f
echo "OK! Classes removed"
