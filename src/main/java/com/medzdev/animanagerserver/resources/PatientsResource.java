package com.medzdev.animanagerserver.resources;

import com.medzdev.animanagerserver.entities.InformationRecords;
import com.medzdev.animanagerserver.entities.Patient;
import com.medzdev.animanagerserver.entities.dto.RequestPatientDTO;
import com.medzdev.animanagerserver.service.InformationRecordsService;
import com.medzdev.animanagerserver.service.PatientsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.UUID;

@RestController
@RequestMapping(value = "/animanager/patients")
public class PatientsResource {
    @Autowired
    private PatientsService patientsService;
    @Autowired
    private InformationRecordsService informationRecordsService;

    @GetMapping
    public ResponseEntity<List<Patient>> findAll(){
        return ResponseEntity.ok().body(patientsService.findAll());
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Patient> findById(@PathVariable UUID id){
        return ResponseEntity.ok().body(patientsService.findById(id));
    }

    @PostMapping()
    public ResponseEntity<String> insert(@RequestBody RequestPatientDTO dto) {
        InformationRecords caregiver_obj;
        try {
            caregiver_obj = informationRecordsService.findById(dto.caregiver());
        } catch (NoSuchElementException exception) {
            System.out.println("That UUID wasn't found.");
            return ResponseEntity.status(404).body("The UUID wasn't found.");
        }

        Patient obj = new Patient(dto, caregiver_obj);
        patientsService.insert(obj);
        return ResponseEntity.ok().body(obj.toString());
    }

}
