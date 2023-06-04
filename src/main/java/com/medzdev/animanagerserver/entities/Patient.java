package com.medzdev.animanagerserver.entities;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.UUID;


@Table(name = "patient")
@Entity(name = "patient")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Patient {
    @Id @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    private String animalname;
    private String animalbreed;
    private String animalrace;
    private String animalsex;
    private String animalspecies;
    private String animaldateofbirthorestimatedage;

    private Boolean medicalneutered;
    private String medicalvaccinationrecord;
    private String medicalproceduresrecord;

     private InformationRecords caregiver;
}
