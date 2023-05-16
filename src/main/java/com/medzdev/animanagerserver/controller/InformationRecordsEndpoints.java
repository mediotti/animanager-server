package com.medzdev.animanagerserver.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InformationRecordsEndpoints {
    @GetMapping("/information_records")
    public String getAllRecords(){
        return "All records";
    }
}
