package com.patientRecordsapi.service;


import com.patientRecordsapi.model.Patient;

import java.util.List;

public interface PatientRecordService {

    Patient save(Patient patient);

    Patient findById(Long patientId);

    List<Patient> findAllPatients();


}
