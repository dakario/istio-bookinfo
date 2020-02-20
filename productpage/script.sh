#!/bin/bash
sudo docker build --no-cache -t beopenit/productpage:v1 .
sudo docker push beopenit/productpage:v1
