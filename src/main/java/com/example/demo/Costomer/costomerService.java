package com.example.demo.Costomer;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class costomerService {

    public List<Costomer> getCostomer(){
        return List.of(
                new Costomer(
                        1L,
                        "Mahdi",
                        "09121234567",
                        "sadat abad",
                        "S.U.T")
        );
    }
}
