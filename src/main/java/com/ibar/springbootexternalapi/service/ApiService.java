package com.ibar.springbootexternalapi.service;

import com.ibar.springbootexternalapi.entity.ApiResponse;
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

    public ResponseEntity<ApiResponse> getWithOwnEntity(){
        ResponseEntity<ApiResponse> responseEntity = restTemplate.getForEntity(apiUrl, ApiResponse.class);
        return responseEntity;
    }
}
