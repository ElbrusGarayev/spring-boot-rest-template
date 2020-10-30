package com.ibar.springbootexternalapi.controller;

import com.ibar.springbootexternalapi.entity.ApiResponse;
import com.ibar.springbootexternalapi.service.ApiService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class ApiController {

    private final ApiService apiService;

    @GetMapping
    public String getJson(){
        return apiService.getFromApi();
    }

    @GetMapping("own")
    public ResponseEntity<ApiResponse> getWithOwnEntity(){
        return apiService.getWithOwnEntity();
    }
}
