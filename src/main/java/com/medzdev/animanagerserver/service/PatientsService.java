package com.medzdev.animanagerserver.service;

import com.medzdev.animanagerserver.entities.InformationRecords;
import com.medzdev.animanagerserver.entities.Patient;
import com.medzdev.animanagerserver.repositories.PatientsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class PatientsService {

    @Autowired
    private PatientsRepository patientsRepository;

    public List<Patient> findAll(){
        return patientsRepository.findAll();
    }

    public Patient findById(UUID id){
        Optional<Patient> result_obj = patientsRepository.findById(id);
        return result_obj.get();
    }

    public Patient insert(Patient obj){
        return patientsRepository.save(obj);
    }

    public Patient insert(Patient obj, InformationRecords caregiver_obj){
        obj.setCaregiver(caregiver_obj);
        return patientsRepository.save(obj);
    }
}
