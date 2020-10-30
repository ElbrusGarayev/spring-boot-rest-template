package com.ibar.springbootexternalapi.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

@Data
public class Manufacturer {

    @JsonProperty("Country")
    private String country;
    @JsonProperty("Mfr_ID")
    private String id;
    @JsonProperty("Mfr_Name")
    private String name;
    @JsonProperty("VehicleTypes")
    private List<VehicleType> vehicleTypes;
}
