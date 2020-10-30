package com.ibar.springbootexternalapi.service;

import com.ibar.springbootexternalapi.entity.ApiResponse;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
@RequiredArgsConstructor
public class ApiService {

    @Value("${apiUrl}")
    private String apiUrl;

    private final RestTemplate restTemplate;

    public String getFromApi(){
        return restTemplate.getForObject(apiUrl, String.class);
    }

    @HystrixCommand(fallbackMethod = "defaultMethod")
    public ResponseEntity<ApiResponse> getWithOwnEntity(){
        return restTemplate.getForEntity(apiUrl, ApiResponse.class);
    }

    private ResponseEntity<ApiResponse> defaultMethod() {
        return ResponseEntity.ok(new ApiResponse());
    }
}
