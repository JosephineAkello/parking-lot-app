package com.example.parkinglotapp.repository;

import com.example.parkinglotapp.model.VehicleDTO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ParkingRepository extends JpaRepository<VehicleDTO, Long> {
}

