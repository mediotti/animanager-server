package com.medzdev.animanagerserver.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InformationRecordsEndpoints {
    @GetMapping("/information_records")
    public String getRecords(@RequestParam(required = false) String id){
        return "ID: " + id;
    }

    @GetMapping("/information_records/animals")
    public String getAnimalRecords(@RequestParam(required = false) String id){
        return "Animal Record ID: " + id;
    }
}
