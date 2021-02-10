#!/bin/bash


if ! sudo apt update && sudo apt install openjdk-8-jdk ; then
    echo -e "FAILED INSTALLING JAVA OPENJDK 8"
    exit 1
fi

echo "INSTALLING GRADLE"

if ! sudo snap install gradle --classic; then
    echo -e "FAILED TO INSTALL GRADLE"
    exit 1
fi

