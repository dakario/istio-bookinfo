package com.bookinfo.client.impl;

import com.bookinfo.client.ReviewsClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class ReviewsClientImpl implements ReviewsClient {
    @Autowired
    private RestTemplate restTemplate;
    @Value("${reviewsHostname}")
    private String reviewsHostname;

    @Override
    public List<Object> getReviews(int idProduct) throws RestClientException {
        ResponseEntity<Object[]> responseEntity = restTemplate.getForEntity(reviewsHostname + "/reviews/" + idProduct, Object[].class);
        Object[] reviews = responseEntity.getBody();
        return (reviews !=null)? Arrays.asList(reviews):new ArrayList<>();
    }
}
