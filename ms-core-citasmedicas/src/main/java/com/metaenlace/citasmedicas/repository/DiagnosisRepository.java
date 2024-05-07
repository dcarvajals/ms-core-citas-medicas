package com.metaenlace.citasmedicas.repository;

import com.metaenlace.citasmedicas.model.Diagnosis;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DiagnosisRepository extends JpaRepository<Diagnosis, Integer> {
}