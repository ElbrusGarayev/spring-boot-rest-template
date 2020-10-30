package com.ibar.springbootexternalapi.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class VehicleType {

    @JsonProperty("IsPrimary")
    private boolean isPrimary;
    @JsonProperty("Name")
    private String name;
}
