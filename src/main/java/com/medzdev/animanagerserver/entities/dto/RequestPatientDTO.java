package com.medzdev.animanagerserver.entities.dto;

import java.util.UUID;

public record RequestPatientDTO(String animalname, String animalbreed, String animalsex, String  animalspecies, String  animaldateofbirthorestimatedage, Boolean medicalneutered, String  medicalvaccinationrecord, String  medicalproceduresrecord, UUID caregiver) {
}
