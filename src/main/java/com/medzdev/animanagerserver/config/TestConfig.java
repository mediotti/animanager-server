package com.medzdev.animanagerserver.config;

import com.medzdev.animanagerserver.entities.InformationRecords;
import com.medzdev.animanagerserver.entities.InformationRecordsRepository;
import com.medzdev.animanagerserver.entities.Role;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.util.Arrays;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {
    @Autowired
    private InformationRecordsRepository informationRecordsRepository;

    @Override
    public void run(String... args) throws Exception {
        InformationRecords ir1 = new InformationRecords("Gabriel", "Mediotti", "11999999999", "99999999999", Role.CAREGIVER, "99999999", "845, ap92");
        InformationRecords ir2 = new InformationRecords("Giulia", "Pugliesi", "11999999999", "89999999999", Role.EMPLOYEE, "99999999", "81");
        informationRecordsRepository.saveAll(Arrays.asList(ir1, ir2));
    }
}
