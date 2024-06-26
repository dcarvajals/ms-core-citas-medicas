package com.metaenlace.citasmedicas.repository;

import com.metaenlace.citasmedicas.model.Quote;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface QuoteRepository extends JpaRepository<Quote, Integer> {
}