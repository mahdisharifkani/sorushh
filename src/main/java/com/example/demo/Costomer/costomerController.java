package com.example.demo.Costomer;

import com.example.demo.Driver.Driver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping(path = "api/v1/costomer")
public class costomerController {

    private final costomerService costomerService;


    @Autowired
    public costomerController(com.example.demo.Costomer.costomerService costomerService) {
        this.costomerService = costomerService;
    }

    @GetMapping
    public List<Costomer> getCostomer(){
        return costomerService.getCostomer();

    }

}
