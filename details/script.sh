#!/bin/bash
sudo docker build --no-cache -t beopenit/details:v1 .
sudo docker push beopenit/details:v1
