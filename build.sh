#!/bin/bash

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
