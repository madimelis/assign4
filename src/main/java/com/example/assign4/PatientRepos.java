package com.example.assign4;

import com.example.assign4.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PatientRepos extends JpaRepository<Patient, Long> {
}
