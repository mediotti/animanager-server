package com.medzdev.animanagerserver.repositories;

import com.medzdev.animanagerserver.entities.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface PatientsRepository extends JpaRepository<Patient, UUID> {
}
