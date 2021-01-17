package com.example.parkinglotapp.contoller;

import java.util.List;

import com.example.parkinglotapp.model.MyIntroduction;
import com.example.parkinglotapp.model.VehicleDTO;
import com.example.parkinglotapp.service.ParkingService;
import lombok.Builder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("parkinglot")
@Builder
public class ParkingLotController {

    @Autowired
    private ParkingService parkingService;

//    @GetMapping("/aboutme")
//    public MyIntroduction aboutMe(){
//        return  MyIntroduction.builder().name("Jos").age(10).skills("Java -Spring").build();
//    }
//
//    @PostMapping("/infoAboutSomeone")
//    public MyIntroduction infoAboutSomeone(String name, int age, String skills){
//        return  MyIntroduction.builder().name(name).age(age).skills(skills).build();
//    }

    @GetMapping("/parkingInfo")
    public List<VehicleDTO> getVehicles(){
        return parkingService.getAllVehicles();
    }

    @PostMapping("/park")
    public String parkvehicles(VehicleDTO vehicleDTO){
        return parkingService.park(vehicleDTO);
    }

    @DeleteMapping("/unpark")
    public String  unparkvehicles(Long id){
        return parkingService.unpark(id);
    }
}
