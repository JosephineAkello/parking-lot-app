package com.example.parkinglotapp.model;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
//--Data creates getter and setters and all the lombok additional annotations
public class VehicleDTO {

    @Id
    private Long id;
    private String vehicleNumber;
    private String ownerName;

}
