#!/bin/bash

# Change value of environment variable in the Dockrfile to build different versions of reviews image

if [ "$1" = "v1" ]
then
        sudo docker build --no-cache -t beopenit/reviews:v1 .
        sudo docker push beopenit/reviews:v1
fi
if [ "$1" = "v2" ]
then
        sudo docker build --no-cache -t beopenit/reviews:v2 .
        sudo docker push beopenit/reviews:v2
fi

if [ "$1" = "v3" ]
then
        sudo docker build --no-cache -t beopenit/reviews:v3 .
        sudo docker push beopenit/reviews:v3
fi

