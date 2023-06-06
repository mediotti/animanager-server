package com.medzdev.animanagerserver.entities;


import com.fasterxml.jackson.annotation.JsonIgnore;
import com.medzdev.animanagerserver.entities.dto.RequestPatientDTO;
import com.medzdev.animanagerserver.repositories.InformationRecordsRepository;
import com.medzdev.animanagerserver.service.InformationRecordsService;
import jakarta.persistence.*;
import lombok.*;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.UUID;

@Table(name = "patient")
@Entity(name = "patient")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
@ToString
public class Patient {
    @Id @GeneratedValue(strategy = GenerationType.UUID)
    private UUID    id;
    private String  animalname;
    private String  animalbreed;
    private String  animalsex;
    private String  animalspecies;
    private String  animaldateofbirthorestimatedage;

    private Boolean medicalneutered;
    private String  medicalvaccinationrecord;
    private String  medicalproceduresrecord;

    @JsonIgnore()
    @ManyToOne
    @JoinColumn(name = "caregiver_id")
    private InformationRecords caregiver;

    public Patient(RequestPatientDTO data, InformationRecords caregiver_obj){
        this.animalname = data.animalname();
        this.animalbreed = data.animalbreed();
        this.animalsex = data.animalsex();
        this.animalspecies = data.animalspecies();
        this.animaldateofbirthorestimatedage = data.animaldateofbirthorestimatedage();
        this.medicalneutered = data.medicalneutered();
        this.medicalvaccinationrecord = data.medicalvaccinationrecord();
        this.medicalproceduresrecord = data.medicalproceduresrecord();
        this.caregiver = caregiver_obj;
    }

    public Patient(RequestPatientDTO data){
        this.animalname = data.animalname();
        this.animalbreed = data.animalbreed();
        this.animalsex = data.animalsex();
        this.animalspecies = data.animalspecies();
        this.animaldateofbirthorestimatedage = data.animaldateofbirthorestimatedage();
        this.medicalneutered = data.medicalneutered();
        this.medicalvaccinationrecord = data.medicalvaccinationrecord();
        this.medicalproceduresrecord = data.medicalproceduresrecord();
    }

    public InformationRecords getCaregiver() {
        return caregiver;
    }

    public void setCaregiver(InformationRecords caregiver) {
        this.caregiver = caregiver;
    }
}
