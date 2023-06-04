package com.medzdev.animanagerserver.entities;

import java.util.UUID;

public record ResponsePatientDTO(UUID id, String animalName, String animalBreed, String animalRace, String animalSex, String animalSpecies, String animalDateOfBirthOrEstimatedAge, Boolean medicalNeutered, String medicalVaccinationRecord,String medicalProceduresRecord) {
    public ResponsePatientDTO(Patient patient){
        this(patient.getId(), patient.getAnimalname(), patient.getAnimalbreed(), patient.getAnimalrace(), patient.getAnimalsex(), patient.getAnimalspecies(), patient.getAnimaldateofbirthorestimatedage(), patient.getMedicalneutered(), patient.getMedicalvaccinationrecord(), patient.getMedicalproceduresrecord());
    }
}
