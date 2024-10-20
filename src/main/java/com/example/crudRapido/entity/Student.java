package com.example.crudRapido.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "tbl_student")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long studentId;
    private String firstName;
    private String lastname;
    @Column(name = "email_address",unique = true)
    private String email;



}
