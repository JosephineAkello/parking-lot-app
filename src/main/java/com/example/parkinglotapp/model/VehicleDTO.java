package com.example.parkinglotapp.model;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class VehicleDTO {

    @Id
    private Long id;
    private String vehicleNumber;
    private String ownerName;

}
