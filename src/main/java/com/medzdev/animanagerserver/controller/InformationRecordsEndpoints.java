package com.medzdev.animanagerserver.controller;

import com.medzdev.animanagerserver.Roles;
import com.medzdev.animanagerserver.model.InformationRecords;
import com.medzdev.animanagerserver.model.RequestInformationRecordsDTO;
import com.medzdev.animanagerserver.model.InformationRecordsRepository;
import com.medzdev.animanagerserver.model.ResponseInformationRecordsDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping
public class InformationRecordsEndpoints {
    @Autowired
    private InformationRecordsRepository repository;

    @PostMapping("/information_records")
    public void postInformationRecords(@RequestBody RequestInformationRecordsDTO data){
        InformationRecords informationRecords = new InformationRecords(data);
        repository.save(informationRecords);
    }

    @GetMapping("/information_records")
    public List<ResponseInformationRecordsDTO> getInformationRecords(@RequestParam(required = false) Roles role_param){
        if (role_param != null){
            return repository.findAll().stream().map(ResponseInformationRecordsDTO::new).toList();
        }

        return repository.findAll().stream().map(ResponseInformationRecordsDTO::new).toList();
    }



}
