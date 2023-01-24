package com.patientRecordsapi.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@ToString
public class Patient {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    @Column(name = "ID")
    private Long id;
    @Column(name = "PATIENT_NAME")
    private String patientName;
    @Column(name = "AGE")
    private int age;
    @Column(name = "SEX")
    private String patientSex;
    @Column(name = "BLOOD_TYPE")
    private String patientBloodType;

    List<Patient> patient;

}
