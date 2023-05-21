package com.medzdev.animanagerserver.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
enum role {
    animal,
    caregiver,
    employee;
}

@RestController
public class InformationRecordsEndpoints {
    
    @GetMapping("/information_records")
    public String getInformationRecords(@RequestParam(required = false) role role_param){
        return "Those are the " + role_param + " information records";
    }
}
