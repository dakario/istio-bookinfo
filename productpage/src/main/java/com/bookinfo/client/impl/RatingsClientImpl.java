package com.bookinfo.client.impl;

import com.bookinfo.client.RatingsClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class RatingsClientImpl implements RatingsClient {
    @Autowired
    private RestTemplate restTemplate;
    @Value("${ratingsHostname}")
    private String ratingsHostname;

    @Override
    public Object getRatings(int idProduct) {
        return null;
    }
}
