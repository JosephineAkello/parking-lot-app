package com.example.parkinglotapp.contoller;

import com.example.parkinglotapp.model.MyIntroduction;
import lombok.Builder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Builder
public class ParkingLotController {

    @GetMapping("/aboutme")
    public MyIntroduction aboutMe(){
        return  MyIntroduction.builder().name("Jos").age(10).skills("Java -Spring").build();
    }

    @PostMapping("/infoAboutSomeone")
    public MyIntroduction infoAboutSomeone(String name, int age, String skills){
        return  MyIntroduction.builder().name(name).age(age).skills(skills).build();
    }

}
