package com.medzdev.animanagerserver.entities;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface PatientsRepository extends JpaRepository<Patient, UUID> {
}
