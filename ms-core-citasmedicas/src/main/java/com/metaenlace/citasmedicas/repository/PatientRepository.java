package com.metaenlace.citasmedicas.repository;

import com.metaenlace.citasmedicas.model.Patient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PatientRepository extends JpaRepository<Patient, Integer> {
}