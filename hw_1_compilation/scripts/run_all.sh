#!/bin/sh

#please enter ". ./run_all.sh" to start

#run from console
cd ../java/console/
./run.sh

#run with ant
cd ../ant/
. ./run.sh

#run with mvn
cd ../maven/
./run.sh
