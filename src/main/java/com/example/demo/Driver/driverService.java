package com.example.demo.Driver;

import com.example.demo.Costomer.Costomer;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Service
public class driverService {

    public List<Driver> getdriver(){
        return List.of(
                new Driver(
                        1L,
                        "Mahdi",
                        "16 GH 255 IR 12",
                        "Peride",
                        "09306325528",
                        LocalDate.of(2000, Month.MAY, 10)
        )

        );
    }
}
