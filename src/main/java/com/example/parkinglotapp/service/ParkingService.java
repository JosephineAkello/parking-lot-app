package com.example.parkinglotapp.service;


import java.util.List;

import com.example.parkinglotapp.model.VehicleDTO;

public interface ParkingService {

    List<VehicleDTO> getAllVehicles();
    String park(VehicleDTO vehicleDTO);
    String unpark(Long id);
}
