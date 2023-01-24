package com.patientRecordsapi.controller;

import com.patientRecordsapi.model.Patient;
import com.patientRecordsapi.service.PatientRecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "api/patientRecords")
public class PatientRecordController {

    @Autowired
    private PatientRecordService patientRecordService;

    //    public PatientRecordController(PatientRecordService patientRecordService) {
//        this.patientRecordService = patientRecordService;
//    }

    @GetMapping
    public List<Patient> findAll() {
        return patientRecordService.findAllPatients();
    }

    @GetMapping("{id}")
    public Patient findById(@PathVariable("id") Long PatientId) {
        return patientRecordService.findById(PatientId);
    }

    @PostMapping
    public Patient save(@RequestBody Patient patient) {
        return patientRecordService.save(patient);
    }

}
