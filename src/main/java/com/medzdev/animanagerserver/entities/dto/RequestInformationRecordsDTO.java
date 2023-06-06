package com.medzdev.animanagerserver.entities.dto;

import com.medzdev.animanagerserver.entities.Role;

public record RequestInformationRecordsDTO(String first_name, String last_name, String phone_number, String ssn, Role record_role, String zip_code, String address_complements) {
}