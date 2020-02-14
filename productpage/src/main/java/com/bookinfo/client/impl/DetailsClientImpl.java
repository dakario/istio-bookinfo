package com.bookinfo.client.impl;

import com.bookinfo.client.DetailsClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

@Service
public class DetailsClientImpl implements DetailsClient {
    @Autowired
    private RestTemplate restTemplate;
    @Value("${detailsHostname}")
    private String detailsHostname;

    @Override
    public Object getDetail(int idProduct) throws RestClientException {
        ResponseEntity<Object> responseEntity = restTemplate.getForEntity(detailsHostname + "/details/" +idProduct, Object.class);
        return responseEntity.getBody();
    }
}
