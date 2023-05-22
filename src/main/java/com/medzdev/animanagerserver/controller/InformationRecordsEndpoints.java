package com.medzdev.animanagerserver.controller;

import com.medzdev.animanagerserver.Roles;
import com.medzdev.animanagerserver.model.InformationRecords;
import com.medzdev.animanagerserver.model.InformationRecordsDTO;
import com.medzdev.animanagerserver.model.InformationRecordsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Stream;

@RestController
@RequestMapping
public class InformationRecordsEndpoints {
    @Autowired
    private InformationRecordsRepository repository;
    @GetMapping("/information_records")
    public List<InformationRecordsDTO> getInformationRecords(@RequestParam(required = false) Roles role_param){
        return repository.findAll().stream().map(InformationRecordsDTO::new).toList();
    }
}
