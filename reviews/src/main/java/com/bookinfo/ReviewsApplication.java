package com.bookinfo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

import java.time.Duration;


@SpringBootApplication
public class ReviewsApplication {
    @Value("${star_color}")
    private String star_color;
    @Bean
    public RestTemplate restTemplate(RestTemplateBuilder builder) {
        return builder
                .setConnectTimeout(Duration.ofSeconds(star_color.equals("black")?10000:2500))
                .setReadTimeout(Duration.ofSeconds(star_color.equals("black")?10000:2500))
                .build();
    }
    public static void main(String[] args) {
        SpringApplication.run(ReviewsApplication.class, args);
    }

}
