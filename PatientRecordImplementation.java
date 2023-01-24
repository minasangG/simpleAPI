package com.patientRecordsapi.service;

import com.patientRecordsapi.model.Patient;
import com.patientRecordsapi.repository.PatientRecordRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PatientRecordImplementation implements PatientRecordService {

    @Autowired
    private PatientRecordRepository patientRecordRepository;

    @Override
    public Patient save(Patient patient) {
        return patientRecordRepository.save(patient);
    }

    @Override
    public Patient findById(Long patientId) {
        return patientRecordRepository.findById(patientId).get();
    }

    @Override
    public List<Patient> findAllPatients() {
        return patientRecordRepository.findAll();
    }
}
