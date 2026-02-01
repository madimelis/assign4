package com.example.assign4;

import com.example.assign4.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DoctorRepos extends JpaRepository<Doctor, Long> {
}
