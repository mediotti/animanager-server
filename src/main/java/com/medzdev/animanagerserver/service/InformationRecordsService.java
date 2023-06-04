package com.medzdev.animanagerserver.service;

import com.medzdev.animanagerserver.entities.InformationRecords;
import com.medzdev.animanagerserver.entities.InformationRecordsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class InformationRecordsService {

    @Autowired
    private InformationRecordsRepository informationRecordsRepository;

    public List<InformationRecords> findAll(){
        return informationRecordsRepository.findAll();
    }

    public InformationRecords findById(UUID id){
        Optional<InformationRecords> result_obj = informationRecordsRepository.findById(id);
        return result_obj.get();
    }

    public InformationRecords insert(InformationRecords obj){
        return informationRecordsRepository.save(obj);
    }
}
