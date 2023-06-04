//package com.medzdev.animanagerserver.resources;
//
//import com.medzdev.animanagerserver.Roles;
//import com.medzdev.animanagerserver.entities.*;
//import com.medzdev.animanagerserver.service.InformationRecordsService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.List;
//
//@RestController
//@RequestMapping
//public class InformationRecordsEndpoints {
//    @Autowired
//    private InformationRecordsRepository repository;
//    @Autowired
//    private InformationRecordsService informationRecordsService;
//    @Autowired
//    private PatientsRepository patientsRepository;
//
//    @CrossOrigin(origins = "*", allowedHeaders = "*")
//    @PutMapping ("/animanager/information_records")
//    public ResponseEntity postInformationRecords(@RequestBody RequestInformationRecordsDTO data){
//        InformationRecords informationRecords = new InformationRecords(data);
//        repository.save(informationRecords);
//        return ResponseEntity.ok("Nova ficha inserida");
//    }
//
//    @CrossOrigin(origins = "*", allowedHeaders = "*")
//    @GetMapping("/animanager/information_records")
//    public List<ResponseInformationRecordsDTO> getInformationRecords(@RequestParam(required = false) Roles role_param){
//        return repository.findAll().stream().map(ResponseInformationRecordsDTO::new).toList();
//    }
//
//    @CrossOrigin(origins = "*", allowedHeaders = "*")
//    @GetMapping("/animanager/patients")
//    public List<ResponsePatientDTO> getPatients(){
//        return patientsRepository.findAll().stream().map(ResponsePatientDTO::new).toList();
//    }
//
//
//
//
//
//}
