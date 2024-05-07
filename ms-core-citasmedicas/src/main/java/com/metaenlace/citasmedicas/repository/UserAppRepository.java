package com.metaenlace.citasmedicas.repository;

import com.metaenlace.citasmedicas.model.UserApp;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserAppRepository extends JpaRepository<UserApp, Integer> {
}