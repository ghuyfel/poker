#!/bin/bash

echo "INSTALLING JAVA OPENJDK 8"

if ! sudo apt update && sudo apt install openjdk-8-jdk ; then
    echo -e "FAILED INSTALLING JAVA OPENJDK 8"
    exit 1
fi

echo "INSTALLING GRADLE"

if ! sudo snap install gradle --classic; then
    echo -e "FAILED TO INSTALL GRADLE"
    exit 1
fi

echo "BUILDING PROJECT"

if ! gradle clean && gradle build ; then
   echo -e "FAILED TO BUILD PROJECT"
   exit 1
fi

echo "TESTING PROJECT"

if ! gradle test; then
  echo -e "FAILED TO TEST PROJECT"
  exit 1
fi

echo "GENERATING EXECUTABLE"
if ! gradle jar; then
  echo -e "FAILED TO GENERATE EXECUTABLE"
fi

echo "RUNNING GAME...\n\n"
if ! java -jar build/libs/poker-1.0.jar ; then
  echo -e "FAILED TO RUN THE GAME"
fi
