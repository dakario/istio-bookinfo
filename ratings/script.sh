#!/bin/bash
sudo docker build --no-cache -t beopenit/ratings:v1 .
sudo docker push beopenit/ratings:v1
