package com.patientRecordsapi.repository;

import com.patientRecordsapi.model.Patient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PatientRecordRepository extends JpaRepository<Patient, Long> {
}
