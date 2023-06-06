package com.medzdev.animanagerserver.config;

import com.medzdev.animanagerserver.entities.InformationRecords;
import com.medzdev.animanagerserver.entities.Patient;
import com.medzdev.animanagerserver.repositories.InformationRecordsRepository;
import com.medzdev.animanagerserver.entities.Role;
import com.medzdev.animanagerserver.repositories.PatientsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.util.Arrays;
import java.util.UUID;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {
    @Autowired
    private InformationRecordsRepository informationRecordsRepository;

    @Autowired
    private PatientsRepository patientsRepository;

    @Override
    public void run(String... args) throws Exception {
        InformationRecords ir1 = new InformationRecords(null, Role.CAREGIVER, "Gabriel", "Mediotti", "11999999999", "99999999999", "99999999", "845, ap92", null);
        InformationRecords ir2 = new InformationRecords(null, Role.EMPLOYEE, "Giulia", "Pugliesi", "11999999999", "89999999999", "99999999", "81", null);
        informationRecordsRepository.saveAll(Arrays.asList(ir1, ir2));

        Patient pt1 = new Patient(null, "Brutus", "Bulldogue Inglês", "Macho", "Cachorro", "4 anos", true, "none", "none", ir1);
        Patient pt2 = new Patient(null, "Luna", "Poodle", "Macho", "Cachorro", "4 anos", true, "none", "none", ir2);
        patientsRepository.saveAll(Arrays.asList(pt1, pt2));
    }
}
