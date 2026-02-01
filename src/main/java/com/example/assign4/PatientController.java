package com.example.assign4;

import com.example.assign4.Patient;
import com.example.assign4.PatientRepos;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/patients")
public class PatientController {

    private final PatientRepos repository;

    public PatientController(PatientRepos repository) {
        this.repository = repository;
    }

    @GetMapping
    public List<Patient> getAll() {
        return repository.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Patient> getById(@PathVariable Long id) {
        return repository.findById(id);
    }

    @PostMapping
    public Patient create(@RequestBody Patient patient) {
        return repository.save(patient);
    }

    @DeleteMapping("/{id}")
    public String delete(@PathVariable Long id) {
        repository.deleteById(id);
        return "Patient with id " + id + " deleted";
    }
}
