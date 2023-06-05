package com.sumit.hotel.service.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/staff")
public class StaffController {

    public ResponseEntity<List<String >> getStaff(){
        List<String> list = Arrays.asList("sumti", "amti", "shubhangi", "shreya");
        return new ResponseEntity<>(list, HttpStatus.OK);
    }
}
