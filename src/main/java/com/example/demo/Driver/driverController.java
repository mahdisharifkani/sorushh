package com.example.demo.Driver;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping(path = "api/v1/driver")
public class driverController {

    private final driverService driverService;


    @Autowired
    public driverController(com.example.demo.Driver.driverService driverService) {
        this.driverService = driverService;
    }

    @GetMapping
    public List<Driver> getdriver(){
        return driverService.getdriver();

    }
}
