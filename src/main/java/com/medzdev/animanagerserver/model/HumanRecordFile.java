package com.medzdev.animanagerserver.model;

import jakarta.persistence.*;
import org.hibernate.annotations.GenericGenerator;

@Entity
public abstract class HumanRecordFile {
    @Id
    @GeneratedValue(generator="increment")
    @GenericGenerator(name="increment", strategy = "increment")
    private long recordID;


}
